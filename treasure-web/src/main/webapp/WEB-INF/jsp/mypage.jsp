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
		<link rel="stylesheet" type="text/css" href="../css/mypage.css" />
		<link rel="stylesheet" type="text/css" href="../css/navigation.css" />
	</head>

	<body>
		<div class="mypagehead">
			<div class="mypageheadleft">
				<img src="../../img/ipad.png" />
			</div>
			<div class="mypageheadright">
				<div class="mypageheadrightnick">霸王处秀</div>
				<div class="mypageheadrightbalance">
					<div class="mypageheadrightbalanceleft">余额：<span>0</span>元</div>
					<div class="mypageheadrightbalanceright">
						<button>充值</button>
					</div>
				</div>
			</div>
		</div>

		<div class="mypagespacesp"></div>

		<a href="../Home/redpack">
			<div class="mypagecategory">
				<div class="mypagecategoryimg"><img src="../img/redpack.png" /></div>
				<div class="mypagecategorycontent">我的红包</div>
				<div class="mypagecategoryarrow"><img src="../img/khright.jpg" /></div>
			</div>
		</a>

		<a href="../Home/indianaRecord">
			<div class="mypagecategory">
				<div class="mypagecategoryimg"><img src="../img/iconfont-duobaojilu.png" /></div>
				<div class="mypagecategorycontent">夺宝纪录</div>
				<div class="mypagecategoryarrow"><img src="../img/khright.jpg" /></div>
			</div>
		</a>

		<a href="../Home/winRecord">
			<div class="mypagecategory">
				<div class="mypagecategoryimg"><img src="../img/iconfont-zhongjiangjilu.png" /></div>
				<div class="mypagecategorycontent">中奖纪录</div>
				<div class="mypagecategoryarrow"><img src="../img/khright.jpg" /></div>
			</div>
		</a>

		<a href="../Home/share">
			<div class="mypagecategory">
				<div class="mypagecategoryimg"><img src="../img/iconfont-wodeshaidan.png" /></div>
				<div class="mypagecategorycontent">我的晒单</div>
				<div class="mypagecategoryarrow"><img src="../img/khright.jpg" /></div>
			</div>
		</a>

		<a href="">
			<div class="mypagecategory">
				<div class="mypagecategoryimg"><img src="../img/iconfont-changjianwenti.png" /></div>
				<div class="mypagecategorycontent">常见问题</div>
				<div class="mypagecategoryarrow"><img src="../img/khright.jpg" /></div>
			</div>
		</a>

		<a href="../Home/setting">
			<div class="mypagecategory">
				<div class="mypagecategoryimg"><img src="../img/iconfont-shezhi.png" /></div>
				<div class="mypagecategorycontent">设置</div>
				<div class="mypagecategoryarrow"><img src="../img/khright.jpg" /></div>
			</div>
		</a>

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
					<div class="divimg"><img src="../img/iconfont-qingdan.png" class="navimg" /></div>
					<div class="divtext">
						清单
					</div>
				</a>
			</li>
			<li class="navli">
				<a href="../Home/mypage">
					<div class="divimg"><img src="../img/iconfont-wodeduobao (1).png" class="navimg" /></div>
					<div class="divtext textfirst">
						我
					</div>
				</a>
			</li>
		</ul>

	</body>

</html>