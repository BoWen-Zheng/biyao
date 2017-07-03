package com.orilore.bizs;
import com.orilore.model.*;
import java.util.List;
public interface IB_ddBiz{
	public boolean addB_dd(B_dd b_dd);
	public boolean removeB_dd(int id);
	public boolean modifyB_dd(B_dd b_dd);
	public B_dd getB_dd(int id);
	public List<B_dd> findB_dd();
}