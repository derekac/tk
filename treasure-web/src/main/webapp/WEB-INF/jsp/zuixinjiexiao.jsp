<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    <link rel="stylesheet" type="text/css" href="../css/zuixinjiexiao.css"/>
    <link rel="stylesheet" type="text/css" href="../css/navigation.css"/>
</head>

<body>
<c:forEach var="prod" items="${activityVos}" varStatus="status">
    <a href="../Home/productDetail?itemId=${prod.id}">
        <div class="zuixinjiexiao">
            <div class="zuixinjiexiaoimg">
                <img src="${prod.item.imgUrl}"/>
            </div>
            <div class="zuixinjiexiaobody">
                <div class="zuixinjiexiaotitle">${prod.item.title}</div>
                <div class="zuixinjiexiaoperiod">期号：${prod.periodId}</div>
                <div class="zuixinjiexiaotext">
                    <img src="../img/iconfont-jijiangshouqing.png"/>
                    <span>即将揭晓</span>
                </div>
                <div class="zuixinjiexiaotime">
                    <div class="fnTimeCountDown" data-end="${prod.endTime}">
                        <span class="year" style="display: none;">00</span>
                        <span class="month" style="display: none;">00</span>
                        <span class="day" style="display: none;">00</span>
                        <span class="hour" style="display: none;">00</span>
                        <span class="mini">00</span>:
                        <span class="sec">00</span>:
                        <span class="hm">000</span>
                    </div>
                </div>
            </div>
        </div>
    </a>
</c:forEach>

<div class="bottomhundred"></div>

<ul class="navul">
    <li class="navli">
        <a href="../Home/homePage">
            <div class="divimg"><img src="../img/iconfont-duobao.png" class="navimg"/></div>
            <div class="divtext">
                夺宝
            </div>
        </a>
    </li>
    <li class="navli">
        <a href="../Home/closedAnnounce">
            <div class="divimg"><img src="../img/iconfont-zuixinjiexiao.png" class="navimg"/></div>
            <div class="divtext textfirst">
                最新揭晓
            </div>
        </a>
    </li>
    <li class="navli">
        <a href="../Home/share">
            <div class="divimg"><img src="../img/iconfont-show.png" class="navimg"/></div>
            <div class="divtext">
                晒单
            </div>
        </a>
    </li>
    <li class="navli">
        <a href="../Home/qingdan">
            <div class="divimg"><img src="../img/iconfont-qingdan.png" class="navimg"/></div>
            <div class="divtext">
                清单
            </div>
        </a>
    </li>
    <li class="navli">
        <a href="../Home/mypage">
            <div class="divimg"><img src="../img/iconfont-wodeduobao.png" class="navimg"/></div>
            <div class="divtext">
                我
            </div>
        </a>
    </li>
</ul>
</body>

<script type="text/javascript" src="../js/jquery-1.11.2.js"></script>
<script type="text/javascript">
    $.extend($.fn, {
        //懒人建站 http://www.51xuediannao.com/
        fnTimeCountDown: function (d) {
            this.each(function () {
                var $this = $(this);
                var o = {
                    hm: $this.find(".hm"),
                    sec: $this.find(".sec"),
                    mini: $this.find(".mini"),
                    hour: $this.find(".hour"),
                    day: $this.find(".day"),
                    month: $this.find(".month"),
                    year: $this.find(".year")
                };
                var f = {
                    haomiao: function (n) {
                        if (n < 10) return "00" + n.toString();
                        if (n < 100) return "0" + n.toString();
                        return n.toString();
                    },
                    zero: function (n) {
                        var _n = parseInt(n, 10); //解析字符串,返回整数
                        if (_n > 0) {
                            if (_n <= 9) {
                                _n = "0" + _n
                            }
                            return String(_n);
                        } else {
                            return "00";
                        }
                    },
                    dv: function () {
                        //d = d || Date.UTC(2050, 0, 1); //如果未定义时间，则我们设定倒计时日期是2050年1月1日
                        var _d = $this.data("end") || d;
                        var now = new Date(),
                                endDate = new Date(_d);
                        //现在将来秒差值
                        //alert(future.getTimezoneOffset());
                        var dur = (endDate - now.getTime()) / 1000,
                                mss = endDate - now.getTime(),
                                pms = {
                                    hm: "000",
                                    sec: "00",
                                    mini: "00",
                                    hour: "00",
                                    day: "00",
                                    month: "00",
                                    year: "0"
                                };
                        if (mss > 0) {
                            pms.hm = f.haomiao(mss % 1000);
                            pms.sec = f.zero(dur % 60);
                            pms.mini = Math.floor((dur / 60)) > 0 ? f.zero(Math.floor((dur / 60)) % 60) : "00";
                            pms.hour = Math.floor((dur / 3600)) > 0 ? f.zero(Math.floor((dur / 3600)) % 24) : "00";
                            pms.day = Math.floor((dur / 86400)) > 0 ? f.zero(Math.floor((dur / 86400)) % 30) : "00";
                            //月份，以实际平均每月秒数计算
                            pms.month = Math.floor((dur / 2629744)) > 0 ? f.zero(Math.floor((dur / 2629744)) % 12) : "00";
                            //年份，按按回归年365天5时48分46秒算
                            pms.year = Math.floor((dur / 31556926)) > 0 ? Math.floor((dur / 31556926)) : "0";
                        } else {
                            pms.year = pms.month = pms.day = pms.hour = pms.mini = pms.sec = "00";
                            pms.hm = "000";
                            //alert('结束了');
                            return;
                        }
                        return pms;
                    },
                    ui: function () {
                        if (o.hm) {
                            o.hm.html(f.dv().hm);
                        }
                        if (o.sec) {
                            o.sec.html(f.dv().sec);
                        }
                        if (o.mini) {
                            o.mini.html(f.dv().mini);
                        }
                        if (o.hour) {
                            o.hour.html(f.dv().hour);
                        }
                        if (o.day) {
                            o.day.html(f.dv().day);
                        }
                        if (o.month) {
                            o.month.html(f.dv().month);
                        }
                        if (o.year) {
                            o.year.html(f.dv().year);
                        }
                        setTimeout(f.ui, 1);
                    }
                };
                f.ui();
            });
        }
    });
    // 启动倒计时
    $(".fnTimeCountDown").fnTimeCountDown("2018/07/08 18:45:13");
</script>

</html>