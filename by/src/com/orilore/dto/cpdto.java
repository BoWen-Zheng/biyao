package com.orilore.dto;

import java.util.List;

import com.orilore.model.B_cc;
import com.orilore.model.B_cp;

public class cpdto {
	private int pagecount;
	private int nowpage;
	private List<B_cp> cps;
	public int getPagecount() {
		return pagecount;
	}
	public void setPagecount(int pagecount) {
		this.pagecount = pagecount;
	}
	public int getNowpage() {
		return nowpage;
	}
	public void setNowpage(int nowpage) {
		this.nowpage = nowpage;
	}
	public List<B_cp> getCps() {
		return cps;
	}
	public void setCps(List<B_cp> cps) {
		this.cps = cps;
	}
}
