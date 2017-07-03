package com.orilore.mappers;
import java.util.List;
import com.orilore.model.*;
public interface B_ccMapper{
	public void insert(B_cc bean);
	public B_cc selectOne(int id);
	public void delete(int id);
	public List<B_cc> select();
	public void update(B_cc bean);
	public List<B_cc> selectbycpid(int cpid);
}