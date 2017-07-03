package com.orilore.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.orilore.bizs.IB_lxBiz;
import com.orilore.model.B_lx;



@Controller
public class lxcontroller {
	@Resource
	public IB_lxBiz lxbiz;
	@RequestMapping(value="/selectaddlx")
	public String selectaddlx(HttpServletRequest request){
		request.setAttribute("trees", lxbiz.selecttrees());
		return "addlx.jsp";
	}
	@RequestMapping(value="/addlx")
	public String addlx(@RequestParam(value="mc") String mc,@RequestParam(value="bm") String bm,@RequestParam(value="pid") int pid,@RequestParam(value="xszt") int xszt){
		B_lx lx=new B_lx();
		lx.setMc(mc);
		lx.setBm(bm);
		lx.setLevel(pid+1);
		lx.setPid(pid);
		lx.setXszt(xszt);
		boolean flag=lxbiz.addB_lx(lx);
		return "redirect:/selectaddlx?flag="+flag;
	}
	@RequestMapping(value="/selectlx")
	public String selectlx(HttpServletRequest request){
		lxbiz.selecttrees();
		request.setAttribute("lx", lxbiz.selecttrees());
		
		return "selectlx.jsp";
	}
	@RequestMapping(value="/selectlxcz")
	public String selectlxcz(@RequestParam(value="id") int id,HttpServletRequest request){
		B_lx lx=lxbiz.getB_lx(id);
		request.setAttribute("trees", lxbiz.selecttrees());
		request.setAttribute("lx", lx);
		return "selectlxcz.jsp";
	}
	@RequestMapping(value="/updatelxzt")
	public String updatelx(@RequestParam(value="id") int id,@RequestParam(value="mc") String mc,@RequestParam(value="bm") String bm,@RequestParam(value="zt") int zt,@RequestParam(value="pid") int pid,@RequestParam(value="xszt") int xszt){
		
		lxbiz.updatelx(id, mc, bm, zt,pid,xszt);
		
		return "selectlx";
	}
	@RequestMapping(value="/checkupdatelx")
	public @ResponseBody boolean checkupdatelx(@RequestParam(value="pid") int pid,@RequestParam(value="id") int id){
		boolean flag=lxbiz.checkupdatelx(pid, id);
		return flag;
		
	}
}
