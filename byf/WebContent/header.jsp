<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="head cl">
			<a href=""><img src="images/home_log.png" alt="必要"></a>
			<div class="fl cl" style="padding-bottom: 25px;">
			<div class="bigbox cl">
			<a href="" class="fl" style="padding-bottom:10px;margin-top: 21px">首页</a>
			<ul class="cl fl">
			 
				<c:forEach items="${requestScope.lxbypids}" var="item">
				  <li style="margin-top: 21px"><a href="two?id=${item.id}" ast="${item.id}">${item.mc}</a></li>
				</c:forEach>
			</ul>
			</div>
			<div class="xlcd"><ul></ul></div>	
			</div>
			<a href="" class="gd">更多</a>
		</div>
</body>
</html>