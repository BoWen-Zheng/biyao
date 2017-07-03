package com.orilore.bizs;
import com.orilore.model.*;
import com.orilore.mappers.*;
import java.util.*;
import org.apache.ibatis.session.SqlSession;
public class AreasBiz implements IAreasBiz{
	private SqlSession session = null;
	@Override
	public boolean addAreas(Areas bean) {
		try{
			AreasMapper mapper = session.getMapper(AreasMapper.class);
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
	public boolean removeAreas(int id) {
		try{
			AreasMapper mapper = session.getMapper(AreasMapper.class);
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
	public boolean modifyAreas(Areas bean) {
		try{
			AreasMapper mapper = session.getMapper(AreasMapper.class);
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
	public Areas getAreas(int id) {
		Areas bean = null;
		try{
			AreasMapper mapper = session.getMapper(AreasMapper.class);
			bean = mapper.selectOne(id);
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return bean;
	}
	@Override
	public List<Areas> findAreas() {
		List<Areas> beans = null;
		try{
			AreasMapper mapper = session.getMapper(AreasMapper.class);
			beans = mapper.select();
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return beans;
	}
}
