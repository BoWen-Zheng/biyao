package com.orilore.mappers;
import java.util.List;
import com.orilore.model.*;
public interface B_ddMapper{
	public void insert(B_dd bean);
	public B_dd selectOne(int id);
	public void delete(int id);
	public List<B_dd> select();
	public void update(B_dd bean);
}