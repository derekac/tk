package com.treasure.v2.job;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import com.treasure.v2.dao.TbkCategoryGroupDAO;
import com.treasure.v2.dao.TbkGroupDAO;
import com.treasure.v2.dao.TbkPrefectItemDAO;
import com.treasure.v2.model.TbkCategoryGroup;
import com.treasure.v2.model.TbkGroup;
import com.treasure.v2.model.TbkPrefectItem;
import com.treasure.v2.service.TaobaoApiService;
import com.treasure.v2.util.HttpUtils;
import com.treasure.v2.util.RegexUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Created by derek on 4/24/17.
 */
@Component
public class UpdateJob {

    @Autowired
    private TbkPrefectItemDAO   tbkPrefectItemDAO;
    @Autowired
    private TbkCategoryGroupDAO tbkCategoryGroupDAO;


    public static Map<String, Integer> categoryGroupMap;

    private static Logger logger = LoggerFactory.getLogger(UpdateJob.class);


    @Autowired
    private TaobaoApiService taobaoApiService;


    public void init() {
        List<TbkCategoryGroup> tbkGroups = tbkCategoryGroupDAO.selectAllCategoryGroup();
        categoryGroupMap = Maps.newHashMap();
        for (TbkCategoryGroup tbkGroup : tbkGroups) {
            categoryGroupMap.put(tbkGroup.getCategoryName(), tbkGroup.getGroupId());
        }
    }

    @Scheduled(cron = "0 * * * * ?")
    public void update() {
        logger.info("开始启动更新宝贝服务");
        int pageNo   = 0;
        int pageSize = 500;
        while (true) {
            init();
            List<TbkPrefectItem> ret = tbkPrefectItemDAO.selectByItemsPage(pageNo, pageSize);
            pageNo++;
            if (CollectionUtils.isEmpty(ret)) {
                break;
            }
            for (TbkPrefectItem item : ret) {
                boolean willUpdate = check(item);
                if (willUpdate) {
                    try {
                        tbkPrefectItemDAO.updateByPrimaryKeySelective(item);
                    } catch (Throwable e) {
                        logger.error("", e);
                    }
                }
            }
        }
        logger.info("结束更新宝贝服务");
        return;
    }

    private boolean check(TbkPrefectItem item) {
        boolean updateStatus = false;
        if (StringUtils.isEmpty(item.getWirelessShare())) {
            String wShare =
            taobaoApiService.getWirelessShare(item.getTitle(), item.getItemAdUrl(),
                    item.getTaobaoId(), item.getImgUrl());
            if (StringUtils.isNotEmpty(wShare)) {
                item.setWirelessShare(wShare);
                updateStatus = true;
            }
        }

        if (StringUtils.isEmpty(item.getShortUrl())) {
            // 链接需要使用广告链接
            String shorturl = getShortUrl(item.getTbkUrl());
            if (StringUtils.isNotEmpty(shorturl)) {
                item.setShortUrl(shorturl);
                updateStatus = true;
            }
        }
        if (StringUtils.isEmpty(item.getPreferPrice())) {
            String v1 = RegexUtils.regexString(item.getCouponsSummary(), "满(\\d+)元");
            String v2 = RegexUtils.regexString(item.getCouponsSummary(), "减(\\d+)元");
            String v3 = RegexUtils.regexString(item.getCouponsSummary(), "(\\d+)元无条件券");
            if (StringUtils.isNumeric(v1) && StringUtils.isNumeric(v2)) {
                if (item.getPrice() >= Double.parseDouble(v1)) {
                    item.setPreferPrice(String.format("%.2f", item.getPrice() - Double.parseDouble(v2)));
                } else {
                    item.setPreferPrice(String.format("店铺购物满%s元可以使用", v1));
                }
                updateStatus = true;
            }
            if (StringUtils.isNumeric(v3)) {
                item.setPreferPrice(String.format("%.0f", item.getPrice() - Double.parseDouble(v3)));
                updateStatus = true;
            }
        }
        Integer gid = null;
        if (categoryGroupMap.containsKey(item.getCatName())) {
            gid = categoryGroupMap.get(item.getCatName());
        } else {
            gid = 0;
        }
        if (!gid.equals(item.getGid())) {
            item.setGid(gid);
            logger.info("宝贝:{} 类目:{} 更新GID:{}", item.getItemId(), item.getCatName(), item.getGid());
            updateStatus = true;
        }
        return updateStatus;
    }

    public static String getShortUrl(String url) {

        String replaceurl = "http://tb.am/api.php?url_long=" + url;
        try {
            String     msg        = HttpUtils.crawl(replaceurl, 4000, "utf-8", "");
            JSONObject jsonObject = JSONObject.parseObject(msg);
            Thread.sleep(500L);
            return jsonObject.getString("shorturl");
        } catch (Exception e) {
            logger.error("", e);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(getShortUrl("http://item.taobao.com/item.htm?id=546774309990"));
    }

}
