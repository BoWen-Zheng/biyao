package com.orilore.bizs;
import com.orilore.model.*;
import com.orilore.mappers.*;
import java.util.*;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
@Service
public class B_yhBiz implements IB_yhBiz{
	@Resource
	private B_yhMapper mapper;
	@Override
	public boolean addB_yh(B_yh bean) {
		
			mapper.insert(bean);
		
			return true;
		
	}
	@Override
	public boolean removeB_yh(int id) {
		
			mapper.delete(id);
			
			return true;
		
	}
	@Override
	public boolean modifyB_yh(B_yh bean) {
		
			mapper.update(bean);
		
			return true;
		
	}
	@Override
	public B_yh getB_yh(int id) {
		B_yh bean = null;
		
			bean = mapper.selectOne(id);
		
		return bean;
	}
	@Override
	public List<B_yh> findB_yh() {
		List<B_yh> beans = null;
		
			beans = mapper.select();
		
		return beans;
	}
	@Override
	public B_yh getB_yh(Map map) {
		return mapper.selectforname(map);
		
	}
}
