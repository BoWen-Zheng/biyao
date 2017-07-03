package com.orilore.mappers;
import java.util.List;
import com.orilore.model.*;
public interface B_mbMapper{
	public void insert(B_mb bean);
	public B_mb selectOne(int id);
	public void delete(int id);
	public List<B_mb> select();
	public void update(B_mb bean);
}