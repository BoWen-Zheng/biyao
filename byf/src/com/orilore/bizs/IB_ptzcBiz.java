package com.orilore.bizs;
import com.orilore.model.*;
import java.util.List;
public interface IB_ptzcBiz{
	public boolean addB_ptzc(B_ptzc b_ptzc);
	public boolean removeB_ptzc(int id);
	public boolean modifyB_ptzc(B_ptzc b_ptzc);
	public B_ptzc getB_ptzc(int id);
	public List<B_ptzc> findB_ptzc();
}