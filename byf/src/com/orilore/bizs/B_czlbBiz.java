package com.orilore.bizs;
import com.orilore.model.*;
import com.orilore.mappers.*;
import java.util.*;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
@Service
public class B_czlbBiz implements IB_czlbBiz{
	@Resource
	private B_czlbMapper mapper;
	@Override
	public boolean addB_czlb(B_czlb bean) {
			mapper.insert(bean);
			return true;
		
	}
	@Override
	public boolean removeB_czlb(int id) {
			mapper.delete(id);
			return true;
		
	}
	@Override
	public boolean modifyB_czlb(B_czlb bean) {
			mapper.update(bean);
			return true;
		
	}
	@Override
	public B_czlb getB_czlb(int id) {
		B_czlb bean = null;
			bean = mapper.selectOne(id);
		return bean;
	}
	@Override
	public List<B_czlb> findB_czlb() {
		List<B_czlb> beans = null;
			beans = mapper.select();
		return beans;
	}
	@Override
	public List<B_czlb> findbycpid(int cpid) {
		List<B_czlb> beans = null;
		beans=mapper.selectbycpid(cpid);
		return beans;
	}
}
