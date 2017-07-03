package com.orilore.mappers;
import java.util.List;
import com.orilore.model.*;
public interface B_wzMapper{
	public void insert(B_wz bean);
	public B_wz selectOne(int id);
	public void delete(int id);
	public List<B_wz> select();
	public void update(B_wz bean);
}