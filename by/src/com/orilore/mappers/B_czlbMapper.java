package com.orilore.mappers;
import java.util.List;
import com.orilore.model.*;
public interface B_czlbMapper{
	public void insert(B_czlb bean);
	public B_czlb selectOne(int id);
	public void delete(int id);
	public List<B_czlb> select();
	public void update(B_czlb bean);
	public List<B_czlb> selectbycpid(int cpid);
	public void deletebycpid(int cpid);
}