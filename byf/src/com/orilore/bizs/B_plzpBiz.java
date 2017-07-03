package com.orilore.bizs;
import com.orilore.model.*;
import com.orilore.mappers.*;
import java.util.*;
import org.apache.ibatis.session.SqlSession;
public class B_plzpBiz implements IB_plzpBiz{
	private SqlSession session = null;
	@Override
	public boolean addB_plzp(B_plzp bean) {
		try{
			B_plzpMapper mapper = session.getMapper(B_plzpMapper.class);
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
	public boolean removeB_plzp(int id) {
		try{
			B_plzpMapper mapper = session.getMapper(B_plzpMapper.class);
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
	public boolean modifyB_plzp(B_plzp bean) {
		try{
			B_plzpMapper mapper = session.getMapper(B_plzpMapper.class);
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
	public B_plzp getB_plzp(int id) {
		B_plzp bean = null;
		try{
			B_plzpMapper mapper = session.getMapper(B_plzpMapper.class);
			bean = mapper.selectOne(id);
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return bean;
	}
	@Override
	public List<B_plzp> findB_plzp() {
		List<B_plzp> beans = null;
		try{
			B_plzpMapper mapper = session.getMapper(B_plzpMapper.class);
			beans = mapper.select();
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return beans;
	}
}
