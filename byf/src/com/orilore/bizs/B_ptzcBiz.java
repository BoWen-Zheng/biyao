package com.orilore.bizs;
import com.orilore.model.*;
import com.orilore.mappers.*;
import java.util.*;
import org.apache.ibatis.session.SqlSession;
public class B_ptzcBiz implements IB_ptzcBiz{
	private SqlSession session = null;
	@Override
	public boolean addB_ptzc(B_ptzc bean) {
		try{
			B_ptzcMapper mapper = session.getMapper(B_ptzcMapper.class);
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
	public boolean removeB_ptzc(int id) {
		try{
			B_ptzcMapper mapper = session.getMapper(B_ptzcMapper.class);
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
	public boolean modifyB_ptzc(B_ptzc bean) {
		try{
			B_ptzcMapper mapper = session.getMapper(B_ptzcMapper.class);
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
	public B_ptzc getB_ptzc(int id) {
		B_ptzc bean = null;
		try{
			B_ptzcMapper mapper = session.getMapper(B_ptzcMapper.class);
			bean = mapper.selectOne(id);
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return bean;
	}
	@Override
	public List<B_ptzc> findB_ptzc() {
		List<B_ptzc> beans = null;
		try{
			B_ptzcMapper mapper = session.getMapper(B_ptzcMapper.class);
			beans = mapper.select();
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return beans;
	}
}
