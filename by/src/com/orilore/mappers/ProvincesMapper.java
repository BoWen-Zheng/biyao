package com.orilore.mappers;
import java.util.List;
import com.orilore.model.*;
public interface ProvincesMapper{
	public void insert(Provinces bean);
	public Provinces selectOne(int id);
	public void delete(int id);
	public List<Provinces> select();
	public void update(Provinces bean);
}