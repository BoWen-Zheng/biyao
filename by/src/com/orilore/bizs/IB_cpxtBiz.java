package com.orilore.bizs;
import com.orilore.model.*;
import java.util.List;
public interface IB_cpxtBiz{
	public boolean addB_cpxt(B_cpxt b_cpxt);
	public boolean removeB_cpxt(int id);
	public boolean modifyB_cpxt(B_cpxt b_cpxt);
	public B_cpxt getB_cpxt(int id);
	public List<B_cpxt> findB_cpxt();
	public List<B_cpxt> getB_cpxtbycpid(int cpid);
	public boolean removeB_cpxtbycpid(int cpid);
}