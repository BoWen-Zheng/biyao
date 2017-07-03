package com.orilore.dto;

import java.util.List;

import com.orilore.model.B_cp;
import com.orilore.model.B_lx;
import com.orilore.model.B_sj;

public class lxcpdto {
	private List<B_cp> cps;
	private B_lx lx;
	private List<B_sj> sjs;
	
	public List<B_cp> getCps() {
		return cps;
	}
	public void setCps(List<B_cp> cps) {
		this.cps = cps;
	}
	public B_lx getLx() {
		return lx;
	}
	public void setLx(B_lx lx) {
		this.lx = lx;
	}
	public List<B_sj> getSjs() {
		return sjs;
	}
	public void setSjs(List<B_sj> sjs) {
		this.sjs = sjs;
	}

}
