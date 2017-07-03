<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>服装</title>
	<link rel="stylesheet" href="css/two.css"/>
	<link rel="stylesheet" type="text/css" href="css/Init.css"/>
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
	<div class="second">
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
		<div class="body">
			<div>
			<div class="list">
				<ul class="cl">
					<li><span>${requestScope.lx.mc}：</span></li>
					<c:forEach items="${requestScope.clxs}" var="item">
						<li><a href="two?id=${item.id}">${item.mc}</a></li>
					</c:forEach>
					
				</ul>
			</div>
			<c:forEach items="${requestScope.dtos}" var="item">
				<div class="template">
					<p>${item.lx.bm}</p>
					<span>
					<c:forEach items="${item.sjs}" var="item1" begin="0" end="1" varStatus="index">
						<c:if test="${index.index==1}">、</c:if>
						${item1.sjmc}
					</c:forEach>
					制造商出品
					</span>
					<ul class="cl">
						<c:forEach items="${item.cpdtos }" var="item2">
							<li><a href="${item2.mb}?id=${item2.cp.id }"><img src="${item2.cp.cptp}"><p>${item2.cp.cpmc }</p><span>￥${item2.cp.cpjg}</span></a></li>
						</c:forEach>
					</ul>
				</div>
			
			</c:forEach>
			
				
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