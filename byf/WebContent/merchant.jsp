<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>商家</title>
	<link rel="stylesheet" type="text/css" href="css/merchant.css">
	<link rel="stylesheet" href="css/Init.css"/>
	
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/easing.js"></script>
	<script type="text/javascript" src="js/home.js"></script>
	<script type="text/javascript">
	$(function(){
		var index=new home();
	
		index.hiddengd();
		
		index.xlcd("lxchlidren");
		
	})	
	
	</script>
</head>
<body>
	<div class="merchant">
		<div class="t1">
			<div class="top cl">
				<ul class="cl">
					<li><a href="">首页</a>|</li>
					<li><a href="">商家中心</a>|</li>
					<li><a href="">平台政策</a>|</li>
					<li><a href="">必要手机版</a></li>
				</ul> 
				<ul class="cl">
					<li><a href="">购物车0</a></li>
					<li><a href="">个人中心</a></li>
					<li><a href="">注册</a>|</li>
					<li class="cl"><p>欢迎来到必要，请</p><a href="">登录</a>|</li>
				</ul>
			</div>
		</div>
		<%@include file="header.jsp" %>
		<div class="transition"></div>
		<div class="background">
		<div class="body">
			<div class="body_top cl">
				<a href="">首页</a>
				<ul class="cl">
					<li><a href="">>${requestScope.sj.sjmc}</a></li>
				</ul>
			</div>
			<div class="body_top2 cl">
				<div class="cl">
				<img src="${requestScope.sj.sjtp}" alt="" style="width:100px;height:100px">
				<p><span>${requestScope.sj.sjmc}</span><a href="">联系客服</a></p>
				<p>服务电话：<span>9533859</span></p>
				</div>
				<div>
					<div class="cl">
						<em>品质质量：</em>
						<div></div>
						<span>${requestScope.sj.spzl}分</span>
					</div>
					<div class="cl">
						<em>服务态度：</em>
						<div></div>
						<span>${requestScope.sj.fwtd}分</span>
					</div>
				</div>
			</div>
			<div class="template">
					<ul class="cl">
						<c:forEach items="${requestScope.cps}" var="item">
							<li><a href="${item.mb}?id=${item.cp.id }"><img src="${item.cp.cptp}" style="width:200px;height:200px"><p>${item.cp.cpmc}</p><span>￥${item.cp.cpjg}</span></a></li>
						</c:forEach>
					</ul>
				</div>
				<div class="bottom cl">
					<div class="bottom1">
						<ul class="cl">
							<li><a href="">关于必要</a>|</li>
							<li><a href="">加入必要</a>|</li>
							<li><a href="">联系我们</a>|</li>
							<li><a href="">官方微博</a></li>
						</ul>
						<p>@BIYAO.COM 2017版权所有</p>
						<p>粤公安安备44049102496139号 粤ICP备13088531号<br>珠海必要科技有限公司 联系方式：010-85715616</p>
					</div>
					<div>
						<div>
						<img src="images/bottom_tow.png" alt="">
						<p>扫描二维码下载</p>
						<a href="">必要客户端</a>
						</div>
						<div>
						<img src="images/bottom_tow.png " alt="">
						<p>扫二维码关注</p>
						<a href="">必要官方微博</a>
						</div>
					</div>
				</div>
		</div>
		</div>
	</div>
</body>
</html>