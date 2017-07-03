package com.orilore.bizs;
import com.orilore.model.*;
import com.orilore.mappers.*;
import java.util.*;
import org.apache.ibatis.session.SqlSession;
public class B_plBiz implements IB_plBiz{
	private SqlSession session = null;
	@Override
	public boolean addB_pl(B_pl bean) {
		try{
			B_plMapper mapper = session.getMapper(B_plMapper.class);
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
	public boolean removeB_pl(int id) {
		try{
			B_plMapper mapper = session.getMapper(B_plMapper.class);
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
	public boolean modifyB_pl(B_pl bean) {
		try{
			B_plMapper mapper = session.getMapper(B_plMapper.class);
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
	public B_pl getB_pl(int id) {
		B_pl bean = null;
		try{
			B_plMapper mapper = session.getMapper(B_plMapper.class);
			bean = mapper.selectOne(id);
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return bean;
	}
	@Override
	public List<B_pl> findB_pl() {
		List<B_pl> beans = null;
		try{
			B_plMapper mapper = session.getMapper(B_plMapper.class);
			beans = mapper.select();
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return beans;
	}
}
