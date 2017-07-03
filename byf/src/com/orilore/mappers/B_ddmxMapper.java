package com.orilore.mappers;
import java.util.List;
import com.orilore.model.*;
public interface B_ddmxMapper{
	public void insert(B_ddmx bean);
	public B_ddmx selectOne(int id);
	public void delete(int id);
	public List<B_ddmx> select();
	public void update(B_ddmx bean);
}