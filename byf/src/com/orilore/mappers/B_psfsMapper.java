package com.orilore.mappers;
import java.util.List;
import com.orilore.model.*;
public interface B_psfsMapper{
	public void insert(B_psfs bean);
	public B_psfs selectOne(int id);
	public void delete(int id);
	public List<B_psfs> select();
	public void update(B_psfs bean);
}