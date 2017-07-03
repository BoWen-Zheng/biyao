package com.orilore.mappers;
import java.util.List;
import com.orilore.model.*;
public interface B_plMapper{
	public void insert(B_pl bean);
	public B_pl selectOne(int id);
	public void delete(int id);
	public List<B_pl> select();
	public void update(B_pl bean);
}