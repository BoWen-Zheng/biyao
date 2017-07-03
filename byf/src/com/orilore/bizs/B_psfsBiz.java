package com.orilore.bizs;
import com.orilore.model.*;
import com.orilore.mappers.*;
import java.util.*;
import org.apache.ibatis.session.SqlSession;
public class B_psfsBiz implements IB_psfsBiz{
	private SqlSession session = null;
	@Override
	public boolean addB_psfs(B_psfs bean) {
		try{
			B_psfsMapper mapper = session.getMapper(B_psfsMapper.class);
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
	public boolean removeB_psfs(int id) {
		try{
			B_psfsMapper mapper = session.getMapper(B_psfsMapper.class);
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
	public boolean modifyB_psfs(B_psfs bean) {
		try{
			B_psfsMapper mapper = session.getMapper(B_psfsMapper.class);
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
	public B_psfs getB_psfs(int id) {
		B_psfs bean = null;
		try{
			B_psfsMapper mapper = session.getMapper(B_psfsMapper.class);
			bean = mapper.selectOne(id);
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return bean;
	}
	@Override
	public List<B_psfs> findB_psfs() {
		List<B_psfs> beans = null;
		try{
			B_psfsMapper mapper = session.getMapper(B_psfsMapper.class);
			beans = mapper.select();
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return beans;
	}
}
