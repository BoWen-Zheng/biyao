package com.orilore.bizs;
import com.orilore.model.*;
import com.orilore.util.config;
import com.orilore.mappers.*;
import java.util.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
@Service
public class B_cpBiz implements IB_cpBiz{
	@Resource
	private B_cpMapper mapper;
	@Override
	public boolean addB_cp(B_cp bean) {
			mapper.insert(bean);
			return true;
		
	}
	@Override
	public boolean removeB_cp(int id) {
			mapper.delete(id);
			return true;
			}
	@Override
	public boolean modifyB_cp(B_cp bean) {
			mapper.update(bean);
			return true;
		
	}
	@Override
	public B_cp getB_cp(int id) {
		B_cp bean = null;
			bean = mapper.selectOne(id);
			return bean;
	}
	@Override
	public List<B_cp> findB_cp() {
		List<B_cp> beans = null;
			beans = mapper.select();
			return beans;
	}
	@Override
	public List<B_cp> selectcpbyid(HttpServletRequest request,int nowpage) {
		Map map=new HashMap();
		String cpmc=request.getParameter("cpmc");
		String lxid=request.getParameter("lxid");
		String mbid=request.getParameter("mbid");
		String sjid=request.getParameter("sjid");
		String zt=request.getParameter("zt");
		String beginfbsj=request.getParameter("beginfbsj");
		String endfbsj=request.getParameter("endfbsj");
		String beginjg=request.getParameter("beginjg");
		String endjg=request.getParameter("endjg");
		
		int beginpage=(nowpage-1)*config.pagesize;
		int page=config.pagesize;
		map.put("cpmc", cpmc);
		map.put("lxid", lxid);
		map.put("mbid", mbid);
		map.put("sjid", sjid);
		map.put("zt", zt);
		map.put("beginfbsj", beginfbsj);
		map.put("endfbsj", endfbsj);
		map.put("beginjg", beginjg);
		map.put("endjg", endjg);
		List<B_cp> cps=mapper.selectcpbyid(map);
		List<B_cp> newlist=new ArrayList<>();
		int index=0;
		for(int i=beginpage;i<cps.size();i++){
			index++;
			newlist.add(cps.get(i));
			if(index==config.pagesize){
				break;
			}
			
		}
		return newlist;
		
	}
	@Override
	public int selectcount(HttpServletRequest request) {
		Map map=new HashMap();
		String cpmc=request.getParameter("cpmc");
		String lxid=request.getParameter("lxid");
		String mbid=request.getParameter("mbid");
		String sjid=request.getParameter("sjid");
		String zt=request.getParameter("zt");
		String beginfbsj=request.getParameter("beginfbsj");
		String endfbsj=request.getParameter("endfbsj");
		String beginjg=request.getParameter("beginjg");
		String endjg=request.getParameter("endjg");
		map.put("cpmc", cpmc);
		map.put("lxid", lxid);
		map.put("mbid", mbid);
		map.put("sjid", sjid);
		map.put("zt", zt);
		map.put("beginfbsj", beginfbsj);
		map.put("endfbsj", endfbsj);
		map.put("beginjg", beginjg);
		map.put("endjg", endjg);
		int pagecount=0;
		int page=mapper.selectcount(map);
		 
		if(page%config.pagesize==0){
			
			pagecount=page/config.pagesize;
			
		}
		else{
			pagecount=page/config.pagesize+1;
		}
		return pagecount;
	}
}
