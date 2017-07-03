package com.orilore.mappers;
import java.util.List;
import com.orilore.model.*;
public interface B_wzplMapper{
	public void insert(B_wzpl bean);
	public B_wzpl selectOne(int id);
	public void delete(int id);
	public List<B_wzpl> select();
	public void update(B_wzpl bean);
}