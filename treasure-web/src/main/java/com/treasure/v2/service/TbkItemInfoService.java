package com.treasure.v2.service;

import com.google.common.base.Joiner;
import com.taobao.api.domain.NTbkItem;
import com.treasure.v2.dao.TbkItemInfoDAO;
import com.treasure.v2.model.TbkItemInfo;
import com.treasure.v2.util.HttpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

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


    private TbkItemInfo ntbkItemToTbkItemInfo(NTbkItem item) {
        Date now = new Date();
        TbkItemInfo info = new TbkItemInfo();
        info.setItemUrl(item.getItemUrl());
        info.setNick(item.getNick());
        info.setNumId(item.getNumIid());
        info.setPictUrl(item.getPictUrl());
        info.setProvcity(item.getProvcity());
        info.setReservePrice(item.getReservePrice());
        info.setSellerId(Integer.valueOf(item.getSellerId().toString()));
        info.setSmallImages(Joiner.on(",").join(item.getSmallImages()));
        info.setTitle(item.getTitle());
        info.setZkFinalPrice(item.getZkFinalPrice());
        info.setUserType(Integer.valueOf(item.getUserType().toString()));
        info.setVolume(item.getVolume());
        info.setCreateTime(now);
        info.setUpdateTime(now);
        return info;
    }

    public static void main(String[] args) {
        String url = "http://tb.am/api.php?url_long=http://img04.taobaocdn.com/bao/uploaded/i4/TB1.7_4QFXXXXcEXXXXXXXXXXXX_!!0-item_pic.jpg";
        try {
            String msg = HttpUtils.crawl(url, 4000, "utf-8", "");
            System.out.println(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
