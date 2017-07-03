package com.orilore.bizs;
import com.orilore.model.*;
import com.orilore.mappers.*;
import java.util.*;
import org.apache.ibatis.session.SqlSession;
public class B_wzplBiz implements IB_wzplBiz{
	private SqlSession session = null;
	@Override
	public boolean addB_wzpl(B_wzpl bean) {
		try{
			B_wzplMapper mapper = session.getMapper(B_wzplMapper.class);
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
	public boolean removeB_wzpl(int id) {
		try{
			B_wzplMapper mapper = session.getMapper(B_wzplMapper.class);
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
	public boolean modifyB_wzpl(B_wzpl bean) {
		try{
			B_wzplMapper mapper = session.getMapper(B_wzplMapper.class);
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
	public B_wzpl getB_wzpl(int id) {
		B_wzpl bean = null;
		try{
			B_wzplMapper mapper = session.getMapper(B_wzplMapper.class);
			bean = mapper.selectOne(id);
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return bean;
	}
	@Override
	public List<B_wzpl> findB_wzpl() {
		List<B_wzpl> beans = null;
		try{
			B_wzplMapper mapper = session.getMapper(B_wzplMapper.class);
			beans = mapper.select();
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return beans;
	}
}
