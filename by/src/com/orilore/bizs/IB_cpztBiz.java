package com.orilore.bizs;
import com.orilore.model.*;
import java.util.List;
public interface IB_cpztBiz{
	public boolean addB_cpzt(B_cpzt b_cpzt);
	public boolean removeB_cpzt(int id);
	public boolean modifyB_cpzt(B_cpzt b_cpzt);
	public B_cpzt getB_cpzt(int id);
	public List<B_cpzt> findB_cpzt();
}