<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>类型查询</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.theme.min.css"/>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>

<script type="text/javascript" src="js/jquery.min.js"></script>

<script type="text/javascript" src="js/bootstrap.min.js"></script>

</head>
<body>
<div class="row">
	<div class="col-xs-12">
		<nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">必要管理系统</a>
    </div>

   		<!-- Standard button -->
		<a href="outlogin" class="btn btn-default" style="margin-top:10px;float:right">退出</a>
    </div><!-- /.navbar-collapse -->
</nav>
	</div>
</div>
	

	<div class="row">
		<div class="col-xs-3">
		<%@include file="mouban.jsp" %>
		</div>
		<div class="col-xs-8">
		<div class="panel panel-default">
		  <div class="panel-heading"><h4>类型查询</h4></div>
			  <div class="panel-body">
			  		<table class="table table-striped">
						<tbody id="table">
							<tr>
								<th>ID</th>
								<th>类型名称</th>
								<th>类型别名</th>
								<th>状态</th>
								<th>操作</th>
							</tr>
							<c:forEach items="${requestScope.lx}" var="item">
								<tr>
								<td></td>
								<td>
								<c:forEach begin="0" end="${item.level}">
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								</c:forEach>
								${item.mc}
								</td>
								<td>${item.bm}</td>
								
								<c:if test="${item.zt==0}">
									<td>
									开启
									</td>
								</c:if>
								<c:if test="${item.zt==1}">
									<td>
									关闭
									</td>
								</c:if>
								<td><a href="selectlxcz?id=${item.id}" class="btn btn-default" style="margin-top:10px;">操作</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
					
			  </div>
		  </div>
		</div>
			
		
	</div>


</body>
</html>