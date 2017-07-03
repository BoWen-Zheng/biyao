package com.orilore.bizs;
import com.orilore.model.*;
import com.orilore.mappers.*;
import java.util.*;
import org.apache.ibatis.session.SqlSession;
public class B_shdzBiz implements IB_shdzBiz{
	private SqlSession session = null;
	@Override
	public boolean addB_shdz(B_shdz bean) {
		try{
			B_shdzMapper mapper = session.getMapper(B_shdzMapper.class);
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
	public boolean removeB_shdz(int id) {
		try{
			B_shdzMapper mapper = session.getMapper(B_shdzMapper.class);
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
	public boolean modifyB_shdz(B_shdz bean) {
		try{
			B_shdzMapper mapper = session.getMapper(B_shdzMapper.class);
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
	public B_shdz getB_shdz(int id) {
		B_shdz bean = null;
		try{
			B_shdzMapper mapper = session.getMapper(B_shdzMapper.class);
			bean = mapper.selectOne(id);
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return bean;
	}
	@Override
	public List<B_shdz> findB_shdz() {
		List<B_shdz> beans = null;
		try{
			B_shdzMapper mapper = session.getMapper(B_shdzMapper.class);
			beans = mapper.select();
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return beans;
	}
}
