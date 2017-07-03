package com.orilore.bizs;
import com.orilore.model.*;
import java.util.List;
public interface IB_ysBiz{
	public boolean addB_ys(B_ys b_ys);
	public boolean removeB_ys(int id);
	public boolean modifyB_ys(B_ys b_ys);
	public B_ys getB_ys(int id);
	public List<B_ys> findB_ys();
	public List<B_ys> getB_ysbycpid(int cpid);
	public boolean removeB_ysbycpid(int cpid);
}