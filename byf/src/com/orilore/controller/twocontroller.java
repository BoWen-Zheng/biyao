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
import com.orilore.dto.lxcpdto;
import com.orilore.dto.lxcpmbdto;
import com.orilore.model.B_cp;
import com.orilore.model.B_cp_lx;
import com.orilore.model.B_lx;
import com.orilore.model.B_sj;

@Controller
public class twocontroller {
@Resource
public IB_lxBiz lxbiz;
@Resource
public IB_cpBiz cpbiz;
@Resource
public IB_cp_lxBiz cp_lxbiz;
@Resource
public IB_sjBiz sjbiz;
@Resource
public IB_mbBiz mbbiz;
@RequestMapping(value="/two")
public String two(HttpServletRequest request){
	
	int id=Integer.parseInt(request.getParameter("id"));
	B_lx flx=lxbiz.getB_lx(id);
	request.setAttribute("lx", flx);
	List<B_lx> lxs=lxbiz.findbypid(id);
	request.setAttribute("clxs", lxs);
	
	request.setAttribute("lxbypids", lxbiz.findbypid(0));
	
	List<lxcpmbdto> lxcpmbdtos=new ArrayList<lxcpmbdto>();
	if(lxs.size()!=0){
	for (B_lx clx : lxs) {
		lxcpmbdto lxcpmbdto=new lxcpmbdto();
		List<B_cp_lx> cp_lxs=cp_lxbiz.findbylxid(clx.getId());
		List<cpdto> cpdtos=new ArrayList<cpdto>();
		for (B_cp_lx b_cp_lx : cp_lxs) {
			cpdto cpdto=new cpdto();
			List<B_sj> sjs=new ArrayList<B_sj>();
			B_cp cp=cpbiz.getB_cp(b_cp_lx.getCpid());
			String mb=mbbiz.getB_mb(cp.getMid()).getMbdz();
			cpdto.setCp(cp);
			cpdto.setMb(mb);
			cpdtos.add(cpdto);
			sjs.add(sjbiz.getB_sj(cpbiz.getB_cp(b_cp_lx.getCpid()).getSjid()));
			lxcpmbdto.setSjs(sjs);
			lxcpmbdto.setCpdtos(cpdtos);
		}
		
		
		lxcpmbdto.setLx(clx);
		lxcpmbdtos.add(lxcpmbdto);
	}
	
	}else{
		lxcpmbdto lxcpmbdto=new lxcpmbdto();
		List<B_cp_lx> cplx = cp_lxbiz.findbylxid(flx.getId());
		List<cpdto> cpdtos=new ArrayList<cpdto>();
		for (B_cp_lx b_cp_lx : cplx) {
			cpdto cpdto=new cpdto();
			List<B_sj> sjs=new ArrayList<B_sj>();
			B_cp cp=cpbiz.getB_cp(b_cp_lx.getCpid());
			B_lx lx=lxbiz.getB_lx(b_cp_lx.getLxid());
			String mb=mbbiz.getB_mb(cp.getMid()).getMbdz();
			cpdto.setCp(cp);
			cpdto.setMb(mb);
			cpdtos.add(cpdto);
			sjs.add(sjbiz.getB_sj(cpbiz.getB_cp(b_cp_lx.getCpid()).getSjid()));
			lxcpmbdto.setSjs(sjs);
			lxcpmbdto.setLx(lx);
			lxcpmbdto.setCpdtos(cpdtos);
		}
	
		lxcpmbdtos.add(lxcpmbdto);
	}
	
	
	
	
	
	
	
	request.setAttribute("dtos", lxcpmbdtos);
	return "two.jsp";
}
/*@RequestMapping(value="/showtwocp")
public List<lxcpdto> showtwocp(HttpServletRequest request){
	String cid=request.getParameter("cid");
	int icid=Integer.parseInt(cid);
	List<B_lx> slx=lxbiz.findbypid(icid);
	List<lxcpdto> lxcpdtos=new ArrayList<lxcpdto>();
	lxcpdto lxcpdto=new lxcpdto();
	if(slx!=null){
		for (B_lx lx : slx) {
			int slxid=lx.getId();
			lxcpdto.setLx(lx);
			List<B_cp_lx> cplxs=cp_lxbiz.findbylxid(slxid);
			List<B_cp> cps=new ArrayList<B_cp>();
			List<B_sj> sjs=new ArrayList<B_sj>();
			for (B_cp_lx b_cp_lx : cplxs) {
				int cpid=b_cp_lx.getCpid();
				cps.add(cpbiz.getB_cp(cpid));
				sjs.add(sjbiz.getB_sj(cpbiz.getB_cp(cpid).getSjid()));
			}
			lxcpdto.setCps(cps);
			lxcpdto.setSjs(sjs);
		}
		
		
	}else{
		List<B_lx> tlxs=lxbiz.findbypid(lxbiz.getB_lx(icid).getPid());
		for (B_lx lx : tlxs) {
			int tlxid=lx.getId();
			lxcpdto.setLx(lx);
			List<B_cp_lx> cplxs=cp_lxbiz.findbylxid(tlxid);
			List<B_cp> cps=new ArrayList<B_cp>();
			List<B_sj> sjs=new ArrayList<B_sj>();
			for (B_cp_lx b_cp_lx : cplxs) {
				int cpid=b_cp_lx.getCpid();
				cps.add(cpbiz.getB_cp(cpid));
				sjs.add(sjbiz.getB_sj(cpbiz.getB_cp(cpid).getSjid()));
			}
			lxcpdto.setCps(cps);
			lxcpdto.setSjs(sjs);
		}
	}
	lxcpdtos.add(lxcpdto);
	return lxcpdtos;
}*/
}
