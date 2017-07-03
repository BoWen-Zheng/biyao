package com.orilore.mappers;
import java.util.List;
import com.orilore.model.*;
public interface B_cpxtMapper{
	public void insert(B_cpxt bean);
	public B_cpxt selectOne(int id);
	public void delete(int id);
	public List<B_cpxt> select();
	public void update(B_cpxt bean);
	public List<B_cpxt> selectbycpid(int cpid);
}