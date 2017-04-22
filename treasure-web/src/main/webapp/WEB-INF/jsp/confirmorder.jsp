<%--
  Created by IntelliJ IDEA.
  User: jason
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<!DOCTYPE html>
<head>
    <title>确认订单</title>
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
<body class="confirmbody">
<input type="hidden" value="${productnum}" name="productnum" id="productnum"/>
<input type="hidden" value="${jointimes}" name="jointimes" id="jointimes"/>
<input type="hidden" value="${activityId}" name="activityId" id="activityId"/>

<a href="javascript:history.go(-1);">
    <div class="header">
        <div class="headerarrow"><img src="../img/iconfont-zuozuo.png"/></div>
        <div class="headertitle">确认订单</div>
    </div>
</a>

<div class="topwhite"></div>

<div class="confirmdiv">
    共 ${productnum} 件商品
</div>

<div class="confirmspace"></div>

<div class="confirmdiv">
    <span class="redpackleft">红包</span>
    <span class="redpackright">可抵用1元</span>
</div>

<div class="confirmspace"></div>

<div class="confirmdiv">
    <span>商品金额</span>
    <span class="confirmprice">${jointimes}.00元</span>
</div>

<div class="confirmbottom">
    <div class="confirmbottomleft">实付款:<span>$${jointimes}.00</span></div>
    <div class="confirmbottomright" onclick="submitorder();">
        提交订单
    </div>
</div>
</body>
</html>
