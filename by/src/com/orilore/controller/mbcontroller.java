package com.orilore.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.orilore.bizs.IB_mbBiz;
import com.orilore.model.B_mb;

@Controller
public class mbcontroller {
	@Resource
	public IB_mbBiz mbbiz;
	@RequestMapping(value="/addmb")
	public String addmb(@RequestParam(value="mbmc") String mbmc,@RequestParam(value="mbdz") String mbdz){
		B_mb b_mb=new B_mb();
		b_mb.setMbmc(mbmc);
		b_mb.setMbdz(mbdz);
		boolean flag=mbbiz.addB_mb(b_mb);
		return "redirect:/addmb.jsp?flag="+flag;
	}
	@RequestMapping(value="/selectmb")
	public String selectmb(HttpServletRequest request){
		request.setAttribute("mb", mbbiz.findB_mb());
		return "selectmb.jsp";
	}
	@RequestMapping(value="/selectmbcz")
	public String selectmbcz(@RequestParam(value="id") int id,HttpServletRequest request){
		System.out.println(id);
		B_mb mb=mbbiz.getB_mb(id);
		request.setAttribute("mb", mb);
		return "selectmbcz.jsp";
		
	}
	@RequestMapping(value="/updatembzt")
	public String updatembzt(@RequestParam(value="id") int id,@RequestParam(value="mbmc") String mbmc,@RequestParam(value="mbdz") String mbdz){
		B_mb mb=new B_mb();
		mb.setId(id);
		mb.setMbmc(mbmc);
		mb.setMbdz(mbdz);
		mbbiz.modifyB_mb(mb);
		return "selectmb";
	}
}
