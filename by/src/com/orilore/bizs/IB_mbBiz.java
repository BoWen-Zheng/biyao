package com.orilore.bizs;
import com.orilore.model.*;
import java.util.List;
public interface IB_mbBiz{
	public boolean addB_mb(B_mb b_mb);
	public boolean removeB_mb(int id);
	public boolean modifyB_mb(B_mb b_mb);
	public B_mb getB_mb(int id);
	public List<B_mb> findB_mb();
}