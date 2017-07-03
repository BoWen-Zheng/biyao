package com.orilore.bizs;
import com.orilore.model.*;
import com.orilore.mappers.*;
import java.util.*;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
@Service
public class B_lxBiz implements IB_lxBiz{
	@Resource
	private B_lxMapper mapper;
	@Override
	public boolean addB_lx(B_lx bean) {
		
			mapper.insert(bean);
			
			return true;
		
	}
	@Override
	public boolean removeB_lx(int id) {
		
			mapper.delete(id);
			
			return true;
		
	}
	@Override
	public boolean modifyB_lx(B_lx bean) {
		
			mapper.update(bean);
		
			return true;
		
	}
	@Override
	public B_lx getB_lx(int id) {
		B_lx bean = null;
		
			bean = mapper.selectOne(id);
		
		return bean;
	}
	@Override
	public List<B_lx> findB_lx() {
		List<B_lx> beans = null;
		
			beans = mapper.select();
		
		return beans;
	}
	@Override
	public List<B_lx> findbyxszt(int xszt) {
		List<B_lx> beans=null;
		beans=mapper.selectbyxszt(xszt);
		return beans;
	}
	@Override
	public List<B_lx> findbypid(int pid) {
		List<B_lx> beans=null;
		beans=mapper.selectbypid(pid);
		return beans;
	}
}
