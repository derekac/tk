package com.treasure.v2.constants;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *版本：3.3
 *日期：2012-08-10
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
	
 *提示：如何获取安全校验码和合作身份者ID
 *1.用您的签约支付宝账号登录支付宝网站(www.alipay.com)
 *2.点击“商家服务”(https://b.alipay.com/order/myOrder.htm)
 *3.点击“查询合作者身份(PID)”、“查询安全校验码(Key)”

 *安全校验码查看时，输入支付密码后，页面呈灰色的现象，怎么办？
 *解决方法：
 *1、检查浏览器配置，不让浏览器做弹框屏蔽设置
 *2、更换浏览器或电脑，重新登录查询。
 */

public class AlipayConfig {
	
	//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
	// 合作身份者ID，以2088开头由16位纯数字组成的字符串
	public static String partner = "2088021435274200";
	
	// 收款支付宝账号，以2088开头由16位纯数字组成的字符串，一般情况下收款账号就是签约账号
	public static String seller_id = partner;
	// 商户的私钥
	public static String private_key = "MIICeQIBADANBgkqhkiG9w0BAQEFAASCAmMwggJfAgEAAoGBANeI7j5tH1P3596t+YPRHJ8R6DiJHQ4PHByTO8VOhFkqx+vCmt14cN8NUA1G1//kJbDiyzjmUpz/ZPS7jQIPvDV/TW8d1JUM++tS0O5lVlOaWRSODROrOSYLNdK/YY6dhYH8r28US3aJtmEMxrfAWgVWr6+WxXhalrZKTyXMxG7dAgMBAAECgYEAg+ApfZLA/1yIx8wFBi1VaNLJFoZ2e5qtJaLEiIXxHqm5ZzxMC0RdM2zu1SDKmqxaj29EzszGMX9mowN6VI+SJL1h8NTApiYv95iLBX+KztV7q6QnGXd/xZEFKs4tE1lew0Z7HoMl1Tl5muN3rHgs2KjNUT5er56PoSNUlocJluECQQD7YjtBS0S0hzZNqpaeL1TwXwNAUgY3F8QtZmVVgTTozLv4RVWHuU/JPaqQmkeNr3iG54ORaIPToY3W5ZULuiGJAkEA234r/4Mo/OzFDdDJuDLVxxeJSHPdYhfwjFl+QmDKb27vpaUXAAbll73Og8Rm2jeuIg4kehEUPGUeoDSl0WOxtQJBAKvB4E6qiNT4FYhXZ/XIzTY3FNebs5ds66NBdTdIwsfVKxFk/h1v5i3PrnyCjSUnoSg7gs+VI40zsuADmSScFlECQQDXZZhT5SkCHHC8wBpVMz3rZUOJ4Hpu20Nq2CA5j7bZaCqxibNqiVoicVgKo2Cz4VR3gx101PHg2vMVENVxCL7JAkEAmeP8cGUfXcYNx1IaQqq8x2BnhlT3dwhW+lVW5Blou2aemhepseZ4F7u9e3g/ji7JryEcfm7XNVmq+iHsr6Yd3Q==";
	
	// 支付宝的公钥，无需修改该值
	public static String ali_public_key  = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDXiO4+bR9T9+ferfmD0RyfEeg4iR0ODxwckzvFToRZKsfrwprdeHDfDVANRtf/5CWw4ss45lKc/2T0u40CD7w1f01vHdSVDPvrUtDuZVZTmlkUjg0TqzkmCzXSv2GOnYWB/K9vFEt2ibZhDMa3wFoFVq+vlsV4Wpa2Sk8lzMRu3QIDAQAB";

	//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
	

	// 调试用，创建TXT日志文件夹路径
	public static String log_path = "D:\\";

	// 字符编码格式 目前支持 gbk 或 utf-8
	public static String input_charset = "utf-8";
	
	// 签名方式 不需修改
	public static String sign_type = "RSA";

}
