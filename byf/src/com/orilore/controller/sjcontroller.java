package com.orilore.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.orilore.bizs.IB_cpBiz;
import com.orilore.bizs.IB_cp_lxBiz;
import com.orilore.bizs.IB_lxBiz;
import com.orilore.bizs.IB_mbBiz;
import com.orilore.bizs.IB_sjBiz;
import com.orilore.dto.cpdto;
import com.orilore.model.B_cp;

import com.orilore.model.B_lx;
import com.orilore.model.B_sj;

@Controller
public class sjcontroller {
	@Resource
	public IB_lxBiz lxbiz;
	@Resource
	public IB_sjBiz sjbiz;
	@Resource
	public IB_cpBiz cpbiz;
	@Resource
	public IB_mbBiz mbbiz;
	@RequestMapping("/merchant")
	public String merchant(HttpServletRequest request){
		List<B_lx> lxbypids=lxbiz.findbypid(0);
		request.setAttribute("lxbypids", lxbypids);
		int cpid=Integer.parseInt(request.getParameter("cpid"));
		B_cp cp=cpbiz.getB_cp(cpid);
		int sjid=cp.getSjid();
		B_sj sj=sjbiz.getB_sj(sjid);
		request.setAttribute("sj", sj);
		List<B_cp> cps=cpbiz.findbysjid(sjid);
		List<cpdto> cpdtos=new ArrayList<cpdto>();
		for (B_cp b_cp : cps) {
			cpdto cpdto=new cpdto();
			String mb=mbbiz.getB_mb(b_cp.getMid()).getMbdz();
			cpdto.setCp(b_cp);
			cpdto.setMb(mb);
			cpdtos.add(cpdto);
		}
		request.setAttribute("cps", cpdtos);
		return "merchant.jsp";
		
	}
}
