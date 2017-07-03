package com.orilore.bizs;
import com.orilore.model.*;
import com.orilore.mappers.*;
import java.util.*;
import org.apache.ibatis.session.SqlSession;
public class B_wzBiz implements IB_wzBiz{
	private SqlSession session = null;
	@Override
	public boolean addB_wz(B_wz bean) {
		try{
			B_wzMapper mapper = session.getMapper(B_wzMapper.class);
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
	public boolean removeB_wz(int id) {
		try{
			B_wzMapper mapper = session.getMapper(B_wzMapper.class);
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
	public boolean modifyB_wz(B_wz bean) {
		try{
			B_wzMapper mapper = session.getMapper(B_wzMapper.class);
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
	public B_wz getB_wz(int id) {
		B_wz bean = null;
		try{
			B_wzMapper mapper = session.getMapper(B_wzMapper.class);
			bean = mapper.selectOne(id);
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return bean;
	}
	@Override
	public List<B_wz> findB_wz() {
		List<B_wz> beans = null;
		try{
			B_wzMapper mapper = session.getMapper(B_wzMapper.class);
			beans = mapper.select();
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return beans;
	}
}
