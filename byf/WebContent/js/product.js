function product(){
	this.img=function(){
		$(".main .images ul li img").on("click",function(){
			$(".main .images ul li").css("border","1px solid #cccccc");
			$(this).parent().css("border","1px solid red");
			var src=$(this).attr("src");
			$(".main .images .img img").attr("src",src);
		})
		
		$(".text ul:eq(1) img").on("click",function(){
			$(".text ul:eq(1) img").css("border","1px solid #cccccc");
			$(this).css("border","1px solid red");
			$("input[name='ys']").remove();
			$(this).parent().append('<input name="ys" type="hidden" value="'+$(this).attr("ysid")+'">');
			var src=$(this).attr("src");
			$(".main .images .img img").attr("src",src);
		})
		$(".text ul:eq(2) li:not(:first)").on("click",function(){
			$("input[name='cc']").remove();
			$(this).append('<input name="cc" type="hidden" value="'+$(this).attr("ccid")+'">');
			$(".text ul:eq(2) li:not(:first)").css("border","1px solid #cccccc");
			$(this).css("border","1px solid red");
			
		})
		
		$(".text ul:eq(3) a:first").on("click",function(){
			var html=$(".text ul:eq(3) li:eq(2)").html();
			$("input[name='cpsl']").remove();
			if(html>1){
				html--;
				$(".text ul:eq(3) li:eq(2)").html(html);
			}
			$(".text ul:eq(3)").append('<input name="cpsl" type="hidden" value="'+$(".text ul:eq(3) li:eq(2)").html()+'">');
		})
		$(".text ul:eq(3) a:last").on("click",function(){
			var html=$(".text ul:eq(3) li:eq(2)").html();
			$("input[name='cpsl']").remove();
			if(html<1000){
				html++;
				$(".text ul:eq(3) li:eq(2)").html(html);
			}
			$(".text ul:eq(3)").append('<input name="cpsl" type="hidden" value="'+$(".text ul:eq(3) li:eq(2)").html()+'">');
		})
		$(".text>a:last").on("click",function(){
			$(".text ul:eq(3)").append('<input name="cpsl" type="hidden" value="'+$(".text ul:eq(3) li:eq(2)").html()+'">')
			
			
			
		})
	}
	
	
	
	
	
}