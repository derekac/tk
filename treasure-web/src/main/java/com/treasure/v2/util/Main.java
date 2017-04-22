package com.treasure.v2.util;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.TbkItemGetRequest;
import com.taobao.api.response.TbkItemGetResponse;

/**
 * Created by derek on 4/22/17.
 */
public class Main {
    public static void main(String[] args) throws ApiException {
        String            url    = "http://gw.api.taobao.com/router/rest";
        String            appkey = "23727458";
        String            secret = "e3f1c6adcf0f7eafb95bd91f98ce7cb7";
        TaobaoClient      client = new DefaultTaobaoClient(url, appkey, secret);
        TbkItemGetRequest req    = new TbkItemGetRequest();
        req.setFields("num_iid,title,pict_url,small_images,reserve_price,zk_final_price,user_type,provcity,item_url,seller_id,volume,nick");
        req.setQ("女装");
        req.setCat("16,18");
        req.setItemloc("杭州");
        req.setSort("tk_rate_des");
        req.setIsTmall(false);
        req.setIsOverseas(false);
        req.setStartPrice(10L);
        req.setEndPrice(10L);
        req.setStartTkRate(123L);
        req.setEndTkRate(123L);
        req.setPlatform(1L);
        req.setPageNo(123L);
        req.setPageSize(20L);
        TbkItemGetResponse rsp = client.execute(req);
        System.out.println(rsp.getBody());
    }
}
