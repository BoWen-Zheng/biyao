package com.orilore.bizs;
import com.orilore.model.*;
import com.orilore.mappers.*;
import java.util.*;
import org.apache.ibatis.session.SqlSession;
public class B_cpztBiz implements IB_cpztBiz{
	private SqlSession session = null;
	@Override
	public boolean addB_cpzt(B_cpzt bean) {
		try{
			B_cpztMapper mapper = session.getMapper(B_cpztMapper.class);
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
	public boolean removeB_cpzt(int id) {
		try{
			B_cpztMapper mapper = session.getMapper(B_cpztMapper.class);
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
	public boolean modifyB_cpzt(B_cpzt bean) {
		try{
			B_cpztMapper mapper = session.getMapper(B_cpztMapper.class);
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
	public B_cpzt getB_cpzt(int id) {
		B_cpzt bean = null;
		try{
			B_cpztMapper mapper = session.getMapper(B_cpztMapper.class);
			bean = mapper.selectOne(id);
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return bean;
	}
	@Override
	public List<B_cpzt> findB_cpzt() {
		List<B_cpzt> beans = null;
		try{
			B_cpztMapper mapper = session.getMapper(B_cpztMapper.class);
			beans = mapper.select();
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return beans;
	}
}
