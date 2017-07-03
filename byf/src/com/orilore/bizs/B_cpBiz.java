package com.orilore.bizs;
import com.orilore.model.*;
import com.orilore.mappers.*;
import java.util.*;

import javax.annotation.Resource;

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
	public List<B_cp> findbyzt(int zt) {
		List<B_cp> beans=null;
		beans=mapper.selectbyzt(zt);
		return beans;
	}
	@Override
	public List<B_cp> findbysjid(int sjid) {
		// TODO Auto-generated method stub
		return mapper.selectbysjid(sjid);
	}
}
