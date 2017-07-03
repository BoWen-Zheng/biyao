package com.orilore.bizs;
import com.orilore.model.*;
import com.orilore.util.config;
import com.orilore.dto.sjdto;
import com.orilore.mappers.*;

import java.io.File;
import java.io.IOException;
import java.util.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;
@Service
public class B_sjBiz implements IB_sjBiz{
	@Resource
	private B_sjMapper mapper;
	@Override
	public boolean removeB_sj(int id) {
		
			mapper.delete(id);
		
			return true;
		
	}
	@Override
	public boolean modifyB_sj(B_sj bean) {
		
			mapper.update(bean);
			
			return true;
		
	}
	@Override
	public B_sj getB_sj(int id) {
		B_sj bean = null;
		
			bean = mapper.selectOne(id);
		
		return bean;
	}
	@Override
	public List<B_sj> findB_sj() {
		List<B_sj> beans = null;
		
			beans = mapper.select();
		
		return beans;
	}
	@Override
	public boolean addB_sj(HttpServletRequest request, String sjmc) {
		boolean flag=false;
		MultipartRequest mrequest=(MultipartRequest)request;
		MultipartFile file=mrequest.getFile("sjtp");
		String path=request.getSession().getServletContext().getRealPath("/");
		String filename=System.currentTimeMillis()+file.getOriginalFilename();
		String pathfilename=path+"upload/"+filename;
		File newfile=new File(pathfilename);
		String httpname=config.url+filename;
		try {
			file.transferTo(newfile);
			flag=true;
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		B_sj bean=new B_sj();
		bean.setSjmc(sjmc);
		bean.setSjtp(httpname);
		bean.setFwtd(5.0);
		bean.setSpzl(5.0);
		mapper.insert(bean);
		
		return flag;
	}
	@Override
	public List<B_sj> findB_sj(int page) {
		int begin=config.pagesize*(page-1);
		Map map=new HashMap();
		map.put("page", config.pagesize);
		map.put("begin", begin);
		return mapper.selectfy(map);
	}
	@Override
	public int findcount() {
		int pagecount=0;
	    int count= mapper.selectcount();
	    if(count%config.pagesize==0){
	    pagecount=count/config.pagesize;
	    }else{
	    	pagecount=count/config.pagesize+1;
	    }
	    	
		return pagecount;
	}
	@Override
	public sjdto showview(int page) {
		int pagecount=this.findcount();
		List<B_sj> sjs=this.findB_sj(page);
		sjdto dto=new sjdto();
		dto.setSjs(sjs);
		dto.setPagecounts(pagecount);
		dto.setNowpage(page);
		return dto;
	}
}
