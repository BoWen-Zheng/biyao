package com.orilore.bizs;
import com.orilore.model.*;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
public interface IB_cpBiz{
	public boolean addB_cp(B_cp b_cp);
	public boolean removeB_cp(int id);
	public boolean modifyB_cp(B_cp b_cp);
	public B_cp getB_cp(int id);
	public List<B_cp> findB_cp();
	public List<B_cp> selectcpbyid(HttpServletRequest request,int nowpage);
	public int selectcount(HttpServletRequest request);
}