package com.orilore.bizs;
import com.orilore.model.*;
import java.util.List;
public interface IB_czxqBiz{
	public boolean addB_czxq(B_czxq b_czxq);
	public boolean removeB_czxq(int id);
	public boolean modifyB_czxq(B_czxq b_czxq);
	public B_czxq getB_czxq(int id);
	public List<B_czxq> findB_czxq();
	public B_czxq getB_czxqbyczlbid(int czlbid);
	public boolean removeB_czxqbyczlbid(int czlbid);
}