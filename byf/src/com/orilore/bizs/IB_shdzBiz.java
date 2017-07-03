package com.orilore.bizs;
import com.orilore.model.*;
import java.util.List;
public interface IB_shdzBiz{
	public boolean addB_shdz(B_shdz b_shdz);
	public boolean removeB_shdz(int id);
	public boolean modifyB_shdz(B_shdz b_shdz);
	public B_shdz getB_shdz(int id);
	public List<B_shdz> findB_shdz();
}