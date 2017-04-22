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

		<link rel="stylesheet" type="text/css" href="../css/common.css"/>

		<link rel="stylesheet" type="text/css" href="../css/indianarecord.css"/>

		<script src="../js/indianarecord.js" type="text/javascript" charset="utf-8"></script>

	</head>

	<body>

		<a href="../Home/mypage">

			<div class="header">

				<div class="headerarrow"><img src="../img/iconfont-zuozuo.png" /></div>

				<div class="headertitle">夺宝纪录</div>

			</div>

		</a>

		

		<ul class="indianarecordul">
			<li id="indianarecordli1" onclick="changeTab('1')">全部</li>

			<li id="indianarecordli2" onclick="changeTab('2')">进行中</li>

			<li id="indianarecordli3" onclick="changeTab('3')">已揭晓</li>
		</ul>

		

		<div class="indianarecordwhite"></div>

		

		<div class="indianaallproduct" id="indianaallproduct">

			<div class="indianaproduct">

				<div class="indianaproductimg">

					<img src="../img/ipad.png"/>

				</div>

				<div class="indianaproductright">

					<div class="indianaproductrighttitle">中国黄金AU9999万足金20g薄片</div>

					<div class="indianaproductrightperiod">期号：132554456</div>

					<div class="indianaproductrightjointime">我已参与：<span>1</span>人次<a href="">查看详情</a></div>

					<div class="indianaproductrightstatus">进行中</div>

				</div>

			</div>

			

			<div class="indianaproduct">

				<div class="indianaproductimg">

					<img src="../img/ipad.png"/>

				</div>

				<div class="indianaproductright">

					<div class="indianaproductrighttitle">中国黄金AU9999万足金20g薄片</div>

					<div class="indianaproductrightperiod">期号：132554456</div>

					<div class="indianaproductrightjointime">我已参与：<span>1</span>人次<a href="">查看详情</a></div>

					<div class="indianaproductrightstatus">已揭晓</div>

				</div>

			</div>

			

			<div class="indianaproduct">

				<div class="indianaproductimg">

					<img src="../img/ipad.png"/>

				</div>

				<div class="indianaproductright">

					<div class="indianaproductrighttitle">中国黄金AU9999万足金20g薄片</div>

					<div class="indianaproductrightperiod">期号：132554456</div>

					<div class="indianaproductrightjointime">我已参与：<span>1</span>人次<a href="">查看详情</a></div>

					<div class="indianaproductrightstatus">已揭晓</div>

				</div>

			</div>

			

			<div class="indianaproduct">

				<div class="indianaproductimg">

					<img src="../img/ipad.png"/>

				</div>

				<div class="indianaproductright">

					<div class="indianaproductrighttitle">中国黄金AU9999万足金20g薄片</div>

					<div class="indianaproductrightperiod">期号：132554456</div>

					<div class="indianaproductrightjointime">我已参与：<span>1</span>人次<a href="">查看详情</a></div>

					<div class="indianaproductrightstatus">已揭晓</div>

				</div>

			</div>

			

		</div>

		

		<div class="indianarunningproduct" id="indianarunningproduct" style="display: none;">

			<div class="indianaproduct">

				<div class="indianaproductimg">

					<img src="../img/ipad.png"/>

				</div>

				<div class="indianaproductright">

					<div class="indianaproductrighttitle">中国黄金AU9999万足金20g薄片</div>

					<div class="indianaproductrightperiod">期号：132554456</div>

					<div class="indianaproductrightjointime">我已参与：<span>1</span>人次<a href="">查看详情</a></div>

					<div class="indianaproductrightstatus">进行中</div>

				</div>

			</div>

			

			<div class="indianaproduct">

				<div class="indianaproductimg">

					<img src="../img/ipad.png"/>

				</div>

				<div class="indianaproductright">

					<div class="indianaproductrighttitle">中国黄金AU9999万足金20g薄片</div>

					<div class="indianaproductrightperiod">期号：132554456</div>

					<div class="indianaproductrightjointime">我已参与：<span>1</span>人次<a href="">查看详情</a></div>

					<div class="indianaproductrightstatus">进行中</div>

				</div>

			</div>

			

			<div class="indianaproduct">

				<div class="indianaproductimg">

					<img src="../img/ipad.png"/>

				</div>

				<div class="indianaproductright">

					<div class="indianaproductrighttitle">中国黄金AU9999万足金20g薄片</div>

					<div class="indianaproductrightperiod">期号：132554456</div>

					<div class="indianaproductrightjointime">我已参与：<span>1</span>人次<a href="">查看详情</a></div>

					<div class="indianaproductrightstatus">进行中</div>

				</div>

			</div>

		</div>

		

		<div class="indianaannounceproduct" id="indianaannounceproduct" style="display: none;">

			<div class="indianaproduct">

				<div class="indianaproductimg">

					<img src="../img/ipad.png"/>

				</div>

				<div class="indianaproductright">

					<div class="indianaproductrighttitle">中国黄金AU9999万足金20g薄片</div>

					<div class="indianaproductrightperiod">期号：132554456</div>

					<div class="indianaproductrightjointime">我已参与：<span>1</span>人次<a href="">查看详情</a></div>

					<div class="indianaproductrightstatus">已揭晓</div>

				</div>

			</div>

			

			<div class="indianaproduct">

				<div class="indianaproductimg">

					<img src="../img/ipad.png"/>

				</div>

				<div class="indianaproductright">

					<div class="indianaproductrighttitle">中国黄金AU9999万足金20g薄片</div>

					<div class="indianaproductrightperiod">期号：132554456</div>

					<div class="indianaproductrightjointime">我已参与：<span>1</span>人次<a href="">查看详情</a></div>

					<div class="indianaproductrightstatus">已揭晓</div>

				</div>

			</div>

			

			<div class="indianaproduct">

				<div class="indianaproductimg">

					<img src="../img/ipad.png"/>

				</div>

				<div class="indianaproductright">

					<div class="indianaproductrighttitle">中国黄金AU9999万足金20g薄片</div>

					<div class="indianaproductrightperiod">期号：132554456</div>

					<div class="indianaproductrightjointime">我已参与：<span>1</span>人次<a href="">查看详情</a></div>

					<div class="indianaproductrightstatus">已揭晓</div>

				</div>

			</div>

		</div>

		

	</body>

</html>

