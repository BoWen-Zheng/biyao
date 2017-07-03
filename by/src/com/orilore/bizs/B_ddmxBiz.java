package com.orilore.bizs;
import com.orilore.model.*;
import com.orilore.mappers.*;
import java.util.*;
import org.apache.ibatis.session.SqlSession;
public class B_ddmxBiz implements IB_ddmxBiz{
	private SqlSession session = null;
	@Override
	public boolean addB_ddmx(B_ddmx bean) {
		try{
			B_ddmxMapper mapper = session.getMapper(B_ddmxMapper.class);
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
	public boolean removeB_ddmx(int id) {
		try{
			B_ddmxMapper mapper = session.getMapper(B_ddmxMapper.class);
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
	public boolean modifyB_ddmx(B_ddmx bean) {
		try{
			B_ddmxMapper mapper = session.getMapper(B_ddmxMapper.class);
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
	public B_ddmx getB_ddmx(int id) {
		B_ddmx bean = null;
		try{
			B_ddmxMapper mapper = session.getMapper(B_ddmxMapper.class);
			bean = mapper.selectOne(id);
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return bean;
	}
	@Override
	public List<B_ddmx> findB_ddmx() {
		List<B_ddmx> beans = null;
		try{
			B_ddmxMapper mapper = session.getMapper(B_ddmxMapper.class);
			beans = mapper.select();
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return beans;
	}
}
