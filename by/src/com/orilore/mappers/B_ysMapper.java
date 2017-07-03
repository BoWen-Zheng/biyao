package com.orilore.mappers;
import java.util.List;
import com.orilore.model.*;
public interface B_ysMapper{
	public void insert(B_ys bean);
	public B_ys selectOne(int id);
	public void delete(int id);
	public List<B_ys> select();
	public void update(B_ys bean);
	public List<B_ys> selectbycpid(int cpid);
	public void deletebycpid(int cpid);
}