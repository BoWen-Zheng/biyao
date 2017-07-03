package com.orilore.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

import com.orilore.bizs.IB_ccBiz;
import com.orilore.bizs.IB_cpBiz;
import com.orilore.bizs.IB_cp_lxBiz;
import com.orilore.bizs.IB_cpqmBiz;
import com.orilore.bizs.IB_cpxtBiz;
import com.orilore.bizs.IB_czlbBiz;
import com.orilore.bizs.IB_czxqBiz;
import com.orilore.bizs.IB_lxBiz;
import com.orilore.bizs.IB_mbBiz;
import com.orilore.bizs.IB_sjBiz;
import com.orilore.bizs.IB_ysBiz;
import com.orilore.dto.cpdto;
import com.orilore.model.B_cc;
import com.orilore.model.B_cp;
import com.orilore.model.B_cp_lx;
import com.orilore.model.B_cpqm;
import com.orilore.model.B_cpxt;
import com.orilore.model.B_czlb;
import com.orilore.model.B_czxq;
import com.orilore.model.B_lx;
import com.orilore.model.B_mb;
import com.orilore.model.B_sj;
import com.orilore.model.B_ys;
import com.orilore.util.config;



@Controller
public class cpcontroller {
@Resource
public IB_sjBiz sjbiz;
@Resource
public IB_mbBiz mbbiz;
@Resource
public IB_cpBiz cpbiz;
@Resource
public IB_ysBiz ysbiz;
@Resource
public IB_ccBiz ccbiz;
@Resource
public IB_cpqmBiz cpqmbiz;
@Resource
public IB_cpxtBiz cpxtbiz;
@Resource
public IB_lxBiz lxbiz;
@Resource
public IB_cp_lxBiz cp_lxbiz;
@Resource
public IB_czlbBiz czlbbiz;
@Resource
public IB_czxqBiz czxqbiz;

@RequestMapping(value="/addcp")
public String selectsjmb(HttpServletRequest request){
	List<B_sj> sjs=sjbiz.findB_sj();
	List<B_mb> mbs=mbbiz.findB_mb();
	request.setAttribute("sjs", sjs);
	request.setAttribute("mbs", mbs);
	request.setAttribute("trees", lxbiz.selecttrees());
	return "addsp.jsp";
}
@RequestMapping(value="/add")
public String addcp(HttpServletRequest request) throws IllegalStateException, IOException{
	

	String cpmc=request.getParameter("cpmc");
	String cpms=request.getParameter("cpms");
	String sczq=request.getParameter("sczq");
	String cpjg=request.getParameter("cpjg");
	String cpxq=request.getParameter("detail");
	String zt=request.getParameter("zt");
	MultipartRequest mrequest=(MultipartRequest) request;
	MultipartFile realfile= mrequest.getFile("cpzt");
	String realname=System.currentTimeMillis()+realfile.getOriginalFilename();
	String realurl=request.getSession().getServletContext().getRealPath("/");
	String realpath=realurl+"upload/"+realname;
	File newfile=new File(realpath);
	realfile.transferTo(newfile);
	String url=config.url+realname;
	String sj=request.getParameter("sj");
	MultipartFile realfile1= mrequest.getFile("lbtp");
	String realname1=System.currentTimeMillis()+realfile1.getOriginalFilename();
	
	String realpath1=realurl+"upload/"+realname1;
	File newfile1=new File(realpath1);
	realfile1.transferTo(newfile1);
	String url1=config.url+realname1;
	MultipartFile realfile2= mrequest.getFile("xptp");
	String realname2=System.currentTimeMillis()+realfile2.getOriginalFilename();
	
	String realpath2=realurl+"upload/"+realname2;
	File newfile2=new File(realpath2);
	realfile2.transferTo(newfile2);
	String url2=config.url+realname2;
	String mb=request.getParameter("mb");
	Calendar cd = Calendar.getInstance();
	Date date=cd.getTime();
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	String fbsj=sdf.format(date);
	
	B_cp cp=new B_cp();
	cp.setCpmc(cpmc);
	cp.setCpjg(Double.parseDouble(cpjg));
	cp.setCpms(cpms);
	cp.setCptp(url);
	cp.setCpxq(cpxq);
	cp.setFbsj(fbsj);
	cp.setLbtp(url1);
	cp.setSjid(Integer.parseInt(sj));
	cp.setMid(Integer.parseInt(mb));
	cp.setXptp(url2);
	cp.setZt(Integer.parseInt(zt));
	cp.setSczq(Integer.parseInt(sczq));
	boolean flag=cpbiz.addB_cp(cp);
	int cpid=cp.getId();
	
	List<MultipartFile> tpfiles=mrequest.getFiles("ystp");
	List<MultipartFile> ztfiles=mrequest.getFiles("yszt");
	String[] ysmcs=request.getParameterValues("ysmc");
	for (int i=0;i<ysmcs.length;i++) {
		B_ys ys=new B_ys();
		MultipartFile tpfile=tpfiles.get(i);
		
		String tpfilename=System.currentTimeMillis()+tpfile.getOriginalFilename();
		
		String tprealpath=realurl+"upload/"+tpfilename;
		File newtpfile=new File(tprealpath);
		tpfile.transferTo(newtpfile);
		String tpurl=config.url+tpfilename;
		ys.setYstp(tpurl);
		
		MultipartFile ztfile=ztfiles.get(i);
		String ztfilename=System.currentTimeMillis()+ztfile.getOriginalFilename();
		
		String ztrealpath=realurl+"upload/"+tpfilename;
		File newztfile=new File(ztrealpath);
		ztfile.transferTo(newztfile);
		String zturl=config.url+ztfilename;
		ys.setCptp(zturl);
		ys.setYsmc(ysmcs[i]);
		ys.setCpid(cpid);
		ysbiz.addB_ys(ys);
	}
	String qmjg=request.getParameter("qmjg");
	String qmzq=request.getParameter("qmzq");
	String qmms=request.getParameter("qmms");
	B_cpqm qm=new B_cpqm();
	qm.setCpid(cpid);
	qm.setQmjg(Integer.parseInt(qmjg));
	qm.setQmms(qmms);
	qm.setQmzq(Integer.parseInt(qmzq));
	cpqmbiz.addB_cpqm(qm);
	List<MultipartFile> cpxtfiles=mrequest.getFiles("cpxt");
	for (MultipartFile xtfile : cpxtfiles) {
		String xtfilename=System.currentTimeMillis()+xtfile.getOriginalFilename();
		
		String xtrealpath=realurl+"upload/"+xtfilename;
		File newxtfile=new File(xtrealpath);
		xtfile.transferTo(newxtfile);
		String xturl=config.url+xtfilename;
		B_cpxt cpxt=new B_cpxt();
		cpxt.setCpid(cpid);
		cpxt.setXqtp(xturl);
		cpxtbiz.addB_cpxt(cpxt);
	}
	String lx=request.getParameter("lx");
	
	B_cp_lx b_cp_lx=new B_cp_lx();
	b_cp_lx.setCpid(cpid);
	b_cp_lx.setLxid(Integer.parseInt(lx));
	cp_lxbiz.addB_cp_lx(b_cp_lx);
	List<B_lx> flxs=lxbiz.familytree(Integer.parseInt(lx));
	for (B_lx b_lx : flxs) {
		
		int lxid=b_lx.getId();
		b_cp_lx.setCpid(cpid);
		b_cp_lx.setLxid(lxid);
		cp_lxbiz.addB_cp_lx(b_cp_lx);
	}
	
	String index=request.getParameter("clhidden");
	System.out.println(index);
	int num=Integer.parseInt(index);
	B_czlb cllb=new B_czlb(); 
	B_czxq czxq=new B_czxq();
	for(int i=0;i<num;i++){
		String czlb=request.getParameter("cllbmc"+(i+1));
		List<MultipartFile> cltp=mrequest.getFiles("cltp"+(i+1));
		String[] clmc=request.getParameterValues("clmc"+(i+1));
		String[] clms=request.getParameterValues("clms"+(i+1));
		
		cllb.setCpid(cpid);
		cllb.setCzlbmc(czlb);
		czlbbiz.addB_czlb(cllb);
		int clid=cllb.getId();
		for(int j=0;j<clmc.length;j++){
			
			MultipartFile czfile=cltp.get(j);
			String czfilename=System.currentTimeMillis()+czfile.getOriginalFilename();
			
			String czrealpath=realurl+"upload/"+czfilename;
			File newczfile=new File(czrealpath);
			czfile.transferTo(newczfile);
			String czurl=config.url+czfilename;
			czxq.setCzlbid(clid);
			czxq.setCztp(czurl);
			czxq.setCzmc(clmc[j]);
			czxq.setCzms(clms[j]);
			czxqbiz.addB_czxq(czxq);
		}
		
		
	}
	
	String[] ccmcs=request.getParameterValues("ccmc");
	for (int i = 0; i < ccmcs.length; i++) {
		B_cc cc=new B_cc();
		String ccmc=ccmcs[i];
		cc.setCcmc(ccmc);
		cc.setCpid(cpid);
		ccbiz.addB_cc(cc);
	}
	
	return "redirect:/addsp.jsp?flag="+flag;
	}


@RequestMapping(value="/selectcp")
public String selectcp(HttpServletRequest request){
	List<B_sj> sjs=sjbiz.findB_sj();
	List<B_mb> mbs=mbbiz.findB_mb();
	request.setAttribute("sjs", sjs);
	request.setAttribute("mbs", mbs);
	request.setAttribute("trees", lxbiz.selecttrees());
	
	return "selectcp.jsp";
	
}


@RequestMapping(value="/selectfrompage")
public @ResponseBody cpdto selectcpbytj(HttpServletRequest request){
	int pagecount=cpbiz.selectcount(request);
	String page=request.getParameter("curpage");
	int nowpage=0;
	if(page==null||page==""){
		nowpage=1;
	}else{
		nowpage=Integer.parseInt(page);
	}
	List<B_cp> cps=cpbiz.selectcpbyid(request, nowpage);
	cpdto cpdto=new cpdto();
	cpdto.setCps(cps);
	cpdto.setNowpage(nowpage);
	cpdto.setPagecount(pagecount);
	return cpdto;
}
@RequestMapping(value="/updatecp")
public String selectupdate(HttpServletRequest request){
	List<B_sj> sjs=sjbiz.findB_sj();
	List<B_mb> mbs=mbbiz.findB_mb();
	request.setAttribute("sjs", sjs);
	request.setAttribute("mbs", mbs);
	request.setAttribute("trees", lxbiz.selecttrees());
	String cpid=request.getParameter("cpid");
	System.out.println(cpid);
	int id=Integer.parseInt(cpid);
	B_cp cp=cpbiz.getB_cp(id);
	List<B_ys> ys=ysbiz.getB_ysbycpid(id);
	List<B_cc> cc=ccbiz.getB_ccbycpid(id);
	List<B_cpxt> cpxt=cpxtbiz.getB_cpxtbycpid(id);
	List<B_czlb> czlb=czlbbiz.getB_czlbbycpid(id);
	List<B_czxq> czxq=new ArrayList<B_czxq>();
	for (B_czlb b_czlb : czlb) {
		int czlbid=b_czlb.getId();
		B_czxq xq=czxqbiz.getB_czxqbyczlbid(czlbid);
		czxq.add(xq);
	}
	
	
	List<B_cpqm> cpqm=cpqmbiz.getB_cpqmbycpid(id);
	request.setAttribute("cpqm", cpqm);
	request.setAttribute("cp", cp);
	request.setAttribute("ys", ys);
	request.setAttribute("cc", cc);
	request.setAttribute("cpxt", cpxt);
	request.setAttribute("czlb", czlb);
	request.setAttribute("czxq", czxq);
	return "updatecp.jsp";
}
@RequestMapping(value="/updateallcp")
public String updateallcp(HttpServletRequest request) throws IllegalStateException, IOException{
	String cpid=request.getParameter("cpid");
	B_cp cp=cpbiz.getB_cp(Integer.parseInt(cpid));
	
	String cpmc=request.getParameter("cpmc");
	String cpms=request.getParameter("cpms");
	String sczq=request.getParameter("sczq");
	String cpjg=request.getParameter("cpjg");
	String cpxq=request.getParameter("detail");
	String zt=request.getParameter("zt");
	MultipartRequest mrequest=(MultipartRequest) request;
	MultipartFile realfile= mrequest.getFile("cpzt");
	String realurl=request.getSession().getServletContext().getRealPath("/");
	if(realfile!=null){
	String realname=System.currentTimeMillis()+realfile.getOriginalFilename();
	
	String realpath=realurl+"upload/"+realname;
	File newfile=new File(realpath);
	realfile.transferTo(newfile);
	String url=config.url+realname;
	cp.setCptp(url);
	}
	String sj=request.getParameter("sj");
	
	MultipartFile realfile1= mrequest.getFile("lbtp");
	if(realfile1!=null){
	String realname1=System.currentTimeMillis()+realfile1.getOriginalFilename();
	
	String realpath1=realurl+"upload/"+realname1;
	
	File newfile1=new File(realpath1);
	realfile1.transferTo(newfile1);
	String url1=config.url+realname1;
	cp.setLbtp(url1);
	}
	MultipartFile realfile2= mrequest.getFile("xptp");
	if(realfile2!=null){
	String realname2=System.currentTimeMillis()+realfile2.getOriginalFilename();
	
	String realpath2=realurl+"upload/"+realname2;
	File newfile2=new File(realpath2);
	realfile2.transferTo(newfile2);
	String url2=config.url+realname2;
	cp.setXptp(url2);
	}
	String mb=request.getParameter("mb");
	Calendar cd = Calendar.getInstance();
	Date date=cd.getTime();
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	String fbsj=sdf.format(date);
	
	
	cp.setCpmc(cpmc);
	cp.setCpjg(Double.parseDouble(cpjg));
	cp.setCpms(cpms);
	
	cp.setCpxq(cpxq);
	cp.setFbsj(fbsj);
	
	cp.setSjid(Integer.parseInt(sj));
	cp.setMid(Integer.parseInt(mb));
	
	cp.setZt(Integer.parseInt(zt));
	cp.setSczq(Integer.parseInt(sczq));
	cpbiz.modifyB_cp(cp);
	
	ysbiz.removeB_ysbycpid(Integer.parseInt(cpid));
	List<MultipartFile> tpfiles=mrequest.getFiles("ystp");
	List<MultipartFile> ztfiles=mrequest.getFiles("yszt");
	String[] ysmcs=request.getParameterValues("ysmc");
	
	for (int i=0;i<ysmcs.length;i++) {
		B_ys ys=new B_ys();
		
		MultipartFile tpfile=tpfiles.get(i);
		
		String tpfilename=System.currentTimeMillis()+tpfile.getOriginalFilename();
		
		String tprealpath=realurl+"upload/"+tpfilename;
		File newtpfile=new File(tprealpath);
		tpfile.transferTo(newtpfile);
		String tpurl=config.url+tpfilename;
		ys.setYstp(tpurl);
		
		MultipartFile ztfile=ztfiles.get(i);
		String ztfilename=System.currentTimeMillis()+ztfile.getOriginalFilename();
		
		String ztrealpath=realurl+"upload/"+tpfilename;
		File newztfile=new File(ztrealpath);
		ztfile.transferTo(newztfile);
		String zturl=config.url+ztfilename;
		ys.setCptp(zturl);
		ys.setYsmc(ysmcs[i]);
		ys.setCpid(Integer.parseInt(cpid));
		ysbiz.addB_ys(ys);

		
	}
	cpqmbiz.removeB_cpqmbycpid(Integer.parseInt(cpid));
	String qmjg=request.getParameter("qmjg");
	String qmzq=request.getParameter("qmzq");
	String qmms=request.getParameter("qmms");
	B_cpqm qm=new B_cpqm();
	qm.setCpid(Integer.parseInt(cpid));
	qm.setQmjg(Integer.parseInt(qmjg));
	qm.setQmms(qmms);
	qm.setQmzq(Integer.parseInt(qmzq));
	cpqmbiz.addB_cpqm(qm);
	cpxtbiz.removeB_cpxtbycpid(Integer.parseInt(cpid));
	List<MultipartFile> cpxtfiles=mrequest.getFiles("cpxt");
	for (MultipartFile xtfile : cpxtfiles) {
		String xtfilename=System.currentTimeMillis()+xtfile.getOriginalFilename();
		
		String xtrealpath=realurl+"upload/"+xtfilename;
		File newxtfile=new File(xtrealpath);
		xtfile.transferTo(newxtfile);
		String xturl=config.url+xtfilename;
		B_cpxt cpxt=new B_cpxt();
		cpxt.setCpid(Integer.parseInt(cpid));
		cpxt.setXqtp(xturl);
		cpxtbiz.addB_cpxt(cpxt);
	}
	
	cp_lxbiz.removeB_cp_lxbycpid(Integer.parseInt(cpid));
	String lx=request.getParameter("lx");
	
	B_cp_lx b_cp_lx=new B_cp_lx();
	b_cp_lx.setCpid(Integer.parseInt(cpid));
	b_cp_lx.setLxid(Integer.parseInt(lx));
	cp_lxbiz.addB_cp_lx(b_cp_lx);
	List<B_lx> flxs=lxbiz.familytree(Integer.parseInt(lx));
	for (B_lx b_lx : flxs) {
		
		int lxid=b_lx.getId();
		b_cp_lx.setCpid(Integer.parseInt(cpid));
		b_cp_lx.setLxid(lxid);
		cp_lxbiz.addB_cp_lx(b_cp_lx);
	}
	
	List<B_czlb> czlbs=czlbbiz.getB_czlbbycpid(Integer.parseInt(cpid));
	for (B_czlb b_czlb : czlbs) {
		int czlbid=b_czlb.getId();
		czxqbiz.removeB_czxqbyczlbid(czlbid);
	}
	czlbbiz.removeB_czlbbycpid(Integer.parseInt(cpid));
	String[] indexs=request.getParameterValues("clhidden");

	
	B_czlb cllb=new B_czlb(); 
	B_czxq czxq=new B_czxq();
	for(String index:indexs ){
		int i=Integer.parseInt(index);
		String czlb=request.getParameter("cllbmc"+index);
		List<MultipartFile> cltp=mrequest.getFiles("cltp"+index);
		String[] clmc=request.getParameterValues("clmc"+index);
		String[] clms=request.getParameterValues("clms"+index);
		
		cllb.setCpid(Integer.parseInt(cpid));
		cllb.setCzlbmc(czlb);
		czlbbiz.addB_czlb(cllb);
		int clid=cllb.getId();
		
		for(int j=0;j<clmc.length;j++){
			
			MultipartFile czfile=cltp.get(j);
			String czfilename=System.currentTimeMillis()+czfile.getOriginalFilename();
			
			String czrealpath=realurl+"upload/"+czfilename;
			File newczfile=new File(czrealpath);
			czfile.transferTo(newczfile);
			String czurl=config.url+czfilename;
			czxq.setCzlbid(clid);
			czxq.setCztp(czurl);
			czxq.setCzmc(clmc[j]);
			czxq.setCzms(clms[j]);
			czxqbiz.addB_czxq(czxq);
		}
		
		
	}
	ccbiz.removeB_ccbycpid(Integer.parseInt(cpid));
	String[] ccmcs=request.getParameterValues("ccmc");
	for (int i = 0; i < ccmcs.length; i++) {
		B_cc cc=new B_cc();
		String ccmc=ccmcs[i];
		cc.setCcmc(ccmc);
		cc.setCpid(Integer.parseInt(cpid));
		ccbiz.addB_cc(cc);
	}

	
	
	
	return "selectcp";
}




}
