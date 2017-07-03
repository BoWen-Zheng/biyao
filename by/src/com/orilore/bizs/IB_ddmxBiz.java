package com.orilore.bizs;
import com.orilore.model.*;
import java.util.List;
public interface IB_ddmxBiz{
	public boolean addB_ddmx(B_ddmx b_ddmx);
	public boolean removeB_ddmx(int id);
	public boolean modifyB_ddmx(B_ddmx b_ddmx);
	public B_ddmx getB_ddmx(int id);
	public List<B_ddmx> findB_ddmx();
}