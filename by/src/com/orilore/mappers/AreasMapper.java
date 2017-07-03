package com.orilore.mappers;
import java.util.List;
import com.orilore.model.*;
public interface AreasMapper{
	public void insert(Areas bean);
	public Areas selectOne(int id);
	public void delete(int id);
	public List<Areas> select();
	public void update(Areas bean);
}