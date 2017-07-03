<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>模板查询</title>
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
		  <div class="panel-heading"><h4>模板查询</h4></div>
			  <div class="panel-body">
			  		<table class="table table-striped">
						<tbody id="table">
							<tr>
								<th>ID</th>
								<th>模板名称</th>
								<th>模板地址</th>
								<th>操作</th>
							</tr>
							<c:forEach items="${requestScope.mb}" var="item">
								<tr>
								<td></td>
								<td>
								${item.mbmc}
								</td>
								<td>${item.mbdz}</td>
								
								
								<td><a href="selectmbcz?id=${item.id}" class="btn btn-default" style="margin-top:10px;">操作</a></td>
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