package com.orilore.bizs;
import com.orilore.model.*;
import java.util.List;
public interface IB_sjzxBiz{
	public boolean addB_sjzx(B_sjzx b_sjzx);
	public boolean removeB_sjzx(int id);
	public boolean modifyB_sjzx(B_sjzx b_sjzx);
	public B_sjzx getB_sjzx(int id);
	public List<B_sjzx> findB_sjzx();
}