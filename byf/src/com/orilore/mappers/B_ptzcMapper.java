package com.orilore.mappers;
import java.util.List;
import com.orilore.model.*;
public interface B_ptzcMapper{
	public void insert(B_ptzc bean);
	public B_ptzc selectOne(int id);
	public void delete(int id);
	public List<B_ptzc> select();
	public void update(B_ptzc bean);
}