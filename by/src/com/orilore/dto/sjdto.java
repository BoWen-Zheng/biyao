package com.orilore.dto;

import java.util.List;

import com.orilore.model.B_sj;

public class sjdto {
	private List<B_sj> sjs;
	private int pagecounts;
	private int nowpage;
	public List<B_sj> getSjs() {
		return sjs;
	}
	public void setSjs(List<B_sj> sjs) {
		this.sjs = sjs;
	}
	public int getPagecounts() {
		return pagecounts;
	}
	public void setPagecounts(int pagecounts) {
		this.pagecounts = pagecounts;
	}
	public int getNowpage() {
		return nowpage;
	}
	public void setNowpage(int nowpage) {
		this.nowpage = nowpage;
	}
}
