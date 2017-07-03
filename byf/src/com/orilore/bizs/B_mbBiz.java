package com.orilore.bizs;
import com.orilore.model.*;
import com.orilore.mappers.*;
import java.util.*;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
@Service
public class B_mbBiz implements IB_mbBiz{
	@Resource
	private B_mbMapper mapper;
	@Override
	public boolean addB_mb(B_mb bean) {
			mapper.insert(bean);
			return true;
		
	}
	@Override
	public boolean removeB_mb(int id) {
			mapper.delete(id);
			return true;
		
	}
	@Override
	public boolean modifyB_mb(B_mb bean) {
			mapper.update(bean);
			return true;
			}
	@Override
	public B_mb getB_mb(int id) {
		B_mb bean = null;
			bean = mapper.selectOne(id);
		return bean;
	}
	@Override
	public List<B_mb> findB_mb() {
		List<B_mb> beans = null;
			beans = mapper.select();
		return beans;
	}
}
