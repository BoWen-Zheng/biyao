package com.orilore.bizs;
import com.orilore.model.*;
import com.orilore.mappers.*;
import java.util.*;
import org.apache.ibatis.session.SqlSession;
public class CitiesBiz implements ICitiesBiz{
	private SqlSession session = null;
	@Override
	public boolean addCities(Cities bean) {
		try{
			CitiesMapper mapper = session.getMapper(CitiesMapper.class);
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
	public boolean removeCities(int id) {
		try{
			CitiesMapper mapper = session.getMapper(CitiesMapper.class);
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
	public boolean modifyCities(Cities bean) {
		try{
			CitiesMapper mapper = session.getMapper(CitiesMapper.class);
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
	public Cities getCities(int id) {
		Cities bean = null;
		try{
			CitiesMapper mapper = session.getMapper(CitiesMapper.class);
			bean = mapper.selectOne(id);
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return bean;
	}
	@Override
	public List<Cities> findCities() {
		List<Cities> beans = null;
		try{
			CitiesMapper mapper = session.getMapper(CitiesMapper.class);
			beans = mapper.select();
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return beans;
	}
}
