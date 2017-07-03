<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>必要</title>
	<link rel="stylesheet" type="text/css" href="css/Init.css"/>
	<link rel="stylesheet" type="text/css" href="css/home.css"/>
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/easing.js"></script>
	<script type="text/javascript" src="js/home.js"></script>
	<script type="text/javascript">
	$(function(){
		var index=new home();
		index.lbshow();
		index.lbnow();
		index.lb();
		
		index.clicknav();
	
		index.hiddengd();
		
		index.xlcd("lxchlidren");
		
	})	
	
	</script>
	
</head>
<body>
	<div id="home">
		<div class="t1">
			<div class="top cl">
				<ul class="cl">
					<li><a href="home">首页</a>|</li>
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
			<div class="subject">
				<div class="carousel">
					<ul>
						<c:forEach items="${requestScope.lbcps}" var="item">
						<li><a href="merchant?cpid=${item.id}"><img src="${item.lbtp}" alt=""></a></li>
						</c:forEach>
					</ul>
					<ol class="cl">
						<c:forEach items="${requestScope.lbcps}">
							<li></li>
						</c:forEach>
					</ol>
				</div>
				<div><img src="images/body_commit.png" alt=""></div>
				<div class="transition"></div>
				<div class="morearticle cl"><a href="">更多原创文章></a></div>
				<div class="article cl">
					<img src="images/body_article.png" alt="">
					<div class="cl">
						<a href="">只靠拘留救不了孩子</a>
						<span>老必 2017-02-17</span>
						<p>未成年人犯罪背后的“好空好虚好寂寞”，是成人社会世界的“好脏好乱好快活”！<a href="">阅读全文></a></p>
					</div>
				</div>
				<div class="everynew cl">
					<a href="everyday" style="width:550px;height:550px"><img src="images/body_everynew.png" alt=""></a>
					<a href="merchant?cpid=${requestScope.xpcp1.id}" ><img src="${requestScope.xpcp1.xptp}" alt="" style="width:640px;height:270px"></a>
					<a href="merchant?cpid=${requestScope.xpcp2.id}" ><img src="${requestScope.xpcp2.xptp}" alt="" style="width:640px;height:270px"></a>
				</div>
				<c:forEach items="${requestScope.lxcpdtos}" var="item">
					<div class="template">
					<p>${item.lx.bm}</p>
					<span><c:forEach items="${item.sjs}" var="sj" end="1">${sj.sjmc}</c:forEach> 企业制造<a href="">更多商品></a></span>
					<ul class="cl">
					<c:forEach items="${item.cps}" var="cp">
						<li><a href="merchant?cpid=${cp.id}"><img src="${cp.cptp}"><p>${cp.cpmc}</p><span>￥${cp.cpjg}</span></a></li>
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