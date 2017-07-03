package com.orilore.mappers;
import java.util.List;
import com.orilore.model.*;
public interface B_sjzxMapper{
	public void insert(B_sjzx bean);
	public B_sjzx selectOne(int id);
	public void delete(int id);
	public List<B_sjzx> select();
	public void update(B_sjzx bean);
}