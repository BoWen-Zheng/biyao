<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<link rel="stylesheet" type="text/css" href="css/Init.css">
	<link rel="stylesheet" type="text/css" href="css/everyday.css">
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
<div class="content">
 <div class="header">
	<div class="title">
		<div class="headOne cl">
			<ul class="cl">
				<li><a href="" title="">首页</a></li>
				<li class="headOl"></li>
				<li><a href="" title="">商家中心</a></li>
				<li class="headOl"></li>
				<li><a href="" title="">平台政策</a></li>
				<li class="headOl"></li>
				<li><a href="" title="">必要手机版</a></li>
			</ul>
			<ul class="cl">
				<li><span>欢迎开到必要，请 </span><a href="">登录</a></li>
				<li class="headTl"></li>
				<li><a href="">注册</a></li>
				<li class="headTl"></li>
				<li><a href="">个人中心 <img src="images/header_list.jpg" alt=""></a></li>
				<li class="headOli"><a href="">购物车</a><span>0</span></li>
			</ul>
		</div>
		</div>
		<div class="mune">
		<%@include file="header.jsp" %>
		</div>
	</div>
	<div class="update">
		<div class="tip">
			<span>首页</span><em>></em><em>新品首发</em>
		</div>		
		<div class="newup">
			<p>每日上新</p>
			
		</div>
		<c:forEach items="${requestScope.fbsjcpsdto}" var="items">
			<p style="text-align: center;margin:20px">——————————<em>${items.fbsj}</em>——————————</p>
		<c:forEach items="${items.xps}" var="item">
		<ul>
		
			<li class="cl">
				<div>
					<p>${item.cpmc }</p>
					<strong>￥${item.cpjg}</strong>
					<em>${item.cpms}</em>
				</div>
				<div><img src="${item.cptp}" alt=""></div>
			</li>
		</ul>
		</c:forEach>
		</c:forEach>
	</div>

	<div class="low">
       <div class="lowt cl">
      <div class="low_l">
	<ul class="cl">
	    <li><a href="">关于必要</a></li>
		<li class="low_li"></li>
		<li><a href="">加入我们</a></li>
		<li class="low_li"></li>
		<li><a href="">联系我们</a></li>
		<li class="low_li"></li>
		<li><a href="">官方微博</a></li>
	</ul>
	<p>©BIYAO.COM 2017 版权所有</p>
	<img src="images/plo.jpg" alt=""><span> 粤公网安备44049102496139号 粤ICP备13088531号<br>
    &nbsp&nbsp珠海必要科技有限公司 联系方式：010-85715676</span>
</div>
<div class="low_r cl">
	<img src="images/one.jpg" alt=""><li><p class="lowp">扫描二维码下载</p>
	<p>扫描二维码下载</p></li><img class="lowimg" src="images/one.jpg" alt=""><li><p class="lowp">扫描二维码下载</p>
	<p>扫描二维码下载</p></li>
</div>
</div>
</div>

</div>
	
</body>
</html>