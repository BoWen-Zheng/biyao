package com.orilore.bizs;
import com.orilore.model.*;
import com.orilore.mappers.*;
import java.util.*;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
@Service
public class B_ysBiz implements IB_ysBiz{
	@Resource
	private B_ysMapper mapper;
	@Override
	public boolean addB_ys(B_ys bean) {
		
			mapper.insert(bean);
			return true;
		
	}
	@Override
	public boolean removeB_ys(int id) {
			mapper.delete(id);
			return true;
		
	}
	@Override
	public boolean modifyB_ys(B_ys bean) {
			mapper.update(bean);
			return true;
		
	}
	@Override
	public B_ys getB_ys(int id) {
		B_ys bean = null;
			bean = mapper.selectOne(id);
		
		return bean;
	}
	@Override
	public List<B_ys> findB_ys() {
		List<B_ys> beans = null;
			beans = mapper.select();
		return beans;
	}
	@Override
	public List<B_ys> findbycpid(int cpid) {
		List<B_ys> beans = null;
		beans=mapper.selectbycpid(cpid);
		return beans;
	}
}
