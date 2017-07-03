package com.orilore.bizs;
import com.orilore.model.*;
import com.orilore.mappers.*;
import java.util.*;
import org.apache.ibatis.session.SqlSession;
public class B_ddBiz implements IB_ddBiz{
	private SqlSession session = null;
	@Override
	public boolean addB_dd(B_dd bean) {
		try{
			B_ddMapper mapper = session.getMapper(B_ddMapper.class);
			mapper.insert(bean);
			session.commit();
			return true;
		}catch(Exception ex){
			ex.printStackTrace();
			return false;
		}finally{
			session.close();
		}
	}
	@Override
	public boolean removeB_dd(int id) {
		try{
			B_ddMapper mapper = session.getMapper(B_ddMapper.class);
			mapper.delete(id);
			session.commit();
			return true;
		}catch(Exception ex){
			ex.printStackTrace();
			return false;
		}finally{
			session.close();
		}
	}
	@Override
	public boolean modifyB_dd(B_dd bean) {
		try{
			B_ddMapper mapper = session.getMapper(B_ddMapper.class);
			mapper.update(bean);
			session.commit();
			return true;
		}catch(Exception ex){
			ex.printStackTrace();
			return false;
		}finally{
			session.close();
		}
	}
	@Override
	public B_dd getB_dd(int id) {
		B_dd bean = null;
		try{
			B_ddMapper mapper = session.getMapper(B_ddMapper.class);
			bean = mapper.selectOne(id);
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return bean;
	}
	@Override
	public List<B_dd> findB_dd() {
		List<B_dd> beans = null;
		try{
			B_ddMapper mapper = session.getMapper(B_ddMapper.class);
			beans = mapper.select();
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return beans;
	}
}
