function Cp(){
	
	this.index=0;
	
	this.xxk = function(){
		
		$(".xxk").css('display','none');
		
		$(".xxk:eq(0)").css('display','block');
		
		
		
		
		$('.xxknav').on('click',function(){
			
			var index = $('.xxknav').index($(this));
			
		   $(".xxk").css('display','none');
		   
		   $(".xxk:eq("+index+")").css('display','block');
		   
		   $('.xxknav').removeClass('active');
		   
		   $(this).addClass('active');
			
			
			
			
		})
		
		
		
		
		
		
		
	}
	
	this.AddYs = function(){
		
		var This = this;
		
		
		$('#addysbtn').on('click',function(){
			
			
		
			
			
			var  viewstr = '<div class="yswrapper" style="padding-top:30px;margin-top:30px; border:2px solid #cccccc">'+
				
				  '<div class="form-group">'+
				    '<label   class="col-xs-2 control-label">颜色图片</label>'+
				    '<div class="col-xs-4">'+
				      '<input type="file" class="form-control"  name="ystp">'+
				    '</div>'+
				    
				     '<label   class="col-xs-2 control-label">颜色主图</label>'+
				    '<div class="col-xs-4">'+
				      '<input type="file" class="form-control"  name="yszt">'+
				    '</div>'+
				 ' </div>'+
				  
				    '<div class="form-group">'+
				    '<label   class="col-xs-2 control-label">颜色名称</label>'+
				    '<div class="col-xs-4">'+
				      '<input type="text" class="form-control"  name="ysmc">'+
				   ' </div>'+
				    
				     
				    '<div class="col-xs-4 col-xs-offset-2">'+
				     '<a class="btn btn-danger ysdel">删除</a>'+
				    '</div>'+
				  '</div>'+
					
					

				  '</div>';
			
			
			var newob = $(viewstr);
			
			
			
			
			
			$('#yscontainer').append(newob);
			
			
			This.ysDel();
			
			
			
			
			
			
		})
		
		
		
		
		
		
	}
	
	
	this.ysDel = function(){
		
		
		
		
		$(".ysdel").on('click',function(){
			
			
			
		   var wrapper = $(this).parent().parent().parent();
			
			
			wrapper.remove();
			
			
			
		})
		
		
		
		
		
	}
	
	
	this.AddCC = function(){
		
		
		var This = this;

		
		$('#addccbtn').on('click',function(){
			
			
			
			
			var  viewstr = '<div class="ccwrapper" style="padding-top:30px;margin-top:30px; border:2px solid #cccccc">'+
					
				  '<div class="form-group">'+
				    '<label   class="col-xs-2 control-label">尺寸</label>'+
				    '<div class="col-xs-6">'+
				      '<input type="text" class="form-control"  name="ccmc">'+
				    '</div>'+
				    
				     
				    '<div class="col-xs-4">'+
				      '<a class="btn btn-danger ccdel">删除</a>'+
				    '</div>'+
				 ' </div>'+
					

				  '</div>';
			
			
			var newob = $(viewstr);
			
			
			
			
			
			$('#cccontainer').append(newob);
			
			This.delCC();
			
			
			
		})
		
		
		
		
		
	}
	
	this.delCC = function(){
		
		
		 $('.ccdel').on('click',function(){
			 
			 
			 $(this).parent().parent().parent().remove();
			 
			 
			 
			 
		 })
		
		
	}
	
	this.AddXt = function(){
		
		
		var This = this;
		
		$('#addxtbtn').on('click',function(){
			
			
			
			
			var  viewstr = '<div class="xtwrapper" style="padding-top:30px;margin-top:30px; border:2px solid #cccccc">'+
				
				  '<div class="form-group">'+
				    '<label   class="col-xs-2 control-label">产品详图</label>'+
				    '<div class="col-xs-6">'+
				      '<input type="file" class="form-control"  name="cpxt">'+
				    '</div>'+
				    
				     
				    '<div class="col-xs-4">'+
				      '<a class="btn btn-danger xtdel">删除</a>'+
				    '</div>'+
				 ' </div>'+
					

				  '</div>';
			
			
			var newob = $(viewstr);
			
			
			
			
			
			$('#xtcontainer').append(newob);
			
			This.delXT();
			
			
			
		})
		
		
		
		
		
	}
	
	this.delXT = function(){
		
		
		 $('.xtdel').on('click',function(){
			 
			 
			 $(this).parent().parent().parent().remove();
			 
			 
			 
			 
		 })
		
		
	}
	
	
	
	this.AddQm = function(){
		
		var This = this;
		
		
		$('#addqmbtn').on('click',function(){
			
			
		
			
			
			var  viewstr = '<div class="qmwrapper" style="padding-top:30px;margin-top:30px; border:2px solid #cccccc">'+
				
				  '<div class="form-group">'+
				    '<label   class="col-xs-2 control-label">签名价格</label>'+
				    '<div class="col-xs-4">'+
				      '<input type="text" class="form-control"  name="qmjg">'+
				    '</div>'+
				    
				     '<label   class="col-xs-2 control-label">签名周期</label>'+
				    '<div class="col-xs-4">'+
				      '<input type="number" class="form-control"  name="qmzq" value="1">'+
				    '</div>'+
				 ' </div>'+
				  
				    '<div class="form-group">'+
				    '<label   class="col-xs-2 control-label">签名描述</label>'+
				    '<div class="col-xs-4">'+
				      '<input type="text" class="form-control"  name="qmms">'+
				   ' </div>'+
				    
				     
				    '<div class="col-xs-4 col-xs-offset-2">'+
				     '<a class="btn btn-danger qmdel">删除</a>'+
				    '</div>'+
				  '</div>'+
					
					

				  '</div>';
			
			
			var newob = $(viewstr);
			
			
			
			
			
			$('#qmcontainer').append(newob);
			
			
			This.qmDel();
			
			
			
			
			
			
		})
		
		
		
		
		
		
	}
	
	
	this.qmDel = function(){
		
		
		
		
		$(".qmdel").on('click',function(){
			
			
			
		   var wrapper = $(this).parent().parent().parent();
			
			
			wrapper.remove();
			
			
			
		})
		
		
		
		
		
	}
	
	this.addCllb = function(){
		
		var This = this;
		
		
		$('#addcllbbtn').on('click',function(){
			
			
			This.index++;
			
			
			
			var viewstr = '<div id="clwrapper" style="padding-top:30px;margin-top:30px; border:2px solid #cccccc">'+
			      
			      	'<input type="hidden" class="clhiddenclass" value="'+This.index+'" name="clhidden">'+
		           '<div class="form-group">'+
	             '<label   class="col-xs-3 control-label">材料类别名称</label>'+
	                 '<div class="col-xs-5">'+
	                     '<input type="text" class="form-control"  name="cllbmc'+This.index+'">'+
	                 '</div>'+
	                 
	                 '<div class="col-xs-4">'+
	                 
	                    '<a class="cllbdel btn btn-danger" style="width:40%;margin-right:10px">删除</a>'+
	                    
	                    '<a class="addclxqbtn btn btn-danger" style="width:40%">添加材料详情</a>'+
	                    
	                 '</div>'+
	                 
	             
	             '</div>'+
	             
   
	             '</div>';
			
			var newob = $(viewstr);
			
			
			$('#clcontainer').append(newob);
			
			This.addClxq();
			
			This.delCllb();
			
			
			
			
		})
		

		
		
		
		
	}
	
	
	this.addClxq = function(){
		
		   var This = this;
		
		   $(".addclxqbtn").on('click',function(){
			   var i=$(this).parent().parent().parent().children(".clhiddenclass").val();
			   
			   var viewstr ='<div class="form-group">'+
	           '<label   class="col-xs-1 control-label">图片</label>'+
	      	 '<div class="col-xs-3">'+
	      	   '<input type="file" class="form-control"  name="cltp'+i+'">'+
	      	 '</div>'+
	      	 
	      	           '<label   class="col-xs-1 control-label">名称</label>'+
	      	 '<div class="col-xs-2">'+
	      	   '<input type="text" class="form-control"  name="clmc'+i+'">'+
	      	 '</div>'+
	      	 
	      	             '<label   class="col-xs-1 control-label">描述</label>'+
	      	 '<div class="col-xs-2">'+
	      	   '<input type="text" class="form-control"  name="clms'+i+'">'+
	      	 '</div>'+
	      	 
	      	  '<div class="col-xs-2">'+
	      	   '<a class="btn btn-danger delclxqbtn">删除</a>'+
	      	 '</div>'+
	      	'</div>';
			   
			   var newob = $(viewstr);
			   
			   $(this).parent().parent().parent().append(newob);
			   
			   This.delClXq();
			   
			   
		   })
		
		
		
		
	}
	
	
	this.delClXq  = function(){
		
		
		$('.delclxqbtn').on('click',function(){
			
			
			 
			  $(this).parent().parent().remove();
			
			
			
			
			
		})
		
		
		
		
		
	}
	
	this.delCllb = function(){
		
		
		$(".cllbdel").on('click',function(){
			
			$(this).parent().parent().parent().remove();
			
			
			
			
		})
		
		
		
	}
	
	
	
	
	this.querycpurl = "selectfrompage";
	
	
	
	this.getPromise = function(cpmc,lxid,beginjg,endjg,beginfbsj,endfbsj,sjid,mbid,zt,curpage){
		
		var This = this;
		
		var promise = $.ajax({
			
			url:This.querycpurl,
			
			dataType:'json',
			
			type:'post',
			
			data:{
				
				cpmc:cpmc,
				
				lxid:lxid,
				
				beginjg:beginjg,
				
				endjg:endjg,
				
				beginfbsj:beginfbsj,
				
				endfbsj:endfbsj,
				
				sjid:sjid,
				mbid:mbid,
				
				zt:zt,
				curpage:curpage
				
				}
			
			
			
		});
		
		
		return promise;
		
		
	}
	
	
	this.ListnerQuery = function(){
		
		
		var This = this;
		
		
		$('#querybtn').on('click',function(){
			
			
			This.ComPageTable(1);
			
			
			
			
		})
		
		
		
	}
	
	
	this.ComPageTable = function(curpage){
		
		
		var This = this;
		
		
		var beginjg = $('#beginjgid').val();
		
		
		
		var endjg = $('#endjgid').val();
		
		var beginfbsj = $('#beginfbsjid').val();
		
		var endfbsj = $('#endfbsjid').val();
		
		var cpmc = $('#cpmcid').val();
		
		var lxid = $('#lid').val();
		
		
		var sjid=$('#sjid').val();
		
		var mbid = $('#mbid').val();
		
		var zt = $('#ztid').val();
		
		
		var promise = this.getPromise(cpmc,lxid,beginjg,endjg,beginfbsj,endfbsj,sjid,mbid,zt,curpage);
		
		
		promise.done(function(data){
			
			
			   var cps = data.cps;
			   
			   var pagecount = data.pagecount;
			   
			   var curpage = data.curpage;
			   
			   
			   This.comPageNav(pagecount,curpage);
			   This.comTable(cps);
			   
			   This.ListenerNb();
			   
			   This.ListenerNlAndNr(curpage,pagecount);
			
			
			
			
			
			
		})
		
		
		
		
	}
	
	this.ListenerNb = function() {
		var This = this;

		$('.nb').on('click', function() {

			var c = $('.nb').index($(this)) + 1;

			This.ComPageTable(c);

		})

	}
	
	
	this.ListenerNlAndNr = function(currpage, pagecounts) {

		var This = this;

		$("#nl").on('click', function() {

			if (currpage > 1) {

				var c = --currpage;

				This.ComPageTable(c);

			}

		})

		$("#nr").on('click', function() {

			if (currpage < pagecounts) {

				var c = ++currpage;

				This.ComPageTable(c);

			}

		})

	}
	
	
	this.comPageNav = function(pagecount,currpage){
		
		
		var str = "";

		str += '<li>' + '<a href="#" aria-label="Previous" id="nl">'
				+ '<span aria-hidden="true">&laquo;</span>' + '</a>' + '</li>';

		for (var i = 1; i <= pagecount; i++) {

			if (i == currpage) {

				str += '<li class="active nb"><a href="#">' + i + '</a></li>';

			}

			else {
				str += '<li class="nb"><a href="#">' + i + '</a></li>';
			}

		}

		str += '<li>' + '<a href="#" aria-label="Next" id="nr">'
				+ '<span aria-hidden="true">&raquo;</span>' + '</a>' + '</li>';
		
		$('#nav').html(str);
		
	}
	
	this.comTable = function(cps){
		
		
		var str = "";

		str += '<tr>' +

		'<th>产品图片</th>' +

		'<th>产品名称</th>' +
		
		'<th>产品价格</th>' +
		
		'<th>发布时间</th>' +
		
		'<th>类别</th>' +
		
		'<th>模板</th>' +

		'<th>商家</th>' +
		
		'<th>操作</th>' +
		
		'</tr>';
		
	for(var i=0;i<cps.length;i++){
		
		var ob = cps[i];
		
		var cptp = ob.cptp;
		
		var cpmc = ob.cpmc;
		
		var cpjg = ob.cpjg;
		
		var fbsj = ob.fbsj;
		
		var lxs = ob.lxs;
		
		var lstr = "";
		
		for(var j=0;j<lxs.length;j++){
			
			var lxob = lxs[j];
			
			
			if(j==0){
				
				lstr +=lxob.mc;
			}
			
			else{
			
			lstr +="/"+lxob.mc;
			}
			
		}
		
		var mbmc = ob.mb.mbmc;
		
		
		var sjmc = ob.sj.sjmc;
		
		
		str += '<tr>' +

		'<td>'+'<img src="'+cptp+'">'+'</td>' +

		'<td>'+cpmc+'</td>' +
		
		'<td>'+cpjg+'</td>' +
		
		'<td>'+fbsj+'</td>' +
		
		'<td>'+lstr+'</td>' +
		
		'<td>'+mbmc+'</td>' +

		'<td>'+sjmc+'</td>' +
		
	
		'<td><a href="updatecp?cpid=' + ob.id+ '" class="btn btn-warning" >操作</a></td>' +
		
		'</tr>';
		
		
		
		
		
		
	}
	
	$("#cpdata").html(str);
		

		
		
		
		
		
	}
	
	
}