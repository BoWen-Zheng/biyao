package com.orilore.bizs;
import com.orilore.model.*;
import com.orilore.mappers.*;
import java.util.*;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
@Service
public class B_ccBiz implements IB_ccBiz{
	@Resource
	private B_ccMapper mapper;
	@Override
	public boolean addB_cc(B_cc bean) {
			mapper.insert(bean);
			return true;
		
	}
	@Override
	public boolean removeB_cc(int id) {
			mapper.delete(id);
			return true;
		
	}
	@Override
	public boolean modifyB_cc(B_cc bean) {
			mapper.update(bean);
			return true;
		
	}
	@Override
	public B_cc getB_cc(int id) {
		B_cc bean = null;
			bean = mapper.selectOne(id);
		return bean;
	}
	@Override
	public List<B_cc> findB_cc() {
		List<B_cc> beans = null;
			beans = mapper.select();
		return beans;
	}
	@Override
	public List<B_cc> findbycpid(int cpid) {
		List<B_cc> beans=null;
		beans=mapper.selectbycpid(cpid);
		return beans;
	}
}
