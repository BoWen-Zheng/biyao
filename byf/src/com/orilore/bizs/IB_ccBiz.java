package com.orilore.bizs;
import com.orilore.model.*;
import java.util.List;
public interface IB_ccBiz{
	public boolean addB_cc(B_cc b_cc);
	public boolean removeB_cc(int id);
	public boolean modifyB_cc(B_cc b_cc);
	public B_cc getB_cc(int id);
	public List<B_cc> findB_cc();
	public List<B_cc> findbycpid(int cpid);
}