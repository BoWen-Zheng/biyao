<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" type="text/css"
	href="css/bootstrap.theme.min.css" />
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />



<script type="text/javascript" src="js/jquery.min.js"></script>

<script type="text/javascript" src="js/bootstrap.min.js"></script>

<script type="text/javascript" src="js/Cp.js"></script>

<script type="text/javascript" src="js/jedate.js"></script>


<style>
#cpdata img {
	width: 80px;
	height: 80px;
}
</style>




<title>首页</title>


<script type="text/javascript">

$(function(){
	
	var cp = new Cp();
	
	cp.ComPageTable(1);
	
	
	
	  jeDate({
			dateCell:"#beginfbsjid",
			format:"YYYY-MM-DD hh:mm:ss",
			isinitVal:false,
			isTime:true, 
			
			//isClear:true,
			minDate:"2014-09-19 00:00:00",
			okfun:function(val){alert(val)}
		})
		
		  jeDate({
			dateCell:"#endfbsjid",
			format:"YYYY-MM-DD hh:mm:ss",
			isinitVal:false,
			isTime:true, 
			
			//isClear:true,
			minDate:"2014-09-19 00:00:00",
			okfun:function(val){alert(val)}
		})
	
	
	
})




	
</script>



</head>
<body>


	<div>

		<div class="row">

			<div class="col-xs-12">


				<nav class="navbar navbar-default">
					<div class="container-fluid">


						<!-- Collect the nav links, forms, and other content for toggling -->
						<div class="collapse navbar-collapse"
							id="bs-example-navbar-collapse-1">
							<ul class="nav navbar-nav">
								<li><a href="#">后台管理系统</a></li>

							</ul>

							<ul class="nav navbar-nav navbar-right">
								<li><a href="Logout">退出</a></li>

							</ul>
						</div>
						<!-- /.navbar-collapse -->
					</div>
					<!-- /.container-fluid -->
				</nav>

			</div>




		</div>


		<div class="row">


			<div class="col-xs-3">


				<%@include file="mouban.jsp"%>



			</div>


			<div class="col-xs-9">



				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">商家查询</h3>
					</div>
					<div class="panel-body">


						<div class="row">

							<div class="col-xs-12">

								<form action="" class="form-horizontal">
								
								<div class="form-group">
								<label class="col-xs-2 control-label" >发布时间</label>
								
								<div class="col-xs-4" >
									<input type="text" class="form-control" id="beginfbsjid" name="beginfbsj" placeholder="请选择"  readonly>
							
								</div>
							
								
									<label class="col-xs-2 control-label" style="text-align: center" >至</label>
								
								<div class="col-xs-4">
									<input type="text" class="form-control" id="endfbsjid" name="endfbsj" placeholder="请选择"  readonly>
								</div>
								
								</div>

				<div class="form-group">
				
			
								<label class="col-xs-2 control-label">价格区间</label>
								<div class="col-xs-4">
									<input type="text" class="form-control" id="beginjgid" name="beginjg">
								</div>
								
								<label class="col-xs-2 control-label" style="text-align: center">至</label>
								
								
								<div class="col-xs-4" >
									<input type="text" class="form-control" id="endjgid" name="endjg">
								</div>
								
								
							</div>
									<div class="form-group">
										<label class="col-xs-2 control-label">产品名称</label>
										<div class="col-xs-2">
											<input type="text" class="form-control" id="cpmcid"
												name="sjmc" placeholder="请输入产品名称">
										</div>

										<label class="col-xs-2 control-label">类别</label>
										<div class="col-xs-2">
											<select class="form-control" name="lxid" id="lid">

												<option value="0">根类</option>

												<c:forEach items="${requestScope.trees}" var="item">


													<option value="${item.id}">

														<c:forEach begin="0" end="${item.level}">
               
               &nbsp;&nbsp;
               
               
               </c:forEach> ${item.mc}



													</option>







												</c:forEach>



											</select>
										</div>
										
										
											<label class="col-xs-2 control-label">选择商家</label>
										<div class="col-xs-2">
											
											<select name="sj" id="sjid" class="form-control">
											
												<option value="0">--请选择--</option>
											
											 	<c:forEach items="${requestScope.sjs }" var="item">
											 	
											 		<option value="${item.id}">${item.sjmc }</option>
											 	
											 	
											 	</c:forEach>
											
											
											
											</select>
											
										</div>



									</div>
									
									
									
						
									

							<div class="form-group">
								<label class="col-xs-2 control-label">选择模板</label>
								<div class="col-xs-2">
										<select name="mb" id="mbid" class="form-control">
											
												<option value="0">--请选择--</option>
												
												 	<c:forEach items="${requestScope.mbs }" var="item">
											 	
											 		<option value="${item.id}">${item.mbmc }</option>
											 	
											 	
											 	</c:forEach>
											
											
											
									   </select>
								</div>
								
								<label class="col-xs-2 control-label">选择状态</label>
								<div class="col-xs-2">
										<select name="zt" id="ztid" class="form-control">
											
												<option value="0">--请选择--</option>
												<option value="1">普通商品</option>
												<option value="2">每日上新</option>
												<option value="3">轮播置顶</option>
												<option value="4">禁用商品</option>
											
											
											
									   </select>
								</div>
									<div class="col-xs-4" >
									
									  <input style="width:100%" type="button" id="querybtn" value="查询" class="btn btn-danger">
								</div>
							</div>
							


								</form>




							</div>


						</div>






						<div class="row">

							<div class="col-xs-12">

								<table class="table table-bordered">

									<tbody id="cpdata">



									</tbody>



								</table>




							</div>



						</div>



						<div class="row">

							<div class="col-xs-12" style="text-align: center">

								<nav aria-label="Page navigation">
									<ul class="pagination" id="nav">

									</ul>
								</nav>




							</div>



						</div>







					</div>

				</div>











			</div>



		</div>






	</div>







</body>
</html>