package com.orilore.bizs;
import com.orilore.model.*;
import java.util.List;
public interface IB_cp_lxBiz{
	public boolean addB_cp_lx(B_cp_lx b_cp_lx);
	public boolean removeB_cp_lx(int id);
	public boolean modifyB_cp_lx(B_cp_lx b_cp_lx);
	public B_cp_lx getB_cp_lx(int id);
	public List<B_cp_lx> findB_cp_lx();
	public boolean removeB_cp_lxbycpid(int cpid);
}