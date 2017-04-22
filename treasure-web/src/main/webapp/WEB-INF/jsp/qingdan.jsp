<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
		 pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,minimum-scale=1.0,user-scalable=no" />
		<meta charset="utf-8">
		<meta name="format-detection" content="telephone=no,email=no">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta charset="utf-8" />
		<title>全民夺宝</title>
		<link rel="stylesheet" type="text/css" href="../css/qingdan.css" />
		<link rel="stylesheet" type="text/css" href="../css/navigation.css" />
		<script type="text/javascript" src="../js/jquery-1.11.2.js"></script>
		<script type="text/javascript" src="../js/index.js"></script>
	</head>

	<body>

		<div class="qingdan">
			<div class="qingdanimg"><img src="../img/ipad.png" /></div>
			<div class="qingdanright">
				<div class="qingdanname">Apple watch sport 38毫米 铝金属表壳 运动表带</div>
				<div class="qingdanallnums">总需：3232人次，剩余<span>1542</span>人次</div>
				<div class="qingdanjointimes">
					<div class="qingdanjointimestext">参与人次</div>
					<div class="qingdanjointimesaddreduce">
						<ul>
							<li class="qingdanulreduce" onclick="clickReduce(0);">-</li>
							<li class="qingdanulnum">1</li>
							<li class="qingdanuladd" onclick="clickAdd(0);">+</li>
						</ul>
					</div>
				</div>
				<div class="qingdandelete" onclick="clickDelete(0);">
					<button>删除</button>
				</div>
			</div>
		</div>

		<div class="qingdan">
			<div class="qingdanimg"><img src="../img/ipad.png" /></div>
			<div class="qingdanright">
				<div class="qingdanname">Apple watch sport 38毫米 铝金属表壳 运动表带</div>
				<div class="qingdanallnums">总需：3232人次，剩余<span>1542</span>人次</div>
				<div class="qingdanjointimes">
					<div class="qingdanjointimestext">参与人次</div>
					<div class="qingdanjointimesaddreduce">
						<ul>
							<li class="qingdanulreduce">-</li>
							<li class="qingdanulnum">0</li>
							<li class="qingdanuladd">+</li>
						</ul>
					</div>
				</div>
				<div class="qingdandelete">
					<button>删除</button>
				</div>
			</div>
		</div>

		<div class="qingdan">
			<div class="qingdanimg"><img src="../img/ipad.png" /></div>
			<div class="qingdanright">
				<div class="qingdanname">Apple watch sport 38毫米 铝金属表壳 运动表带</div>
				<div class="qingdanallnums">总需：3232人次，剩余<span>1542</span>人次</div>
				<div class="qingdanjointimes">
					<div class="qingdanjointimestext">参与人次</div>
					<div class="qingdanjointimesaddreduce">
						<ul>
							<li class="qingdanulreduce">-</li>
							<li class="qingdanulnum">0</li>
							<li class="qingdanuladd">+</li>
						</ul>
					</div>
				</div>
				<div class="qingdandelete">
					<button>删除</button>
				</div>
			</div>
		</div>

		<div class="qingdan">
			<div class="qingdanimg"><img src="../img/ipad.png" /></div>
			<div class="qingdanright">
				<div class="qingdanname">Apple watch sport 38毫米 铝金属表壳 运动表带</div>
				<div class="qingdanallnums">总需：3232人次，剩余<span>1542</span>人次</div>
				<div class="qingdanjointimes">
					<div class="qingdanjointimestext">参与人次</div>
					<div class="qingdanjointimesaddreduce">
						<ul>
							<li class="qingdanulreduce">-</li>
							<li class="qingdanulnum">0</li>
							<li class="qingdanuladd">+</li>
						</ul>
					</div>
				</div>
				<div class="qingdandelete">
					<button>删除</button>
				</div>
			</div>
		</div>

		<div class="qingdanwhite"></div>

		<div class="qingdanbottom">
			<div class="qingdanbottomleft">
				<div class="qingdanbottomlefttop">共3件商品，总计：<span class="totalprice" id="totalprice">30</span>元</div>
				<div class="qingdanbottomleftbottom">夺宝有风险，参与需谨慎</div>
			</div>
			<div class="qingdanbottomright">
				<button>结算</button>
			</div>
		</div>

		<div class="bottomhundred"></div>

		<ul class="navul">
			<li class="navli">
				<a href="../Home/homePage">
					<div class="divimg"><img src="../img/iconfont-duobao.png" class="navimg" /></div>
					<div class="divtext">
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
					<div class="divimg"><img src="../img/iconfont-qingdan (1).png" class="navimg" /></div>
					<div class="divtext textfirst">
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

	</body>

</html>