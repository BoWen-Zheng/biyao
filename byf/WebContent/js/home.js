function home(){
	this.zindex=1;
	this.num=0;
	this.lbshow=function(){
		var This=this;
		var lbwidth=$(".carousel").width();
		var navwidth=$(".carousel ol").width();
		var left=(lbwidth-navwidth)/2;

		$(".carousel ol").css("left",left+"px");
		$(".carousel ol li").eq(This.num).addClass("change");
		$(".carousel ul li").eq(This.num).css("zIndex",This.zindex);
		$(".carousel ol").css("zIndex",This.zindex);
		 
	}
	this.lbnow=function(){
		var This=this;
		var i=$(".carousel ul li").length;
		var index=this.num%i;
		$(".carousel ul li").eq(index).css('zIndex',This.zindex).css('opacity','0');
		
		$(".carousel ol").css("zIndex",This.zindex);
		console.log($(".carousel ul li").eq(index).css('zIndex'));
		console.log($(".carousel ol").css("zIndex"));
		$(".carousel ol li").removeClass("change");
		$(".carousel ol li").eq(index).addClass("change");
		
		$(".carousel ul li").eq(index).animate({opacity:1},1000,'easeOutQuad');
	}
	this.lb=function(){
		var This=this;
		var timer=window.setInterval(function(){
			This.zindex++;
			This.num++;
			This.lbnow();
			
			
			
			
		}, 3000);
		
		 $(".carousel").on("mouseenter",function(){
				window.clearInterval(timer);
				
				
				
				
			})

			$('.carousel').on('mouseleave',function(){
		   
		   
		
			   
			      This.index++;
			      
			      This.myzindex++;
			      
			      This.lb();
			   
			   
			   
			   
			   
		  
		
			})	

	}
	this.clicknav=function(){
		$(".carousel ol li").on("click",function(){
			
			 var cindex =  $(".carousel ol li").index($(this));
			 
			 This.num = cindex;
			 
			 This.zindex++;
			 This.LbTab();
			
			
			
		})
		
		
		
		
	}
	this.hiddengd=function(){
		var This=this
		if($(".head .bigbox ul").height()>50){
			$(".head .gd").css("display","block");
			This.gdmouseenter();
		}
		
		
	}
	this.gdmouseenter=function(){
		$(".head .gd").on("mouseenter",function(){
			
			if($(".bigbox ul").css("top")=="0px"){
				$(".bigbox ul").css("transition","top 1s");
				$(".bigbox ul").css("top",-49+"px");
			}
			else{
				$(".bigbox ul").css("transition","top 1s");
				$(".bigbox ul").css("top",0+"px");	
				
			}
			
			
			
			
		})
		
		
		
	}
	
	this.ajax=function(url,param){
		var promise=$.ajax({
		
			url:url,
			type:'post',
			dataType:'json',
			data:{pid:param}
			
			
		})	
		
		return promise;
	}
	
	this.selectchildlx=function(url,param){
		var This=this;
		var promise=this.ajax(url,param);
		promise.done(function(res){
			
			This.addli(res);
		})	
	}
	
	
	this.xlcd=function(url){
		var This=this;
		
		
		$(".head .bigbox>ul>li a").on("mouseenter",function(){
			$(".head .bigbox>ul>li a").css("display","block");
			$(".head .bigbox>a").css("borderBottom","none");
			var index=$(".head .bigbox ul li").index($(this).parent());
			var num=index%9;
			
			var newleft=476+num*73;
			$(".head .bigbox>ul>li a").css("borderBottom","none");
			$(this).css("borderBottom","2px solid black");
			$(".head .xlcd").css({
				display:"block",
				left:newleft+'px'
			});
			var ast=$(this).attr("ast");
			
			This.selectchildlx(url,ast);
			
		})	
		$(".head .bigbox").parent().on("mouseleave",function(){
			$(".head .bigbox>ul>li a").css("display","block");
			$(".head .bigbox>ul>li a").css("borderBottom","none");
			$(".head .bigbox>a").css("borderBottom","2px solid black");
			$(".head .xlcd").css("display","none");
			
		})
	}
	this.addli=function(childlxs){
		var str='';
		for(var i=0;i<childlxs.length;i++){
			str+='<li><a href="two?id='+childlxs[i].id+'">'+childlxs[i].mc+'</a></li>';
			
			
			
		}
		
		$(".head .xlcd>ul").html(str);
		
	}
	
}