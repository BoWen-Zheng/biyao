package com.orilore.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.orilore.bizs.IB_cpBiz;
import com.orilore.bizs.IB_cp_lxBiz;
import com.orilore.bizs.IB_lxBiz;
import com.orilore.bizs.IB_sjBiz;
import com.orilore.dto.lxcpdto;
import com.orilore.model.B_cp;
import com.orilore.model.B_cp_lx;
import com.orilore.model.B_lx;
import com.orilore.model.B_sj;



@Controller
public class homecontroller {
	@Resource
	public IB_lxBiz lxbiz;
	@Resource
	public IB_cp_lxBiz cp_lxbiz;
	@Resource
	public IB_cpBiz cpbiz;
	@Resource
	public IB_sjBiz sjbiz;
	@RequestMapping(value="/home")
	public String homeselect(HttpServletRequest request){
		List<B_lx> lxs=lxbiz.findbyxszt(1);
		List<lxcpdto> lxcpdtos=new ArrayList<lxcpdto>();
		for (B_lx lx : lxs) {
			lxcpdto lxcpdto=new lxcpdto();
			lxcpdto.setLx(lx);
			int lxid=lx.getId();
			List<B_cp_lx> cplxs=cp_lxbiz.findbylxid(lxid);
			List<B_cp> cps=new ArrayList<B_cp>();
			List<B_sj> sjs=new ArrayList<B_sj>();
			for (B_cp_lx cplx : cplxs) {
				int cpid=cplx.getCpid();
				
				B_cp cp=cpbiz.getB_cp(cpid);
				int sjid=cp.getSjid();
				B_sj sj=sjbiz.getB_sj(sjid);
				cps.add(cp);
				sjs.add(sj);
				lxcpdto.setCps(cps);
				
			}
			lxcpdto.setSjs(sjs);
			lxcpdtos.add(lxcpdto);
		}
		List<B_lx> lxbypids=lxbiz.findbypid(0);
		request.setAttribute("lxbypids", lxbypids);
		request.setAttribute("lxcpdtos", lxcpdtos);
		List<B_cp> lbcps=cpbiz.findbyzt(3);
		request.setAttribute("lbcps", lbcps);
		
		List<B_cp> xpcp=cpbiz.findbyzt(3);
		
		request.setAttribute("xpcp1", xpcp.get(0));
		request.setAttribute("xpcp2", xpcp.get(1));
		return "home.jsp";
	}
	@RequestMapping(value="/lxchlidren")
	public @ResponseBody List<B_lx> lxchidren(HttpServletRequest request){
		int pid=Integer.parseInt(request.getParameter("pid"));
		List<B_lx> chidrenlxs=lxbiz.findbypid(pid);
		return chidrenlxs;
	}
}
