package com.orilore.mappers;
import java.util.List;
import com.orilore.model.*;
public interface B_cp_lxMapper{
	public void insert(B_cp_lx bean);
	public B_cp_lx selectOne(int id);
	public void delete(int id);
	public List<B_cp_lx> select();
	public void update(B_cp_lx bean);
	public void deletebycpid(int cpid);
}