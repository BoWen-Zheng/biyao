package com.orilore.mappers;
import java.util.List;
import com.orilore.model.*;
public interface CitiesMapper{
	public void insert(Cities bean);
	public Cities selectOne(int id);
	public void delete(int id);
	public List<Cities> select();
	public void update(Cities bean);
}