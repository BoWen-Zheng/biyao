package com.orilore.bizs;
import com.orilore.model.*;
import com.orilore.mappers.*;
import java.util.*;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
@Service
public class B_cpqmBiz implements IB_cpqmBiz{
	@Resource
	private B_cpqmMapper mapper;
	@Override
	public boolean addB_cpqm(B_cpqm bean) {
			mapper.insert(bean);
			return true;
		
	}
	@Override
	public boolean removeB_cpqm(int id) {
			mapper.delete(id);
			return true;
		
	}
	@Override
	public boolean modifyB_cpqm(B_cpqm bean) {
			mapper.update(bean);
			return true;
		
	}
	@Override
	public B_cpqm getB_cpqm(int id) {
		B_cpqm bean = null;
			bean = mapper.selectOne(id);
		return bean;
	}
	@Override
	public List<B_cpqm> findB_cpqm() {
		List<B_cpqm> beans = null;
			beans = mapper.select();
		return beans;
	}
	@Override
	public List<B_cpqm> getB_cpqmbycpid(int cpid) {
		List<B_cpqm> beans = null;
		beans = mapper.selectbycpid(cpid);
		return beans;
	}
	@Override
	public boolean removeB_cpqmbycpid(int cpid) {
		mapper.deletebycpid(cpid);
		return true;
	}
}
