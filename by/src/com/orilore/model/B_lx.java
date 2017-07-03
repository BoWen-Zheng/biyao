package com.orilore.model;
public class B_lx{
	private Integer id;
	private int level;
	private int zt;
	private int xszt;
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return this.id;
	}
	private String mc;
	public void setMc(String mc){
		this.mc=mc;
	}
	public String getMc(){
		return this.mc;
	}
	private String bm;
	public void setBm(String bm){
		this.bm=bm;
	}
	public String getBm(){
		return this.bm;
	}
	private Integer pid;
	public void setPid(Integer pid){
		this.pid=pid;
	}
	public Integer getPid(){
		return this.pid;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getZt() {
		return zt;
	}

	public void setZt(int zt) {
		this.zt = zt;
	}

	public int getXszt() {
		return xszt;
	}

	public void setXszt(int xszt) {
		this.xszt = xszt;
	}
}