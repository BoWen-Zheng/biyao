package com.orilore.bizs;
import com.orilore.model.*;
import java.util.List;
public interface IB_cpqmBiz{
	public boolean addB_cpqm(B_cpqm b_cpqm);
	public boolean removeB_cpqm(int id);
	public boolean modifyB_cpqm(B_cpqm b_cpqm);
	public B_cpqm getB_cpqm(int id);
	public List<B_cpqm> findB_cpqm();
	public List<B_cpqm> getB_cpqmbycpid(int cpid);
	public boolean removeB_cpqmbycpid(int cpid);
}