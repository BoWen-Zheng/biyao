package com.orilore.mappers;
import java.util.List;
import com.orilore.model.*;
public interface B_sjMapper{
	public void insert(B_sj bean);
	public B_sj selectOne(int id);
	public void delete(int id);
	public List<B_sj> select();
	public void update(B_sj bean);
}