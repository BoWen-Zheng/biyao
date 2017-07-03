package com.orilore.bizs;
import com.orilore.model.*;
import com.orilore.mappers.*;
import java.util.*;
import org.apache.ibatis.session.SqlSession;
public class ProvincesBiz implements IProvincesBiz{
	private SqlSession session = null;
	@Override
	public boolean addProvinces(Provinces bean) {
		try{
			ProvincesMapper mapper = session.getMapper(ProvincesMapper.class);
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
	public boolean removeProvinces(int id) {
		try{
			ProvincesMapper mapper = session.getMapper(ProvincesMapper.class);
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
	public boolean modifyProvinces(Provinces bean) {
		try{
			ProvincesMapper mapper = session.getMapper(ProvincesMapper.class);
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
	public Provinces getProvinces(int id) {
		Provinces bean = null;
		try{
			ProvincesMapper mapper = session.getMapper(ProvincesMapper.class);
			bean = mapper.selectOne(id);
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return bean;
	}
	@Override
	public List<Provinces> findProvinces() {
		List<Provinces> beans = null;
		try{
			ProvincesMapper mapper = session.getMapper(ProvincesMapper.class);
			beans = mapper.select();
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return beans;
	}
}
