package com.orilore.bizs;
import com.orilore.model.*;
import java.util.List;
public interface IB_wzBiz{
	public boolean addB_wz(B_wz b_wz);
	public boolean removeB_wz(int id);
	public boolean modifyB_wz(B_wz b_wz);
	public B_wz getB_wz(int id);
	public List<B_wz> findB_wz();
}