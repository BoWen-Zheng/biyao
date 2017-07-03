package com.orilore.bizs;
import com.orilore.model.*;
import java.util.List;
public interface IB_wzplBiz{
	public boolean addB_wzpl(B_wzpl b_wzpl);
	public boolean removeB_wzpl(int id);
	public boolean modifyB_wzpl(B_wzpl b_wzpl);
	public B_wzpl getB_wzpl(int id);
	public List<B_wzpl> findB_wzpl();
}