package com.orilore.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.orilore.bizs.IB_ccBiz;
import com.orilore.bizs.IB_cpBiz;
import com.orilore.bizs.IB_cpqmBiz;
import com.orilore.bizs.IB_cpxtBiz;
import com.orilore.bizs.IB_czlbBiz;
import com.orilore.bizs.IB_czxqBiz;
import com.orilore.bizs.IB_lxBiz;
import com.orilore.bizs.IB_ysBiz;
import com.orilore.dto.czdto;
import com.orilore.model.B_cc;
import com.orilore.model.B_cp;
import com.orilore.model.B_cpqm;
import com.orilore.model.B_cpxt;
import com.orilore.model.B_czlb;
import com.orilore.model.B_czxq;
import com.orilore.model.B_ys;

@Controller
public class productcontroller {
	@Resource
	public IB_cpBiz cpbiz;
	@Resource
	public IB_ysBiz ysbiz;
	@Resource
	public IB_cpxtBiz cpxtbiz;
	@Resource
	public IB_cpqmBiz cpqmbiz;
	@Resource
	public IB_czlbBiz czlbbiz;
	@Resource
	public IB_czxqBiz czxqbiz;
	@Resource
	public IB_lxBiz lxbiz;
	@Resource
	public IB_ccBiz ccbiz;
	@RequestMapping(value="/product")
	public String product(@RequestParam(value="id") int id,HttpServletRequest request){
		B_cp cp=cpbiz.getB_cp(id);
		List<B_ys> yss=ysbiz.findbycpid(id);
		List<B_cc> ccs=ccbiz.findbycpid(id);
		List<B_cpxt> cpxts=cpxtbiz.findbycpid(id);
		List<B_cpqm> cpqms=cpqmbiz.findbycpid(id);
		List<B_czlb> czlbs=czlbbiz.findbycpid(id);
		List<czdto> czdtos=new ArrayList<czdto>();
		for (B_czlb czlb : czlbs) {
			czdto czdto=new czdto();
			int czlbid=czlb.getId();
			String czlbmc=czlb.getCzlbmc();
			List<B_czxq> czxqs=czxqbiz.findbyczlbid(czlbid);
			czdto.setCzlbmc(czlbmc);
			czdto.setCzxqs(czxqs);
			czdtos.add(czdto);
		}
		
		request.setAttribute("lxbypids", lxbiz.findbypid(0));
		request.setAttribute("ccs", ccs);
		request.setAttribute("cp", cp);
		request.setAttribute("yss", yss);
		request.setAttribute("cpxts", cpxts);
		request.setAttribute("cpqms", cpqms);
		request.setAttribute("czdtos", czdtos);
		return "product.jsp";
	}
}
