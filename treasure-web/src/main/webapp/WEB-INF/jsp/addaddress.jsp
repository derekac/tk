<%--
  Created by IntelliJ IDEA.
  User: jason
  Date: 16/4/23
  Time: 上午10:28
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
    <title>添加地址</title>
    <link rel="stylesheet" type="text/css" href="../css/common.css"/>
    <link rel="stylesheet" type="text/css" href="../css/setting.css"/>
    <script type="text/javascript" src="../js/mypage.js"></script>
</head>
<body>

<div class="header">
    <a href="../Home/address">
        <div class="headerarrow"><img src="../img/iconfont-zuozuo.png"/></div>
    </a>
    <div class="headertitle">添加地址</div>
    <div class="address-save"><a href="保存">保存</a></div>
</div>


<div class="topwhite"></div>

<div class="addaddressdiv">
    <div class="addaddressdivleft">收货人:</div>
    <input type="text" placeholder="收货人姓名"/>
</div>

<div class="addaddressdiv">
    <div class="addaddressdivleft">手机号码:</div>
    <input type="text" placeholder="手机号码"/>
</div>

<div class="addaddressdiv">
    <div class="addaddressdivleft">省市区:</div>
    <input type="text" placeholder="手机号码"/>
</div>

<div class="addaddressdiv" id="addressdetail">
    <div class="addaddressdivleft">详细地址:</div>
    <textarea></textarea>
</div>

<div class="addaddressdiv" id="addressdefault">
    <div class="addaddressdivleft">设置默认地址:</div>
    <img src="../img/unuseicon.png" id="defaulticon" onclick="changeDefaultImg();">
    <input type="hidden" value="0" id="defaultvalue"/>
</div>

<div class="addaddressdiv" id="address-delete">
    删除
</div>

</body>
</html>
