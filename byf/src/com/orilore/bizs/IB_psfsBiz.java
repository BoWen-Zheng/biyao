package com.orilore.bizs;
import com.orilore.model.*;
import java.util.List;
public interface IB_psfsBiz{
	public boolean addB_psfs(B_psfs b_psfs);
	public boolean removeB_psfs(int id);
	public boolean modifyB_psfs(B_psfs b_psfs);
	public B_psfs getB_psfs(int id);
	public List<B_psfs> findB_psfs();
}