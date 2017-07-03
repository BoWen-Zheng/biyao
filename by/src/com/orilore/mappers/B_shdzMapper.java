package com.orilore.mappers;
import java.util.List;
import com.orilore.model.*;
public interface B_shdzMapper{
	public void insert(B_shdz bean);
	public B_shdz selectOne(int id);
	public void delete(int id);
	public List<B_shdz> select();
	public void update(B_shdz bean);
}