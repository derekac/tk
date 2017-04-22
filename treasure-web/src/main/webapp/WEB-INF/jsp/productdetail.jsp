<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta name="viewport"
          content="width=device-width,initial-scale=1.0,maximum-scale=1.0,minimum-scale=1.0,user-scalable=no"/>
    <meta charset="utf-8">
    <meta name="format-detection" content="telephone=no,email=no">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta charset="utf-8"/>
    <title>全民夺宝</title>
    <link rel="stylesheet" type="text/css" href="../css/productdetail.css"/>
    <link rel="stylesheet" type="text/css" href="../css/common.css"/>
    <script src="../js/index.js" type="text/javascript"></script>
    <script type="text/javascript" src="../js/jquery-1.11.2.js"></script>
</head>

<body>
<input type="hidden" value="" id="orderno" name="orderno"/>
<input type="hidden" value="${activityId}" name="activityId" id="activityId"/>
<a href="zuixinjiexiao.jsp">
    <div class="header">
        <div class="headerarrow"><img src="../img/iconfont-zuozuo.png"/></div>
        <div class="headertitle">宝贝详情</div>
    </div>
</a>

<div class="topwhite"></div>

<div id="container">
    <div class="detailheader">
        <img src="../img/ipad.png"/>
    </div>
    <div class="duobaoname">
				<span class="duobaoing">
					<c:if test="${activityVo.status == 0}">
                        [进行中]
                    </c:if>
					<c:if test="${activityVo.status == 1}">
                        [待揭晓]
                    </c:if>
					<c:if test="${activityVo.status == 2}">
                        [已完成]
                    </c:if>
				</span>
        <span class="duobaodes">(第${activityVo.periodId}期) <span id="productname">${activityVo.item.title}</span></span>
    </div>

    <div class="jindutiao">
        <input type="hidden" value="${activityVo.rate}" id="jindutiaorate"/>
        <div class="innerjindutiao" id="innerjindutiao"></div>
    </div>

    <div class="duobaoneednum">
        <div class="needleft">
            <span>总需<fmt:formatNumber type="number" pattern="0" value="${activityVo.item.price / 100}"/>人次</span>
        </div>
        <div class="needright">
            剩余<span><fmt:formatNumber type="number" pattern="0"
                                      value="${activityVo.item.price / 100 - activityVo.people}"/></span>
        </div>
    </div>

    <div class="canyuduobao">
        <c:if test="${joinstatus == 0}">您还没参与本期夺宝</c:if>
        <c:if test="${joinstatus != 0}">您已参与本期夺宝</c:if>
    </div>

    <div class="jianjugrey"></div>

    <a href="https://www.zjhjb.com/mviews/mlogin/">
        <div class="tuwenxiangqing">
            <img src="../img/tuwen.jpg" class="tuwenicon"/>
            <span>图文详情</span>
            <img src="../img/khright.jpg" class="khicon"/>
        </div>
    </a>

    <a href="../Home/winRecord?pageNum=1">
        <div class="tuwenxiangqing">
            <img src="../img/iconfont-zuixinjiexiaomeixuanzhong.png" class="tuwenicon"/>
            <span>往期揭晓</span>
            <img src="../img/khright.jpg" class="khicon"/>
        </div>
    </a>

    <div class="jianjugrey"></div>

    <div class="description">
        <div class="tuwenxiangqing">
            <img src="../img/record.jpg" class="tuwenicon"/>
            <span>所有参与纪录</span>
        </div>
    </div>

    <div class="joinrecord">
        <c:forEach varStatus="status" items="${activityDetails}" var="activityDetail">
            <div class="joinrecordimg"><img src="${activityDetail.avatar}"/></div>
            <div class="joinrecordright">
                <div class="joinrecordnick">${activityDetail.nick}</div>
                <div class="joinrecordip">（${activityDetail.message} ip:${activityDetail.ip}）</div>
                <div class="joinrecordtimes">
                    <div class="joinrecordtimesleft">参与了<span>${activityDetail.cnt}</span>人次</div>
                    <div class="joinrecordtimesright">${activityDetail.timeFormat}</div>
                </div>
            </div>
        </c:forEach>
    </div>

    <div class="whitebottom"></div>

    <div class="backgroundgrey" id="backgroundgrey"></div>

    <div class="detailbottom">
        <div class="detailbottomleft" onclick="showtab();">立即参与</div>
        <div class="detailbottomright">加入清单</div>
    </div>

    <div class="lijicanyu" id="lijicanyu">
        <div class="lijicanyuheader">
            <span>人次期数选择</span>
            <img src="../img/close.png" onclick="closetab();" />
        </div>
        <div class="jointimestext">
            参与人次
        </div>
        <div class="jointimesaddreduce">
            <div class="jointimereduce" onclick="reducejointimes();">-</div>
            <div class="jointimes"><input type="number" value="10" id="jointimes" /></div>
            <div class="jointimesadd" onclick="addjointimes();">+</div>
        </div>
        <div class="lijicanyuline"></div>
        <div class="yiyuanduobao" onclick="toconfirmpage();">
            一元夺宝
        </div>
    </div>

</div>

</body>
<script type="text/javascript">
    window.onload = function () {
        var rate = document.getElementById("jindutiaorate");
        var innerjindutiao = document.getElementById("innerjindutiao");
        innerjindutiao.style.width = rate;
    }
</script>

</html>