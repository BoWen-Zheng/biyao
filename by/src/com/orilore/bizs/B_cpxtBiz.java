package com.orilore.bizs;
import com.orilore.model.*;
import com.orilore.mappers.*;
import java.util.*;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
@Service
public class B_cpxtBiz implements IB_cpxtBiz{
	@Resource
	private B_cpxtMapper mapper;
	@Override
	public boolean addB_cpxt(B_cpxt bean) {
			mapper.insert(bean);
			return true;
		
	}
	@Override
	public boolean removeB_cpxt(int id) {
			mapper.delete(id);
			return true;
		
	}
	@Override
	public boolean modifyB_cpxt(B_cpxt bean) {
			mapper.update(bean);
			return true;
		
	}
	@Override
	public B_cpxt getB_cpxt(int id) {
		B_cpxt bean = null;
			bean = mapper.selectOne(id);
			return bean;
	}
	@Override
	public List<B_cpxt> findB_cpxt() {
		List<B_cpxt> beans = null;
			beans = mapper.select();
			return beans;
	}
	@Override
	public List<B_cpxt> getB_cpxtbycpid(int cpid) {
		List<B_cpxt> bean=null;
		bean = mapper.selectbycpid(cpid);
		return bean;
	}
	@Override
	public boolean removeB_cpxtbycpid(int cpid) {
		mapper.deletebycpid(cpid);
		return true;
	}
}
