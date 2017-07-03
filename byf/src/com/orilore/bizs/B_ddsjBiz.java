package com.orilore.bizs;
import com.orilore.model.*;
import com.orilore.mappers.*;
import java.util.*;
import org.apache.ibatis.session.SqlSession;
public class B_ddsjBiz implements IB_ddsjBiz{
	private SqlSession session = null;
	@Override
	public boolean addB_ddsj(B_ddsj bean) {
		try{
			B_ddsjMapper mapper = session.getMapper(B_ddsjMapper.class);
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
	public boolean removeB_ddsj(int id) {
		try{
			B_ddsjMapper mapper = session.getMapper(B_ddsjMapper.class);
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
	public boolean modifyB_ddsj(B_ddsj bean) {
		try{
			B_ddsjMapper mapper = session.getMapper(B_ddsjMapper.class);
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
	public B_ddsj getB_ddsj(int id) {
		B_ddsj bean = null;
		try{
			B_ddsjMapper mapper = session.getMapper(B_ddsjMapper.class);
			bean = mapper.selectOne(id);
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return bean;
	}
	@Override
	public List<B_ddsj> findB_ddsj() {
		List<B_ddsj> beans = null;
		try{
			B_ddsjMapper mapper = session.getMapper(B_ddsjMapper.class);
			beans = mapper.select();
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return beans;
	}
}
