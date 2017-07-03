package com.orilore.dto;

import java.util.List;

public class cartdto {
	private int sjid;
	private String sjmc;
	private List<cartcpdto> cartcpdto;
	public int getSjid() {
		return sjid;
	}
	public void setSjid(int sjid) {
		this.sjid = sjid;
	}
	public String getSjmc() {
		return sjmc;
	}
	public void setSjmc(String sjmc) {
		this.sjmc = sjmc;
	}
	public List<cartcpdto> getCartcpdto() {
		return cartcpdto;
	}
	public void setCartcpdto(List<cartcpdto> cartcpdto) {
		this.cartcpdto = cartcpdto;
	}

}
