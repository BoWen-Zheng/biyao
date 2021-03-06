<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加类型</title>
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
		<a src="outlogin" class="btn btn-default" style="margin-top:10px;float:right">退出</a>
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
		  <div class="panel-heading"><h4>类型添加</h4></div>
		  <div class="panel-body">
		  	<form action="addlx" class="form-group" method="POST" enctype="multipart/form-data">
		      <div class="form-group">
			    <label for="exampleInputPassword1">父类</label>
			    <select class="form-control" name="pid">
			    <option value="0">根类</option>
			    <c:forEach items="${requestScope.trees}" var="item">
			    	<option value="${item.id}">
			    	<c:forEach begin="0" end="${item.level}">
			    	&nbsp;&nbsp;&nbsp;
			    	</c:forEach>
			    	${item.mc}
			    	</option>
			    </c:forEach>
			    </select>
			  </div>
		      <div class="form-group">
			    <label for="exampleInputPassword1">类型名称</label>
			    <input type="text" class="form-control" id="sjmc" placeholder="请输入您的类型名称" name="mc">
			  </div>
			  <div class="form-group">
			    <label for="exampleInputPassword1">显示状态</label>
			    <input type="radio" id="xszt" name="xszt" value="0" checked="checked">首页不显示
			    <input type="radio" id="xszt" name="xszt" value="1">首页显示
			  </div>
			  <div class="form-group">
			    <label for="exampleInputPassword1">类型别名</label>
			    <input type="text" class="form-control" id="sjmc" placeholder="请输入您的类型别名" name="bm">
			  </div>
			  <c:if test="${param['flag']==false }">
			  <div class="alert alert-danger" role="alert">对不起，添加失败</div>
			  </c:if>
			  <c:if test="${param['flag']==true }">
			  <div class="alert alert-success" role="alert">添加成功！</div>
			  </c:if>
			  
			<button type="submit" class="btn btn-info" style="margin-top:30px;float:right">提交</button>	
			</form>
		</div>
		  </div>
		</div>
			
		
	</div>


</body>
</html>