package com.orilore.controller;

import java.io.File;
import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

import com.orilore.bizs.B_sjBiz;
import com.orilore.bizs.IB_sjBiz;
import com.orilore.dto.sjdto;
import com.orilore.model.B_sj;
import com.orilore.util.config;

import jdk.nashorn.internal.ir.RuntimeNode.Request;
@Controller
public class sjcontroller {
	@Resource
	IB_sjBiz sjbiz=new B_sjBiz();
	@RequestMapping(value="/addsj")
	public String addsj(@RequestParam(value="sjmc") String sjmc,HttpServletRequest request){
		
		
		boolean flag=sjbiz.addB_sj(request, sjmc);
		
		return "redirect:/addsj.jsp?flag="+flag;
	}
	@RequestMapping(value="/selectsj")
	public @ResponseBody sjdto selectsj(int page){
		
		return sjbiz.showview(page);
	}
	@RequestMapping(value="/updatesj")
	public String updatesj(@RequestParam(value="id") int id,HttpServletRequest request){
		B_sj sj=sjbiz.getB_sj(id);
		
		request.setAttribute("sj", sj);
		return "selectsjcz.jsp";
	}
	@RequestMapping(value="/updatesjcz")
	public String updatesjcz(HttpServletRequest request){
		boolean flag=true;
		B_sj bean=new B_sj();
		int id=Integer.parseInt(request.getParameter("id"));
		String sjmc= request.getParameter("sjmc");
		double fwtd=Double.parseDouble(request.getParameter("fwtd"));
		double spzl=Double.parseDouble( request.getParameter("spzl"));
		MultipartRequest mrequest=(MultipartRequest)request;
		MultipartFile file=mrequest.getFile("sjtp");
		B_sj sj=sjbiz.getB_sj(id);
		if(file!=null){
		String path=request.getSession().getServletContext().getRealPath("/");
		String filename=System.currentTimeMillis()+file.getOriginalFilename();
		String pathfilename=path+"upload/"+filename;
		File newfile=new File(pathfilename);
		String httpname=config.url+filename;
		try {
			file.transferTo(newfile);
		} catch (Exception e) {
			flag=false;
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bean.setSjtp(httpname);
		}
		bean.setId(id);
		bean.setSjtp(sj.getSjtp());
		bean.setSjmc(sjmc);
		bean.setFwtd(fwtd);
		bean.setSpzl(spzl);
		
		sjbiz.modifyB_sj(bean);
		return "redirect:/selectsj.jsp?";
	}
}
