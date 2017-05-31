package com.treasure.v2.job;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.treasure.v2.model.TbkItemInfoApi;
import com.treasure.v2.model.TxrTbItemInfo;
import com.treasure.v2.model.TxrTbItemRate;
import com.treasure.v2.model.TxrTbShopInfo;
import com.treasure.v2.service.TbkItemInfoApiService;
import com.treasure.v2.service.TxrTbItemService;
import com.treasure.v2.service.TxrTbRateService;
import com.treasure.v2.service.TxrTbShopService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by crow on 2017/5/30.
 */

@Component
public class TxrTbInfoJob {
  private Logger logger = LoggerFactory.getLogger(TxrTbInfoJob.class);

  @Autowired
  private TxrTbShopService txrTbShopService;

  @Autowired
  private TxrTbItemService txrTbItemService;

  @Autowired
  private TxrTbRateService txrTbRateService;

  @Autowired
  private TbkItemInfoApiService tbkItemInfoApiService;

  // 每30分钟执行一次
  @Scheduled(cron = "0 0/30 * * * ?")
  public void insertLib() {
    // 获得未解析的数据
    List<TbkItemInfoApi> infoApiList = tbkItemInfoApiService.getNotAnalysis();

    for (TbkItemInfoApi item: infoApiList) {
      if (item.getSeller() != null) {
        TxrTbShopInfo txrTbShopInfo = shopInfoAnalysis(item.getSeller());
        if (txrTbShopService.getByShopId(txrTbShopInfo.getShopId()) == null) {
          txrTbShopService.addSelective(txrTbShopInfo);
        }
      }

      if (item.getItemInfoModel() != null) {
        TxrTbItemInfo txrTbItemInfo = itemInfoAnglysis(item.getItemInfoModel());
        if (txrTbItemService.getByItemId(txrTbItemInfo.getItemId()) == null) {
          txrTbItemService.addSelective(txrTbItemInfo);
        }
      }

      if (item.getRateInfo() != null) {
        TxrTbItemRate txrTbItemRate = rateAnalysis(item.getNumId(), item.getRateInfo());
        if (txrTbRateService.getByItemId(item.getNumId()) == null) {
          txrTbRateService.addSelective(txrTbItemRate);
        }
      }

      tbkItemInfoApiService.hadAnalysis(item.getNumId());
    }
  }

  /**
   * 宝贝信息解析
   * @param str
   * @return
   */
  private static TxrTbItemInfo itemInfoAnglysis(String str) {
    TxrTbItemInfo info = new TxrTbItemInfo();
    JSONObject jsonInfo = JSON.parseObject(str);

    info.setItemId(jsonInfo.getLong("itemId"));
    info.setCategoryId(jsonInfo.getLong("categoryId"));
    info.setFavCount(jsonInfo.getLong("favcount"));
    info.setItemUrl(jsonInfo.getString("itemUrl"));
    info.setPicsPath(jsonInfo.getString("picsPath"));
    info.setLocation(jsonInfo.getString("location"));
    info.setTitle(jsonInfo.getString("title"));
    info.setSaleLine(jsonInfo.getString("saleLine"));

    return info;

  }


  /**
   * 分析店铺信息
   * @param str
   * @return
   */
  private static TxrTbShopInfo shopInfoAnalysis(String str) {
    TxrTbShopInfo info = new TxrTbShopInfo();
    JSONObject jsonInfo = JSON.parseObject(str);

    info.setShopId(jsonInfo.getLong("shopId"));
    info.setUserNumId(jsonInfo.getLong("userNumId"));
    info.setWeitaoId(jsonInfo.getLong("weitaoId"));
    info.setShopName(jsonInfo.getString("nick"));
    info.setType(jsonInfo.getString("type"));
    info.setFansCount(jsonInfo.getLong("fansCount"));
    info.setShopPic(jsonInfo.getString("picUrl"));
    info.setCreditLevel(jsonInfo.getInteger("creditLevel"));
    info.setStarts(jsonInfo.getDate("starts"));
    info.setShopPromtionType(jsonInfo.getString("shopPromtionType"));

    for (Object o: jsonInfo.getJSONArray("evaluateInfo")) {
      JSONObject jsonObject = (JSONObject) o;
      if (jsonObject.getString("name").equals("描述相符")) {
        info.setDescriptionScore(jsonObject.getDouble("score"));
      } else if (jsonObject.getString("name").equals("服务态度")) {
        info.setServiceScore(jsonObject.getDouble("score"));
      } else if (jsonObject.getString("name").equals("物流服务")) {
        info.setCourierScore(jsonObject.getDouble("score"));
      }
    }

    return info;
  }

  private static TxrTbItemRate rateAnalysis(Long itemId, String str) {
    TxrTbItemRate rate = new TxrTbItemRate();
    JSONObject jsonRate = JSONObject.parseObject(str);

    rate.setItemId(itemId);
    rate.setCount(jsonRate.getInteger("rateCounts"));

    for (Object o: jsonRate.getJSONArray("rateDetailList")) {
      JSONObject jsonObject = (JSONObject) o;
      rate.setLastFeedback(jsonObject.getString("feedback"));
      rate.setLastNick(jsonObject.getString("nick"));
      rate.setLastNickHeadPic(jsonObject.getString("headPic"));
      rate.setLastStar(jsonObject.getInteger("star"));
      rate.setLastSubInfo(jsonObject.getString("subInfo"));
      rate.setLastRatePicList(jsonRate.getString("ratePicList"));
    }

    return rate;
  }
}
