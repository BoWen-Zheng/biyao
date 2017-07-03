package com.orilore.mappers;
import java.util.List;
import com.orilore.model.*;
public interface B_lxMapper{
	public void insert(B_lx bean);
	public B_lx selectOne(int id);
	public void delete(int id);
	public List<B_lx> select();
	public void update(B_lx bean);
	public List<B_lx> selectbyxszt(int xszt);
	public List<B_lx> selectbypid(int pid);
}