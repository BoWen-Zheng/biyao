package com.orilore.bizs;
import com.orilore.model.*;
import java.util.List;
public interface IB_yhBiz{
	public boolean addB_yh(B_yh b_yh);
	public boolean removeB_yh(int id);
	public boolean modifyB_yh(B_yh b_yh);
	public B_yh getB_yh(int id);
	public List<B_yh> findB_yh();
}