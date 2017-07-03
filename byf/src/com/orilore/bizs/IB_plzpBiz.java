package com.orilore.bizs;
import com.orilore.model.*;
import java.util.List;
public interface IB_plzpBiz{
	public boolean addB_plzp(B_plzp b_plzp);
	public boolean removeB_plzp(int id);
	public boolean modifyB_plzp(B_plzp b_plzp);
	public B_plzp getB_plzp(int id);
	public List<B_plzp> findB_plzp();
}