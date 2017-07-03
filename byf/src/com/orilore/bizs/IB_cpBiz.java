package com.orilore.bizs;
import com.orilore.model.*;
import java.util.List;
public interface IB_cpBiz{
	public boolean addB_cp(B_cp b_cp);
	public boolean removeB_cp(int id);
	public boolean modifyB_cp(B_cp b_cp);
	public B_cp getB_cp(int id);
	public List<B_cp> findB_cp();
	public List<B_cp> findbyzt(int zt);
	public List<B_cp> findbysjid(int sjid);
}