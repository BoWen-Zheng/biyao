package com.orilore.bizs;
import com.orilore.model.*;
import com.orilore.mappers.*;
import java.util.*;
import org.apache.ibatis.session.SqlSession;
public class B_sjzxBiz implements IB_sjzxBiz{
	private SqlSession session = null;
	@Override
	public boolean addB_sjzx(B_sjzx bean) {
		try{
			B_sjzxMapper mapper = session.getMapper(B_sjzxMapper.class);
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
	public boolean removeB_sjzx(int id) {
		try{
			B_sjzxMapper mapper = session.getMapper(B_sjzxMapper.class);
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
	public boolean modifyB_sjzx(B_sjzx bean) {
		try{
			B_sjzxMapper mapper = session.getMapper(B_sjzxMapper.class);
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
	public B_sjzx getB_sjzx(int id) {
		B_sjzx bean = null;
		try{
			B_sjzxMapper mapper = session.getMapper(B_sjzxMapper.class);
			bean = mapper.selectOne(id);
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return bean;
	}
	@Override
	public List<B_sjzx> findB_sjzx() {
		List<B_sjzx> beans = null;
		try{
			B_sjzxMapper mapper = session.getMapper(B_sjzxMapper.class);
			beans = mapper.select();
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return beans;
	}
}
