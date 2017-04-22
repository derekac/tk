<%--
  Created by IntelliJ IDEA.
  User: jason
  Date: 16/4/23
  Time: 下午7:43
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<!DOCTYPE html>
<head>
    <meta name="viewport"
          content="width=device-width,initial-scale=1.0,maximum-scale=1.0,minimum-scale=1.0,user-scalable=no"/>
    <meta charset="utf-8">
    <meta name="format-detection" content="telephone=no,email=no">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta charset="utf-8"/>
    <title>红包</title>
    <link rel="stylesheet" type="text/css" href="../css/setting.css"/>
    <link rel="stylesheet" type="text/css" href="../css/common.css"/>
</head>
<body class="redpackbody">

<div class="header">
    <a href="../Home/mypage">
        <div class="headerarrow"><img src="../img/iconfont-zuozuo.png"/></div>
    </a>
    <div class="headertitle">我的红包</div>
</div>

<div class="topwhite"></div>

<div class="redpacks">
    <div class="redpacks-left"><img src="../img/pack.png"/> </div>
    <div class="redpacks-right">
        <div class="packtitle">好运来红包</div>
        <div class="packenabledate">生效期:2015-13-22 33-33-33</div>
        <div class="packvaliddate">有效期:2015-33-33 22-22-22</div>
        <div class="packdesc">单词支付慢10元可以使用(不要错过哦)</div>
    </div>
    <div class="packstatusimg">
        <img src="../img/haveexpire.png" />
    </div>
</div>

<div class="noredpack">
    <img src="../img/noneredpack.png" />
</div>

<div class="redpackindiana">
    立即夺宝
</div>

</body>
</html>
