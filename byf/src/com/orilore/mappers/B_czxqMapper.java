package com.orilore.mappers;
import java.util.List;
import com.orilore.model.*;
public interface B_czxqMapper{
	public void insert(B_czxq bean);
	public B_czxq selectOne(int id);
	public void delete(int id);
	public List<B_czxq> select();
	public void update(B_czxq bean);
	public List<B_czxq> selectbyczlbid(int czlbid);
}