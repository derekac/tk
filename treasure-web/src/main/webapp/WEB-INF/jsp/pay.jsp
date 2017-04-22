<%--
  Created by IntelliJ IDEA.
  User: jason
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>支付订单</title>
    <meta name="viewport"
          content="width=device-width,initial-scale=1.0,maximum-scale=1.0,minimum-scale=1.0,user-scalable=no"/>
    <meta charset="utf-8">
    <meta name="format-detection" content="telephone=no,email=no">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta charset="utf-8"/>
    <link rel="stylesheet" type="text/css" href="../css/productdetail.css"/>
    <link rel="stylesheet" type="text/css" href="../css/common.css"/>
    <script src="../js/index.js" type="text/javascript"></script>
</head>
<body>
<input type="hidden" value="0" name="paytype" id="paytype"/>
<input type="hidden" value="${orderno}" name="orderno" id="orderno"/>
<input type="hidden" value="${productnum}" name="productnum" id="productnum"/>
<input type="hidden" value="${jointimes}" name="jointimes" id="jointimes"/>
<input type="hidden" value="${activityId}" name="activityId" id="activityId"/>
<input type="hidden" value="${openid}" name="openid" id="openid"/>

<a href="../Home/mypage">
    <div class="header">
        <div class="headerarrow"><img src="../img/iconfont-zuozuo.png"/></div>
        <div class="headertitle">支付订单</div>
    </div>
</a>

<div class="topwhite"></div>

<div class="paydiv">
    <span class="paypriceleft">商品合计</span>
    <span class="paypriceright">10.00元</span>
</div>

<div class="spaceline"></div>

<div class="payorderno">
    订单号:${orderno}
</div>

<div class="spaceline"></div>

<div class="paydiv">
    其他支付方式
</div>

<div class="spaceline"></div>

<div class="paydiv">
    <img src="../img/choose.png" id="alipay" onclick="choosepaytype(0);"/>
    <span>支付宝支付</span>
</div>

<div class="spaceline"></div>

<div class="paydiv">
    <img src="../img/unchoose.png" id="wechat" onclick="choosepaytype(1);"/>
    <span>微信支付</span>
</div>

<div class="spaceline"></div>

<div class="paybottom">
    确认支付
</div>

</body>
</html>
<script src="http://lib.sinaapp.com/js/jquery/2.0.3/jquery-2.0.3.min.js"></script>
<script>
    $(document).ready(function () {
        var ua = navigator.userAgent.toLowerCase();
        /* if (ua.match(/MicroMessenger/i) == "micromessenger") {
         return true;
         } else {
         alert("请在微信端打开");
         return false;
         } */
        var orderno = $("#orderno").val();
        var openid = $("#openid").val();
        $(".paybottom").on('click', function () {
            var paytype = $('#paytype').val();
            if (paytype == "0") {
                if (ua.match(/MicroMessenger/i) == "micromessenger") {
                    alert('请在浏览器中打开支付');
                    return
                }
                window.location = "../Pay/alipayApi?WIDout_trade_no=" + orderno + "&WIDsubject=%E6%96%91%E9%A9%AC%E9%B1%BC&WIDtotal_fee=0.01&WIDshow_url=http://pay.banmayu.net&WIDbody=bbb&WIDit_b_pay=1h&WIDextern_token=";
                return;
            } else if (paytype == "1") {
                if (ua.match(/MicroMessenger/i) != "micromessenger") {
                    alert("请在微信端打开");
                    return;
                }
                $.ajax({
                    type: "POST",
                    url: "../info/makeOrder.do",
                    data: {"orderno": orderno, "openid": openid},
                    dataType: "json",
                    success: function (data) {
                        //微信浏览器内置支付方法
                        WeixinJSBridge.invoke('getBrandWCPayRequest', {
                            "appId": data.appId, //公众号名称，由商户传入
                            "timeStamp": data.timeStamp, //时间戳，自1970年以来的秒数
                            "nonceStr": data.nonceStr, //随机串
                            "package": data.package,
                            "signType": data.signType, //微信签名方式:
                            "paySign": data.paySign
                            //微信签名
                        }, function (res) {
                            //支付成功
                            if (res.err_msg == "get_brand_wcpay_request:ok") {
                                window.location = "../info/wxSuccess.do?orderno=" + orderno;
                                return;
                            }

                            if (res.err_msg == "get_brand_wcpay_request:cancel") {
                                // alert("用户取消");
                                return;
                            }

                            if (res.err_msg == "get_brand_wcpay_request:fail") {
                                // alert("支付失败");
                                return;
                            }
                        });
                    }
                });
            }
        });

    });
</script>
