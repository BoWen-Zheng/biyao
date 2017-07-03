<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" type="text/css" href="css/bootstrap.theme.min.css"/>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>

<script type="text/javascript" src="js/jquery.min.js"></script>

<script type="text/javascript" src="js/bootstrap.min.js"></script>

<script type="text/javascript" src="js/Cp.js"></script>

<script type="text/javascript" src="ueditor/ueditor.config.js"></script>


<script type="text/javascript" src="ueditor/ueditor.all.min.js"></script>


<script type="text/javascript">


   $(function(){
	   
	   
	   var editor = UE.getEditor('container'); 
	   
	   
	   
	   var cp = new Cp();
	   
	   
	   cp.xxk();
	   
	   cp.AddYs();
	   
	   cp.AddCC();
	   
	   cp.AddXt();
	   
	   cp.AddQm();
	   
	   cp.addCllb();
	   
	   
	   
	   
   })




</script>

<title>首页</title>
</head>
<body>

 
 <div>
 
   <div class="row">
   
     <div class="col-xs-12">
     
     
     <nav class="navbar navbar-default">
  <div class="container-fluid">


    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><a href="#">后台管理系统</a></li>
       
      </ul>
    
      <ul class="nav navbar-nav navbar-right">
        <li><a href="Logout">退出</a></li>
       
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
     
  </div>
   
   
   
   
   </div>
   
   
   <div class="row">
   
   
    <div class="col-xs-3">
    
    
    <%@include file="mouban.jsp" %>
    
    
    
    </div>
   
   
   	<div class="col-xs-9">
   	
   	
   	    
  <div class="panel panel-default">
  <div class="panel-heading">
    <h3 class="panel-title">产品更新</h3>
  </div>
  <div class="panel-body">
   
           					
 <form class="form-horizontal" action="updateallcp" method="POST" enctype="multipart/form-data">


 <ul class="nav nav-tabs">
  <li role="presentation" class="active xxknav"><a href="#">基本信息</a></li>
  <li role="presentation" class="xxknav"><a href="#">颜色信息</a></li>
  <li role="presentation" class="xxknav"><a href="#">尺寸信息</a></li>
  <li role="presentation" class="xxknav"><a href="#">图片信息</a></li>
  <li role="presentation" class="xxknav"><a href="#">材料信息</a></li>
  <li role="presentation" class="xxknav"><a href="#">签名信息</a></li>
</ul>


<div id="jbxxid" class="xxk" style="margin-top:30px">
<input type="hidden" value="${param['cpid']}" name="cpid">
  <div class="form-group">
    <label   class="col-xs-3 control-label">产品名称</label>
    <div class="col-xs-9">
      <input type="text" class="form-control"  name="cpmc" value="${requestScope.cp.cpmc}">
    </div>
  </div>


	     <div class="form-group">
			    <label class="col-xs-3 control-label">选择类型</label>
			    <div class="col-xs-9">
			    <select class="form-control" name="lx">
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
			  </div>
  

   <div class="form-group">
    <label   class="col-xs-3 control-label">产品描述</label>
    <div class="col-xs-9">
      <input type="text" class="form-control"  name="cpms" value="${requestScope.cp.cpms}">
    </div>
  </div>
  
 
  
    <div class="form-group">
    <label   class="col-xs-3 control-label">生产周期</label>
    <div class="col-xs-9">
      <input type="number" class="form-control"  name="sczq" value="${requestScope.cp.sczq}">
    </div>
  </div>
  
      <div class="form-group">
    <label   class="col-xs-3 control-label">产品价格</label>
    <div class="col-xs-9">
      <input type="text" class="form-control"  name="cpjg" value="${requestScope.cp.cpjg}">
    </div>
  </div>
  
      <div class="form-group">
    <label   class="col-xs-3 control-label">状态</label>
    <div class="col-xs-9">
    <c:if test="${requestScope.cp.zt==1}">
    <input type="radio"   name="zt" value="1" checked="checked"><span style="margin-right:20px">普通产品 </span>
    <input type="radio"   name="zt" value="2"><span style="margin-right:20px">每日上架</span>
      
      <input type="radio"   name="zt" value="3"><span style="margin-right:20px">轮播置顶</span>
      <input type="radio"   name="zt" value="4"><span style="margin-right:20px">禁用</span>
    
    </c:if>
     <c:if test="${requestScope.cp.zt==2}">
    <input type="radio"   name="zt" value="1"><span style="margin-right:20px">普通产品 </span>
    <input type="radio"   name="zt" value="2" checked="checked"><span style="margin-right:20px">每日上架</span>
      
      <input type="radio"   name="zt" value="3"><span style="margin-right:20px">轮播置顶</span>
    <input type="radio"   name="zt" value="4"><span style="margin-right:20px">禁用</span>
    </c:if>
    
    <c:if test="${requestScope.cp.zt==3}">
    <input type="radio"   name="zt" value="1"><span style="margin-right:20px">普通产品 </span>
    <input type="radio"   name="zt" value="2"><span style="margin-right:20px">每日上架</span>
      
      <input type="radio"   name="zt" value="3" checked="checked"><span style="margin-right:20px">轮播置顶</span>
    <input type="radio"   name="zt" value="4"><span style="margin-right:20px">禁用</span>
    </c:if>
       <c:if test="${requestScope.cp.zt==4}">
    <input type="radio"   name="zt" value="1"><span style="margin-right:20px">普通产品 </span>
    <input type="radio"   name="zt" value="2"><span style="margin-right:20px">每日上架</span>
      
      <input type="radio"   name="zt" value="3"><span style="margin-right:20px">轮播置顶</span>
    <input type="radio"   name="zt" value="4" checked="checked"><span style="margin-right:20px">禁用</span>
    </c:if>
    </div>
  </div>
  
   <div class="form-group">
    <label   class="col-xs-3 control-label">产品主图</label>
    <div class="col-xs-9">
  <input type="file" class="form-control"  name="cpzt">
 
    </div>
  </div>
  
     <div class="form-group">
    <label   class="col-xs-3 control-label">选择商家</label>
    <div class="col-xs-9">
     
     <select class="form-control" name="sj">
     
     	<option value="0">--请选择--</option>
     	
     	<c:forEach items="${requestScope.sjs}" var="item">
     	
     	  <option value="${item.id}">${item.sjmc}</option>
     	
     	</c:forEach>
     
     </select>
 
    </div>
  </div>
  
  
    <div class="form-group">
    <label   class="col-xs-3 control-label">轮播图片</label>
    <div class="col-xs-9">
  <input type="file" class="form-control"  name="lbtp">
 
    </div>
  </div>
  
      <div class="form-group">
    <label   class="col-xs-3 control-label">新品图片</label>
    <div class="col-xs-9">
  <input type="file" class="form-control"  name="xptp">
 
    </div>
  </div>
  
  
       <div class="form-group">
    <label   class="col-xs-3 control-label">选择模板</label>
    <div class="col-xs-9">
     
     <select class="form-control" name="mb">
     
     	<option value="0">--请选择--</option>
     	
     	<c:forEach items="${requestScope.mbs}" var="item">
     	
     	  <option value="${item.id}">${item.mbmc}</option>
     	
     	</c:forEach>
     
     </select>
 
    </div>
  </div>
  
   <div class="form-group">
   
      <div class="col-xs-12">
      
      
         <script type="text/plain" id="container" name="detail">

		   ${requestScope.cp.cpxq}


         </script>
      
      
      
      
      </div>
   
   
   
   
   
   </div>




</div>


<div id="ysxxid" class="xxk" style="margin-top:30px">

	<div class="row">
	
	
	<div class="col-md-12">
	
	  <a class="btn btn-warning" id="addysbtn" style="width:100%">添加颜色</a>
	
	
	</div>
	
	
	</div>
	
	
	<div id="yscontainer">
		<c:forEach items="${requestScope.ys}" var="item">
		<div class="yswrapper" style="padding-top:30px;margin-top:30px; border:2px solid #cccccc">
				
				  <div class="form-group">
				    <label   class="col-xs-2 control-label">颜色图片</label>
				    <div class="col-xs-4">
				      <input type="file" class="form-control"  name="ystp">
				    </div>
				    
				     <label   class="col-xs-2 control-label">颜色主图</label>
				    <div class="col-xs-4">
				      <input type="file" class="form-control"  name="yszt">
				    </div>
				  </div>
				  
				    <div class="form-group">
				    <label   class="col-xs-2 control-label">颜色名称</label>
				    <div class="col-xs-4">
				      <input type="text" class="form-control"  name="ysmc" value="${item.ysmc}">
				   </div>
				    
				     
				    <div class="col-xs-4 col-xs-offset-2">
				     <a class="btn btn-danger ysdel">删除</a>
				    </div>
				  </div>
					
					

				  </div>
		
		
		</c:forEach>
     
	
	
	</div>
	

 





</div>

<div id="ccxxid" class="xxk" style="margin-top:30px">

	<div class="row">
	
	
	<div class="col-md-12">
	
	  <a class="btn btn-warning" id="addccbtn" style="width:100%">添加尺寸</a>
	
	
	</div>
	
	
	</div>
	
	
	<div id="cccontainer">
	<c:forEach items="${requestScope.cc}" var="item">
		 <div class="ccwrapper" style="padding-top:30px;margin-top:30px; border:2px solid #cccccc">
					
				  <div class="form-group">
				    <label   class="col-xs-2 control-label">尺寸</label>
				    <div class="col-xs-6">
				      <input type="text" class="form-control"  name="ccmc" value="${item.ccmc}">
				    </div>
				    
				     
				    <div class="col-xs-4">
				      <a class="btn btn-danger ccdel">删除</a>
				    </div>
				  </div>
					

				  </div>
     
	</c:forEach>
	
	</div>
	






</div>
<div id="tpxxid" class="xxk" style="margin-top:30px">


	<div class="row">
	
	
	<div class="col-md-12">
	
	  <a class="btn btn-warning" id="addxtbtn" style="width:100%">添加产品详细图片</a>
	
	
	</div>
	
	
	</div>
	
	
	<div id="xtcontainer">
	
		<c:forEach items="${requestScope.cpxt}" var="item">
		
			<div class="xtwrapper" style="padding-top:30px;margin-top:30px; border:2px solid #cccccc">
				
				  <div class="form-group">
				    <label   class="col-xs-2 control-label">产品详图</label>
				    <div class="col-xs-6">
				      <input type="file" class="form-control"  name="cpxt">
				    </div>
				    
				     
				    <div class="col-xs-4">
				      <a class="btn btn-danger xtdel">删除</a>
				    </div>
				  </div>
					

				 </div>
		
		
		
		
		
		
		
		</c:forEach>
	
	
	
	
	
	
     
	
	
	</div>



</div>

<div id="clxxid" class="xxk" style="margin-top:30px">


	<div class="row">
	
	
	<div class="col-md-12">
	
	  <a class="btn btn-warning" id="addcllbbtn" style="width:100%">添加产品材料信息</a>
	
	
	</div>
	
	
    </div>


	<div id="clcontainer">
		<c:forEach items="${requestScope.czlb}" var="item" varStatus="vs">
			<div id="clwrapper" style="padding-top:30px;margin-top:30px; border:2px solid #cccccc">
			      
			      	<input type="hidden" class="clhiddenclass" value="${vs.index+10}" name="clhidden">
		           <div class="form-group">
	             <label   class="col-xs-3 control-label">材料类别名称</label>
	                 <div class="col-xs-5">
	                     <input type="text" class="form-control"  name="cllbmc${vs.index+10}" value="${item.czlbmc}">
	                 </div>
	                 
	                 <div class="col-xs-4">
	                 
	                    <a class="cllbdel btn btn-danger" style="width:40%;margin-right:10px">删除</a>
	                    
	                    <a class="addclxqbtn btn btn-danger" style="width:40%">添加材料详情</a>
	                    
	                 </div>
	                 
	             
	             </div>
	             
	             <c:forEach items="${requestScope.czxq}" var="item">
	             	<div class="form-group">
	           <label   class="col-xs-1 control-label">图片</label>
	      	 <div class="col-xs-3">
	      	   <input type="file" class="form-control"  name="cltp${vs.index+10}">
	      	 </div>
	      	 
	      	           <label   class="col-xs-1 control-label">名称</label>
	      	 <div class="col-xs-2">
	      	   <input type="text" class="form-control"  name="clmc${vs.index+10}" value="${item.czmc}">
	      	 </div>
	      	 
	      	             <label   class="col-xs-1 control-label">描述</label>
	      	 <div class="col-xs-2">
	      	   <input type="text" class="form-control"  name="clms${vs.index+10}" value="${item.czms}">
	      	 </div>
	      	 
	      	  <div class="col-xs-2">
	      	   <a class="btn btn-danger delclxqbtn">删除</a>
	      	</div>
	      	</div>
	             
	             
	             
	             
	             </c:forEach>
	             
	             
   
	             </div>
		
		
		
		
		
		
		
		
		
		
		
		
		</c:forEach>
	
	

	
	
	
	
     
	
	
	</div>



</div>

<div id="qmxxid" class="xxk" style="margin-top:30px">


	<div class="row">
	
	
	<div class="col-md-12">
	
	  <a class="btn btn-warning" id="addqmbtn" style="width:100%">添加产品签名</a>
	
	
	</div>
	
	
	</div>
	
	
	<div id="qmcontainer">
	
     <c:forEach items="${requestScope.cpqm}" var="item">
     		<div class="qmwrapper" style="padding-top:30px;margin-top:30px; border:2px solid #cccccc">
				
				  <div class="form-group">
				    <label   class="col-xs-2 control-label">签名价格</label>
				    <div class="col-xs-4">
				      <input type="text" class="form-control"  name="qmjg" value="${item.qmjg }">
				    </div>
				    
				     <label   class="col-xs-2 control-label">签名周期</label>
				    <div class="col-xs-4">
				      <input type="number" class="form-control"  name="qmzq" value="${item.qmzq }">
				    </div>
				  </div>
				  
				    <div class="form-group">
				    <label   class="col-xs-2 control-label">签名描述</label>
				    <div class="col-xs-4">
				      <input type="text" class="form-control"  name="qmms" value="${item.qmms }">
				    </div>
				    
				     
				    <div class="col-xs-4 col-xs-offset-2">
				     <a class="btn btn-danger qmdel">删除</a>
				    </div>
				  </div>
					
					

				  </div>
     
     
     
     </c:forEach>
	
	
	</div>




</div>



  <div class="form-group" style="margin-top:50px">
    <div class="col-xs-offset-5 col-xs-2">
      <button type="submit" class="btn btn-warning">--添加产品--</button>
    </div>
  </div>









</form>
   
   
   
   
   
  </div>
</div>
   	      
   	      
   	      
   	
   	
   	
   	
   	
   	
   	
   	</div>
   
   
   
   </div>
 
 
 
 
 
 
 </div>







</body>
</html>