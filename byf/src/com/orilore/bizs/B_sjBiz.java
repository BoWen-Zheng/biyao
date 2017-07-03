package com.orilore.bizs;
import com.orilore.model.*;
import com.orilore.mappers.*;
import java.util.*;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
@Service
public class B_sjBiz implements IB_sjBiz{
	@Resource
	private B_sjMapper mapper;
	@Override
	public boolean addB_sj(B_sj bean) {
		
			mapper.insert(bean);
			
			return true;
		
	}
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
}
