package com.orilore.bizs;
import com.orilore.model.*;
import java.util.List;
public interface IB_plBiz{
	public boolean addB_pl(B_pl b_pl);
	public boolean removeB_pl(int id);
	public boolean modifyB_pl(B_pl b_pl);
	public B_pl getB_pl(int id);
	public List<B_pl> findB_pl();
}