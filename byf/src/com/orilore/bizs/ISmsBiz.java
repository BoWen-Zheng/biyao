package com.orilore.bizs;
import com.orilore.model.*;
import java.util.List;
public interface ISmsBiz{
	public boolean addSms(Sms sms);
	public boolean removeSms(int id);
	public boolean modifySms(Sms sms);
	public Sms getSms(int id);
	public List<Sms> findSms();
}