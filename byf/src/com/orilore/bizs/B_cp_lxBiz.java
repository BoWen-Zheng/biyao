package com.orilore.bizs;
import com.orilore.model.*;
import com.orilore.mappers.*;
import java.util.*;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
@Service
public class B_cp_lxBiz implements IB_cp_lxBiz{
	@Resource
	private B_cp_lxMapper mapper;
	@Override
	public boolean addB_cp_lx(B_cp_lx bean) {
		
			mapper.insert(bean);
			
			return true;
		
	}
	@Override
	public boolean removeB_cp_lx(int id) {
		
			mapper.delete(id);
			
			return true;
		
	}
	@Override
	public boolean modifyB_cp_lx(B_cp_lx bean) {
		
			mapper.update(bean);
			
			return true;
		
	}
	@Override
	public B_cp_lx getB_cp_lx(int id) {
		B_cp_lx bean = null;
		
			bean = mapper.selectOne(id);
		
		return bean;
	}
	@Override
	public List<B_cp_lx> findB_cp_lx() {
		List<B_cp_lx> beans = null;
		
			beans = mapper.select();
		
		return beans;
	}
	@Override
	public List<B_cp_lx> findbylxid(int lxid) {
		List<B_cp_lx> beans=null;
		beans=mapper.selectbylxid(lxid);
		return beans;
	}
	@Override
	public B_cp_lx findbycpid(int cpid) {
		// TODO Auto-generated method stub
		return mapper.selectbycpid(cpid);
	}
}
