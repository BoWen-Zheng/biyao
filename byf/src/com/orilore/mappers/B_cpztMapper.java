package com.orilore.mappers;
import java.util.List;
import com.orilore.model.*;
public interface B_cpztMapper{
	public void insert(B_cpzt bean);
	public B_cpzt selectOne(int id);
	public void delete(int id);
	public List<B_cpzt> select();
	public void update(B_cpzt bean);
}