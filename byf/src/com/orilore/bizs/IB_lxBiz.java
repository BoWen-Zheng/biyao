package com.orilore.bizs;
import com.orilore.model.*;
import java.util.List;
public interface IB_lxBiz{
	public boolean addB_lx(B_lx b_lx);
	public boolean removeB_lx(int id);
	public boolean modifyB_lx(B_lx b_lx);
	public B_lx getB_lx(int id);
	public List<B_lx> findB_lx();
	public List<B_lx> findbyxszt(int xszt);
	public List<B_lx> findbypid(int pid);
}