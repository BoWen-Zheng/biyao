package com.orilore.bizs;
import com.orilore.dto.sjdto;
import com.orilore.model.*;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
public interface IB_sjBiz{
	public boolean addB_sj(HttpServletRequest request,String sjmc);
	public boolean removeB_sj(int id);
	public boolean modifyB_sj(B_sj bean);
	public B_sj getB_sj(int id);
	public List<B_sj> findB_sj();
	public List<B_sj> findB_sj(int page);
	public int findcount();
	public sjdto showview(int page);
}