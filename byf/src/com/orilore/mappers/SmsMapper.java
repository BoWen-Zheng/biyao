package com.orilore.mappers;
import java.util.List;
import com.orilore.model.*;
public interface SmsMapper{
	public void insert(Sms bean);
	public Sms selectOne(int id);
	public void delete(int id);
	public List<Sms> select();
	public void update(Sms bean);
}