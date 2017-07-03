package com.orilore.controller;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.orilore.bizs.IB_cpBiz;
import com.orilore.bizs.IB_lxBiz;
import com.orilore.dto.Fbsjxpdto;
import com.orilore.model.B_cp;



@Controller
public class everydaycontroller {
@Resource
public IB_lxBiz lxbiz;
@Resource
public IB_cpBiz cpbiz;
@RequestMapping(value="/everyday")
public String everyday(HttpServletRequest request) throws ParseException{
	request.setAttribute("lxbypids", lxbiz.findbypid(0));
	List<B_cp> cps=cpbiz.findbyzt(2);
	LinkedHashSet<String> set=new LinkedHashSet<String>();
	for (B_cp cp : cps) {
		String fbsj=cp.getFbsj();
		
		SimpleDateFormat sdf=new SimpleDateFormat("MM月dd日");
		SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date=sf.parse(fbsj);
		String str=sdf.format(date);
		set.add(str);
	}
	List<Fbsjxpdto> dtos=new ArrayList<Fbsjxpdto>();
	Iterator<String> iter=set.iterator();
	while(iter.hasNext()){
		String it=iter.next();
		Fbsjxpdto dto=new Fbsjxpdto();
		List<B_cp> cpss=new ArrayList<B_cp>();
	for(B_cp cp : cps){
		String fbsj=cp.getFbsj();
		
		SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat sdf=new SimpleDateFormat("MM月dd日");
		Date sj=sf.parse(fbsj);
		String nsj=sdf.format(sj);
		
		if(nsj.equals(it)){
			cpss.add(cp);
			
		}
	}
	dto.setFbsj(it);
	dto.setXps(cpss);
	dtos.add(dto);
	}
	
	request.setAttribute("fbsjcpsdto", dtos);
	return "everyday.jsp";
}
}
