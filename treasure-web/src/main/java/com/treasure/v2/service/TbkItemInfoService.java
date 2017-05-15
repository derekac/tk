package com.treasure.v2.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Joiner;
import com.taobao.api.domain.NTbkItem;
import com.treasure.v2.dao.TbkItemDetailDAO;
import com.treasure.v2.dao.TbkItemInfoApiDAO;
import com.treasure.v2.dao.TbkItemInfoDAO;
import com.treasure.v2.dao.TbkPrefectItemDAO;
import com.treasure.v2.model.TbkItemDetail;
import com.treasure.v2.model.TbkItemInfo;
import com.treasure.v2.model.TbkItemInfoApi;
import com.treasure.v2.model.TbkPrefectItem;
import com.treasure.v2.util.HttpUtils;
import com.treasure.v2.vo.PerfectItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by crow on 2017/4/24.
 */

@Service
public class TbkItemInfoService {
    private Logger logger = LoggerFactory.getLogger(TaobaoApiService.class);

    @Autowired
    private TaobaoApiService taobaoApiService;

    @Autowired
    private TbkItemInfoDAO tbkItemInfoDAO;

    @Autowired
    private TbkItemInfoApiDAO tbkItemInfoApiDAO;

    @Autowired
    private TbkItemDetailDAO tbkItemDetailDAO;

    @Autowired
    private TbkPrefectItemDAO tbkPrefectItemDAO;

    public TbkItemInfo getTbkItemInfoByNumId(Long numId) {
        TbkItemInfo info = new TbkItemInfo();
        // 查询数据库
        info = tbkItemInfoDAO.selectByPrimaryKey(numId);

        if (info == null) {
            logger.info("[详情页] 开始调用淘宝接口");
            NTbkItem item = taobaoApiService.getTbkItemInfo(numId.toString(), 1L);
            if (item != null) {
                logger.info("[详情页] 成功调用淘宝接口");
                info = this.ntbkItemToTbkItemInfo(item);
                // 插入数据库
                tbkItemInfoDAO.insert(info);
                logger.info("[详情页] 插入数据库成功");
            }
        }

        return info;
    }

    public TbkItemInfoApi getItemInfoBuNumId(Long numId) {
        TbkItemInfoApi infoApi = tbkItemInfoApiDAO.selectByPrimaryKey(numId);
        if (infoApi == null) {
            String info = taobaoApiService.getItemInfo(numId);
            infoApi = JSON.parseObject(info, TbkItemInfoApi.class);
            if(infoApi.getApiStack() != null) {
                infoApi.setNumId(numId);
                tbkItemInfoApiDAO.insertSelective(infoApi);
            } else {
                // 如果接口返回无此宝贝，应该是被删除了，以防万一先不删除词宝贝

            }
        }
        return infoApi;
    }

    public TbkItemDetail getItemDetailByNumId(Long numId, String descInfo) {
        TbkItemDetail detail = tbkItemDetailDAO.selectByPrimaryKey(numId);

        if (detail == null) {
            String url =  JSONObject.parseObject(descInfo).getString("briefDescUrl");
            String images = taobaoApiService.getItemDefail(url);
            TbkItemDetail itemDetail = new TbkItemDetail();
            itemDetail.setImagesUrl(images);
            itemDetail.setItemId(numId);
            itemDetail.setUpdateTime(new Date());
            itemDetail.setCreateTime(new Date());

            tbkItemDetailDAO.insert(itemDetail);

            return itemDetail;
        }

        return detail;
    }

    public List<PerfectItem> getItemsByTaobaoId(Long taobaoId) {
        Map params = new HashMap();
        params.put("taobaoId", taobaoId);
        List<PerfectItem> result = new ArrayList<PerfectItem>();
        List<TbkPrefectItem> items = tbkPrefectItemDAO.selectItemsNotExpireByParams(params);
        for (TbkPrefectItem item: items) {
            PerfectItem temp = item.formatPerfectItem();
            result.add(temp);
        }
        return result;
    }

    private TbkItemInfo ntbkItemToTbkItemInfo(NTbkItem item) {
        Date now = new Date();
        TbkItemInfo info = new TbkItemInfo();
        info.setItemUrl(item.getItemUrl());
        info.setNick(item.getNick());
        info.setNumId(item.getNumIid());
        info.setPictUrl(item.getPictUrl());
        info.setProvcity(item.getProvcity());
        info.setReservePrice(item.getReservePrice());
        if (item.getSellerId() != null) {
            info.setSellerId(Integer.valueOf(item.getSellerId().toString()));
        }
        info.setSmallImages(Joiner.on(",").join(item.getSmallImages()));
        info.setTitle(item.getTitle());
        info.setZkFinalPrice(item.getZkFinalPrice());
        info.setUserType(Integer.valueOf(item.getUserType().toString()));
        info.setVolume(item.getVolume());
        info.setCreateTime(now);
        info.setUpdateTime(now);
        return info;
    }
}
