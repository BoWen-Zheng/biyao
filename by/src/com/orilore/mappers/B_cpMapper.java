package com.orilore.mappers;
import java.util.List;
import java.util.Map;

import com.orilore.model.*;
public interface B_cpMapper{
	public void insert(B_cp bean);
	public B_cp selectOne(int id);
	public void delete(int id);
	public List<B_cp> select();
	public void update(B_cp bean);
	public List<B_cp> selectcpbyid(Map map);
	public int selectcount(Map map);
}