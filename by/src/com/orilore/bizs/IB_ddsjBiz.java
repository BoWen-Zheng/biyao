package com.orilore.bizs;
import com.orilore.model.*;
import java.util.List;
public interface IB_ddsjBiz{
	public boolean addB_ddsj(B_ddsj b_ddsj);
	public boolean removeB_ddsj(int id);
	public boolean modifyB_ddsj(B_ddsj b_ddsj);
	public B_ddsj getB_ddsj(int id);
	public List<B_ddsj> findB_ddsj();
}