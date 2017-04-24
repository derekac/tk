package com.treasure.v2.service;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.domain.NTbkItem;
import com.taobao.api.request.TbkItemInfoGetRequest;
import com.taobao.api.response.TbkItemInfoGetResponse;
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

    private Logger logger = LoggerFactory.getLogger(TaobaoApiService.class);


    /**
     * 淘宝客商品详情（简版）
     * @param numIds 商品ID串，用,分割，从taobao.tbk.item.get接口获取num_iid字段，最大40个
     * @param platform 1：PC，2：无线
     * @return
     */
    public NTbkItem getTbkItemInfo(String numIds, Long platform) {
        NTbkItem nTbkItem = null;
        TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
        TbkItemInfoGetRequest req = new TbkItemInfoGetRequest();
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
}
