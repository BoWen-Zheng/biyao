<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>商品详情</title>
	<link rel="stylesheet" href="css/Init.css"/>
	<link rel="stylesheet" href="css/product.css"/>
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/easing.js"></script>
	<script type="text/javascript" src="js/home.js"></script>
	<script type="text/javascript" src="js/product.js"></script>
	<script type="text/javascript">
	$(function(){
		var index=new home();
		var pro=new product();
		index.hiddengd();
		pro.img();
		index.xlcd("lxchlidren");
		$(".text ul:eq(3)").append('<input name="cpsl" type="hidden" value="'+$(".text ul:eq(3) li:eq(2)").html()+'">');
	})	
	
	</script>
</head>
<body>
	<div class="product">
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
			<div class="body_top cl">
				<a href="">首页</a>
				<ul class="cl">
					<li><a href="">/${requestScope.cp.cpmc}</a></li>
				</ul>
				<a href=""></a>
				<a href=""></a>
				<button><a href="">联系客服</a></button>
			</div>
			<div class="main cl">
				<div class="images cl">
					<div class="img"><img src="${requestScope.cp.cptp }" alt="" style="width:580px;height:580px"></div>
					<ul>
						<c:forEach items="${requestScope.cpxts }" var="item">
							<li><img src="${item.xqtp } " alt="" style="width:100px;height:100px"></li>
						</c:forEach>
					</ul>
				</div>
				<form action="cart" method="post" id="product">
				<div class="text">
				
					<input type="hidden" name="id" value="${param['id'] }">
					<p>${requestScope.cp.cpmc}</p>
					<span><c:forEach items="${requestScope.czdto }" var="item">
						<c:forEach items="${item.czxq }" var="item1">
						${item1.czms}
						</c:forEach>
					</c:forEach> </span>
					<ul class="cl">
						<li>售价</li>
						<li>￥${requestScope.cp.cpjg }</li>
						<li>生产周期：</li>
						<li>${requestScope.cp.sczq}天</li>
					</ul>
					<ul class="cl">
						<li style="border: none">颜色</li>
						<c:forEach items="${requestScope.yss }" var="item">
							<li><img src="${item.ystp }" ysid="${item.id}" alt="" style="width:50px;height:50px"></li>
						</c:forEach>
						
					</ul>
					<ul class="cl">
						<li id="a">尺寸</li>
						<c:forEach items="${requestScope.ccs }" var="item">
							<li style="width:56px;line-height:35px" ccid="${item.id }">${item.ccmc }</li>
						</c:forEach>
						
						
					</ul>
					<a href="" class="p" style="display:inline-block;margin-left: 50px;margin-top: 20px">查看尺码对照表</a>
					<ul class="cl">
						<li>数量</li>
						<li><a>-</a></li>
						<li>1</li>
						<li><a>+</a></li>
					</ul>
					<button>加入购物车</button>
					
				</div>
				</form>
			</div>
			<div class="card">
				<ul class="cl">
					<li><a href="">商品信息</a>|</li>
					<li><a href="">商品详情</a></li>
				</ul>
				<div>${requestScope.cp.cpxq}</div>
				<div></div>
			</div>
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
</body>
</html>