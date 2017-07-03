package com.orilore.bizs;
import com.orilore.model.*;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
public interface IB_lxBiz{
	public boolean addB_lx(B_lx b_lx);
	public boolean removeB_lx(int id);
	public boolean modifyB_lx(B_lx b_lx);
	public B_lx getB_lx(int id);
	public List<B_lx> findB_lx();
	public List<B_lx> comtrees();
	public List<B_lx> familytree(int id);
	public List<B_lx> selecttrees();
	public boolean updatelx(int id,String mc,String bm,int zt,int pid,int xszt);
	public boolean checkupdatelx(int pid,int id);
}