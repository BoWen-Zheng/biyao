package com.orilore.mappers;
import java.util.List;
import com.orilore.model.*;
public interface B_cpqmMapper{
	public void insert(B_cpqm bean);
	public B_cpqm selectOne(int id);
	public void delete(int id);
	public List<B_cpqm> select();
	public void update(B_cpqm bean);
	public List<B_cpqm> selectbycpid(int cpid);
}