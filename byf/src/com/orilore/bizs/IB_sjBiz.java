package com.orilore.bizs;
import com.orilore.model.*;
import java.util.List;
public interface IB_sjBiz{
	public boolean addB_sj(B_sj b_sj);
	public boolean removeB_sj(int id);
	public boolean modifyB_sj(B_sj b_sj);
	public B_sj getB_sj(int id);
	public List<B_sj> findB_sj();
}