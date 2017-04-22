package com.treasure.v2.constants;

/**
 * Created by jason on 16/4/30.
 */
public class WechatConfig {

    public static final String appid = "wxd5575eeb2123ef3e";

    public static final String secret = "b2de7d0a3c79cf3974facf323e69fd3c";

    public static final String mch_id = "1281743101";

    public static final String nonce_str = "5K8264ILTKCH16CQ2502SI8Z";

    public static final String redirect_uri = "http://pay.banmayu.net/info/toPayPage.do";

    public static final String response_type = "code";

    public static final String snsapi_base  = "snsapi_base";

    public static final String state = "banmayu";

    public static final String access_token_url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code";

    public static final String notify_url = "http://pay.banmayu.net/info/callback.do";

    public static final String key = "iG8OvVzyq94HxSj3SzE8nTrmWNJTOwnz";

    public static final String make_order_url = "https://api.mch.weixin.qq.com/pay/unifiedorder";

    public static final String scope_base_url = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=wxd5575eeb2123ef3e&redirect_uri=http%3A%2F%2Fpay.banmayu.net%2Finfo%2FpayPage.do%3Forderno%3DORDERNO&response_type=code&scope=snsapi_base&state=banmayu#wechat_redirect";


}
