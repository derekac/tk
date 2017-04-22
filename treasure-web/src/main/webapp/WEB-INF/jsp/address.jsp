<%--
  Created by IntelliJ IDEA.
  User: jason
  Date: 16/4/20
  Time: 下午10:53
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
    <title>地址列表</title>
    <link rel="stylesheet" type="text/css" href="../css/common.css"/>
    <link rel="stylesheet" type="text/css" href="../css/setting.css"/>
</head>
<body>
<a href="../Home/setting">
    <div class="header">
        <div class="headerarrow"><img src="../img/iconfont-zuozuo.png"/></div>
        <div class="headertitle">地址列表</div>
        <div class="address-save"><a href="保存">添加地址</a></div>
    </div>
</a>

<div class="topwhite"></div>

<a href="">
    <div class="address-list">
        <div class="al-left">
            <div class="al-left-name">欧阳奖</div>
            <div class="al-left-address">案件法律四季度房价多少分腹肌阿里斯顿</div>
        </div>
        <div class="al-right-phone">14614627333</div>
    </div>
</a>

<a href="">
    <div class="address-list" id="address-list">
        <div class="al-left">
            <div class="al-left-name">欧阳奖</div>
            <div class="al-left-address"><span>[默认]</span>案件法律四季度房价多少分腹肌阿里斯顿</div>
        </div>
        <div class="al-right-phone">14614627333</div>
    </div>
</a>

<a href="../Home/addAddress">
    <div class="addressadd">
        添加地址
    </div>
</a>

</body>
</html>
