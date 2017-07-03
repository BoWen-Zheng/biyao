package com.orilore.mappers;
import java.util.List;
import com.orilore.model.*;
public interface B_ddsjMapper{
	public void insert(B_ddsj bean);
	public B_ddsj selectOne(int id);
	public void delete(int id);
	public List<B_ddsj> select();
	public void update(B_ddsj bean);
}