package com.orilore.bizs;
import com.orilore.model.*;
import com.orilore.mappers.*;
import java.util.*;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
@Service
public class SmsBiz implements ISmsBiz{
	@Resource
	private SmsMapper mapper;
	@Override
	public boolean addSms(Sms bean) {
			mapper.insert(bean);
			return true;
		
	}
	@Override
	public boolean removeSms(int id) {
			mapper.delete(id);
			return true;
			}
	@Override
	public boolean modifySms(Sms bean) {
			mapper.update(bean);
			return true;
		
	}
	@Override
	public Sms getSms(int id) {
		Sms bean = null;
			bean = mapper.selectOne(id);
		
		return bean;
	}
	@Override
	public List<Sms> findSms() {
		List<Sms> beans = null;
			beans = mapper.select();
		return beans;
	}
}
