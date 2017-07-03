package com.orilore.bizs;
import com.orilore.model.*;
import java.util.List;
public interface IB_czlbBiz{
	public boolean addB_czlb(B_czlb b_czlb);
	public boolean removeB_czlb(int id);
	public boolean modifyB_czlb(B_czlb b_czlb);
	public B_czlb getB_czlb(int id);
	public List<B_czlb> findB_czlb();
	public List<B_czlb> findbycpid(int cpid);
}