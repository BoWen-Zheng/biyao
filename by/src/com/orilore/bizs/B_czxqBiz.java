package com.orilore.bizs;
import com.orilore.model.*;
import com.orilore.mappers.*;
import java.util.*;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
@Service
public class B_czxqBiz implements IB_czxqBiz{
	@Resource
	private B_czxqMapper mapper;
	@Override
	public boolean addB_czxq(B_czxq bean) {
			mapper.insert(bean);
			return true;
		
	}
	@Override
	public boolean removeB_czxq(int id) {
			mapper.delete(id);
			return true;
		
	}
	@Override
	public boolean modifyB_czxq(B_czxq bean) {
			mapper.update(bean);
			return true;
		
	}
	@Override
	public B_czxq getB_czxq(int id) {
		B_czxq bean = null;
			bean = mapper.selectOne(id);
		return bean;
	}
	@Override
	public List<B_czxq> findB_czxq() {
		List<B_czxq> beans = null;
			beans = mapper.select();
		return beans;
	}
	@Override
	public B_czxq getB_czxqbyczlbid(int czlbid) {
		B_czxq bean=null;
		bean=mapper.selectbyczlbid(czlbid);
		return bean;
	}
	@Override
	public boolean removeB_czxqbyczlbid(int czlbid) {
		mapper.deletebyczlbid(czlbid);
		return true;
	}
}
