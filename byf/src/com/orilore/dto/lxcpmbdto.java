package com.orilore.dto;

import java.util.List;

import com.orilore.model.B_lx;
import com.orilore.model.B_sj;

public class lxcpmbdto {
	private B_lx lx;
	private List<B_sj> sjs;
	private List<cpdto> cpdtos;
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
	public List<cpdto> getCpdtos() {
		return cpdtos;
	}
	public void setCpdtos(List<cpdto> cpdtos) {
		this.cpdtos = cpdtos;
	}
}
