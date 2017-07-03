<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>购物车</title>
	<link rel="stylesheet" type="text/css" href="css/Init.css"/>
	<link rel="stylesheet" href="css/cart.css"/>
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
	<div class="cart">
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
		<div class="head cl">
			<a href=""><img src="images/home_log.png" alt="必要"></a>
			<div class="loading">
				<img src="images/card_loading.png" alt=""/>
				<ul class="cl">
					<li>查看购物车</li>
					<li>确认订单信息</li>
					<li>在线付款</li>
					<li>收货并评价</li>
				</ul>
			</div>
		</div>
	</div>
	<div class="transition"></div>
	<div class="body">
		<p>购物车</p>
		<div class="table_top">
			<table>
				<tr>
					<th width="33"><input type="checkbox"/></th>
					<th class="cl"><span>全选</span><em>商品信息</em></th>
					<th width="120">单价</th>
					<th width="120">数量</th>
					<th width="240">包装</th>
					<th width="120">小计</th>
					<th width="60">操作</th>
				</tr>
			</table>
		</div>
		<c:forEach items="${sessionScope.cartdtos }" var="item">
		<div class="table_body">
			<div class="table_name cl">
				<div style="border: none"><input type="checkbox"></div>
				<span>商家：${item.sjmc}</span>
			</div>
			<table>
			<c:forEach items="${item.cartcpdto }" var="item1">
				<tr>
					<td width="33"><input type="checkbox"></td>
					<td class="cl">
						<img src="${item1.img }" alt="" style="width:131px;height:120px">
						<div class="cl">
						<span>${item1.cpmc}</span><br>
						<span>颜色：${item1.ysmc}</span><br>
						<span>尺寸：${item1.ccmc}</span>
						</div>
					</td>
					<td width="120">￥${item1.cpjg}</td>
					<td width="120" class="cl">
						<div></div>
						<button>-</button>
						<div>${item1.cpsl}</div>
						<button>+</button>
					</td>
					<td width="240">普通包装（免费）</td>
					<td width="120">￥${item1.cpjg}</td>
					<td width="60"><button></button></td>
					</tr>
				</c:forEach>
			</table>
		
		</div>
		</c:forEach>
		<div class="table_bottom cl">
			<div style="border: none"><input type="checkbox"></div>
			<span>全选</span><a href="">删除</a>
			<div>
				<p>商品总数<span>1</span>件&nbsp;&nbsp;商品总价格：<span>￥299</span></p>
				<p>包装费<span>￥0</span></p>
			</div>
		</div>
		<div class="footer cl">
			<a href="home">继续购物</a>
			<button>结算</button>
			<span>￥299</span>
			<span>合计（不含运费）</span>		
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