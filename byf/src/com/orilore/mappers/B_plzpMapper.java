package com.orilore.mappers;
import java.util.List;
import com.orilore.model.*;
public interface B_plzpMapper{
	public void insert(B_plzp bean);
	public B_plzp selectOne(int id);
	public void delete(int id);
	public List<B_plzp> select();
	public void update(B_plzp bean);
}