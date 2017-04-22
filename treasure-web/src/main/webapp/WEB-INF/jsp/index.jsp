<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
		 pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>

	<head>
		<title>图片轮播</title>
		<meta charset="UTF-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
		<link rel="stylesheet" type="text/css" href="../css/carousel-image.css">
		<link rel="stylesheet" type="text/css" href="../css/index.css" />
		<link rel="stylesheet" type="text/css" href="../css/navigation.css" />
		<style>
			body {
				padding: 0;
				margin: 0;
			}
		</style>
	</head>

	<body>
		<!--scroll-->
		<div class="carousel-image carousel-image2" id="scroll_img">
			<div>
				<c:forEach items="${banners}" var="banner" varStatus="status">
					<a href="../Home/productDetail?itemId=${banner.item.id}&activityId=${banner.id}">
						<img src="${banner.item.imgUrl}" />
					</a>
				</c:forEach>
			</div>
			<span class="carousel-num">
            </span>
		</div>

		<div class="registernum">
			<div class="registernumleft">累计注册人数</div>
			<div class="registernumright">${reg_nums}</div>
		</div>

		<div class="zuixinjiexiao">
			<div class="zuixinjiexiaohead">
				<div class="zxjxheadleft">最新揭晓</div>
				<a href="zuixinjiexiao.jsp">
					<div class="zxjxheadright">显示全部 >></div>
				</a>
			</div>
			<div class="zxjxproducts">
				<c:forEach var="product" items="${activityVos}" varStatus="status">
					<a href="productdetail.jsp">
						<div class="zxjxproduct">
							<div class="zxjxproductimg"><img src="../img/ipad.png" /></div>
							<div>
								${product.item.title}
							</div>
							<div class="fnTimeCountDown" data-end="${product.endTime}">
								<span class="year" style="display: none;">00</span>
								<span class="month" style="display: none;">00</span>
								<span class="day" style="display: none;">00</span>
								<span class="hour" style="display: none;">00</span>
								<span class="mini">00</span>:
								<span class="sec">00</span>:
								<span class="hm">000</span>
							</div>
						</div>
					</a>
				</c:forEach>
			</div>
		</div>

		<div class="allproducts">
			<div class="allprohead">全部商品</div>

			<c:forEach varStatus="status" items="${items}" var="prod">
				<a href="productdetail.jsp">
					<div class="productinfo">
						<img src="${prod.item.imgUrl}" />
						<div class="productitle">${prod.item.title}</div>
						<div class="productjindu">
							<div class="productjinduhead">揭晓进度<span class="productjindurate">${prod.rate}%</span></div>
							<div class="productjindubottom">
								<div class="productjindubottomgrey"></div>
							</div>
						</div>
						<div class="productbutton">
							<button>加入订单</button>
						</div>
					</div>
				</a>
			</c:forEach>
		</div>

		<div class="bottomhundred"></div>

		<ul class="navul">
			<li class="navli">
				<a href="../Home/homePage">
					<div class="divimg"><img src="../img/iconfont-duobao (1).png" class="navimg" /></div>
					<div class="divtext textfirst">
						夺宝
					</div>
				</a>
			</li>
			<li class="navli">
				<a href="../Home/closedAnnounce">
					<div class="divimg"><img src="../img/iconfont-zuixinjiexiaomeixuanzhong.png" class="navimg" /></div>
					<div class="divtext">
						最新揭晓
					</div>
				</a>
			</li>
			<li class="navli">
				<a href="../Home/share">
					<div class="divimg"><img src="../img/iconfont-show.png" class="navimg" /></div>
					<div class="divtext">
						晒单
					</div>
				</a>
			</li>
			<li class="navli">
				<a href="../Home/qingdan">
					<div class="divimg"><img src="../img/iconfont-qingdan.png" class="navimg" /></div>
					<div class="divtext">
						清单
					</div>
				</a>
			</li>
			<li class="navli">
				<a href="../Home/mypage">
					<div class="divimg"><img src="../img/iconfont-wodeduobao.png" class="navimg" /></div>
					<div class="divtext">
						我
					</div>
				</a>
			</li>
		</ul>

		<script type="text/javascript" src="../js/jquery-1.11.2.js"></script>
		<script type="text/javascript" src="../js/carousel-image.js"></script>
		<script type="text/javascript" src="../js/index.js"></script>
		<script type="text/javascript">
			$.extend($.fn, {
				//懒人建站 http://www.51xuediannao.com/
				fnTimeCountDown: function(d) {
					this.each(function() {
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
							haomiao: function(n) {
								if (n < 10) return "00" + n.toString();
								if (n < 100) return "0" + n.toString();
								return n.toString();
							},
							zero: function(n) {
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
							dv: function() {
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
							ui: function() {
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
			// 轮播
			function initFontSize() {
				document.documentElement.style.fontSize = document.documentElement.clientWidth / 7.5 + 'px';
			};
			initFontSize();
			$('.carousel-image2').CarouselImage({
				num: $('.carousel-image2 .carousel-num'),
				repeat: true,
				height: 170
			});
			$('.carousel-image1').CarouselImage({
				num: $('.carousel-image1 .carousel-num'),
				width: 320,
				height: 170
			});
			$('.carousel-image3').CarouselImage({
				num: $('.carousel-image3 .carousel-num'),
				auto: false
			});
			// 启动倒计时
			$(".fnTimeCountDown").fnTimeCountDown("2018/07/08 18:45:13");
		</script>
	</body>

</html>