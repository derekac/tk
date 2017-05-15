package com.treasure.v2.service;

import com.alibaba.fastjson.JSONObject;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.domain.NTbkItem;
import com.taobao.api.request.TbkItemInfoGetRequest;
import com.taobao.api.request.WirelessShareTpwdCreateRequest;
import com.taobao.api.response.TbkItemInfoGetResponse;
import com.taobao.api.response.WirelessShareTpwdCreateResponse;
import com.treasure.v2.util.HttpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by crow on 2017/4/24.
 */

@Service
public class TaobaoApiService {
    @Value("${tk.tb.url}")
    private String url;

    @Value("${tk.tb.appKey}")
    private String appkey;

    @Value("${tk.tb.appSecret}")
    private String secret;

    // TODO 找时间分析 获得淘宝详情页
    private static final String taobao_mobile_item_api = "http://hws.m.taobao.com/cache/wdetail/5.0/?id=";

    private Logger logger = LoggerFactory.getLogger(TaobaoApiService.class);


    public String getWirelessShare(String title, String directurl, Long uid, String imgUrl) {
        TaobaoClient                                     client = new DefaultTaobaoClient(url, appkey, secret);
        WirelessShareTpwdCreateRequest                   req    = new WirelessShareTpwdCreateRequest();
        WirelessShareTpwdCreateRequest.GenPwdIsvParamDto obj1   = new WirelessShareTpwdCreateRequest.GenPwdIsvParamDto();
        obj1.setExt("{\"xx\":\"xx\"}");
        obj1.setLogo(imgUrl);
        obj1.setUrl(directurl);
        obj1.setText(title);
        obj1.setUserId(uid);
        req.setTpwdParam(obj1);
        WirelessShareTpwdCreateResponse rsp = null;
        try {
            rsp = client.execute(req);
            if (rsp != null && rsp.isSuccess()) {
                logger.info("调用接口成功 url:{} ret:{}", directurl, rsp.getBody());
                return rsp.getModel();
            }
        } catch (Throwable e) {
            logger.error("调用接口异常 参数 title:{} url:{} uid:{} imgUrl:{}", title, directurl, uid, imgUrl);
            logger.error("", e);
        }
        return "-1";
    }

//    public static void main(String[] args) {
//        String title = "迪士尼吸管杯儿童塑料水壶带手柄学饮杯防漏耐摔夏季小孩水杯";
//        String url = "https://uland.taobao.com/coupon/edetail?e=HOhLhIvnAfWbhUsf2ayXDCEESW44G%2Fl0nxkQltSrJKDWpKeD3l08NRpBwAz9u2FrJfnJSbcQZ1ihXzkjim5KDx0HgBdG%2FDDL%2F1M%2FBw7Sf%2Fc9LwTgPVJhAb5oEch9nB9eK4%2FUgdlM%2BB%2Bo0xFDwv4qxNoKxl31OYZ%2F&pid=mm_32045527_20860342_70570695&af=1";
//        Long uid = 3011075680L;
//        String imgUrl = "http://img01.taobaocdn.com/bao/uploaded/i1/TB1qvcMQFXXXXXbXFXXXXXXXXXX_!!0-item_pic.jpg";
//        System.out.println(getWirelessShare(title,url));
//    }

    /**
     * 淘宝客商品详情（简版）
     *
     * @param numIds   商品ID串，用,分割，从taobao.tbk.item.get接口获取num_iid字段，最大40个
     * @param platform 1：PC，2：无线
     * @return
     */
    public NTbkItem getTbkItemInfo(String numIds, Long platform) {
        NTbkItem              nTbkItem = null;
        TaobaoClient          client   = new DefaultTaobaoClient(url, appkey, secret);
        TbkItemInfoGetRequest req      = new TbkItemInfoGetRequest();
        req.setFields("num_iid,title,pict_url,small_images,reserve_price,zk_final_price,user_type,provcity,item_url");
        req.setPlatform(platform);
        req.setNumIids(numIds);
        try {
            TbkItemInfoGetResponse rsp = client.execute(req);
            if (rsp != null) {
                List<NTbkItem> nTbkItems = rsp.getResults();
                if (!nTbkItems.isEmpty()) {
                    nTbkItem = nTbkItems.get(0);
                }
            }
        } catch (ApiException e) {
            e.printStackTrace();
        }

        return nTbkItem;
    }


    public String getItemInfo(Long itemId) {

        String taobaoMobile = taobao_mobile_item_api + itemId;
        try {
            String     msg        = HttpUtils.crawl(taobaoMobile, 4000, "utf-8", "");
            JSONObject jsonObject = JSONObject.parseObject(msg);
            return jsonObject.getString("data");
        } catch (Exception e) {
            logger.error("", e);
        }
        return null;
    }

    public String getItemDefail(String url) {
        try {
            String     msg        = HttpUtils.crawl(url, 4000, "utf-8", "");
            JSONObject jsonObject = JSONObject.parseObject(msg);
            return jsonObject.getJSONObject("data").getString("images");
        } catch (Exception e) {
            logger.error("", e);
        }
        return null;
    }
}
