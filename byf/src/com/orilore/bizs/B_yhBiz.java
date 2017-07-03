package com.orilore.bizs;
import com.orilore.model.*;
import com.orilore.mappers.*;
import java.util.*;
import org.apache.ibatis.session.SqlSession;
public class B_yhBiz implements IB_yhBiz{
	private SqlSession session = null;
	@Override
	public boolean addB_yh(B_yh bean) {
		try{
			B_yhMapper mapper = session.getMapper(B_yhMapper.class);
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
	public boolean removeB_yh(int id) {
		try{
			B_yhMapper mapper = session.getMapper(B_yhMapper.class);
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
	public boolean modifyB_yh(B_yh bean) {
		try{
			B_yhMapper mapper = session.getMapper(B_yhMapper.class);
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
	public B_yh getB_yh(int id) {
		B_yh bean = null;
		try{
			B_yhMapper mapper = session.getMapper(B_yhMapper.class);
			bean = mapper.selectOne(id);
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return bean;
	}
	@Override
	public List<B_yh> findB_yh() {
		List<B_yh> beans = null;
		try{
			B_yhMapper mapper = session.getMapper(B_yhMapper.class);
			beans = mapper.select();
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return beans;
	}
}
