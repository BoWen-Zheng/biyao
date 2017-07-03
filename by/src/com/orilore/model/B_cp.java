package com.orilore.model;

import java.util.List;

public class B_cp{
	private Integer id;
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return this.id;
	}
	private String cpmc;
	public void setCpmc(String cpmc){
		this.cpmc=cpmc;
	}
	public String getCpmc(){
		return this.cpmc;
	}
	private String cpms;
	public void setCpms(String cpms){
		this.cpms=cpms;
	}
	public String getCpms(){
		return this.cpms;
	}
	private Integer sczq;
	public void setSczq(Integer sczq){
		this.sczq=sczq;
	}
	public Integer getSczq(){
		return this.sczq;
	}
	private Double cpjg;
	public void setCpjg(Double cpjg){
		this.cpjg=cpjg;
	}
	public Double getCpjg(){
		return this.cpjg;
	}
	private String cpxq;
	public void setCpxq(String cpxq){
		this.cpxq=cpxq;
	}
	public String getCpxq(){
		return this.cpxq;
	}
	private String fbsj;
	public void setFbsj(String fbsj){
		this.fbsj=fbsj;
	}
	public String getFbsj(){
		return this.fbsj;
	}
	private Integer zt;
	public void setZt(Integer zt){
		this.zt=zt;
	}
	public Integer getZt(){
		return this.zt;
	}
	private String cptp;
	public void setCptp(String cptp){
		this.cptp=cptp;
	}
	public String getCptp(){
		return this.cptp;
	}
	private Integer sjid;
	public void setSjid(Integer sjid){
		this.sjid=sjid;
	}
	public Integer getSjid(){
		return this.sjid;
	}
	private String lbtp;
	public void setLbtp(String lbtp){
		this.lbtp=lbtp;
	}
	public String getLbtp(){
		return this.lbtp;
	}
	private String xptp;
	public void setXptp(String xptp){
		this.xptp=xptp;
	}
	public String getXptp(){
		return this.xptp;
	}
	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}
	private int mid;
	
	private B_sj sj;
	private List<B_lx> lxs;
	private B_mb mb;
	public B_sj getSj() {
		return sj;
	}

	public void setSj(B_sj sj) {
		this.sj = sj;
	}

	public List<B_lx> getLxs() {
		return lxs;
	}

	public void setLxs(List<B_lx> lxs) {
		this.lxs = lxs;
	}

	public B_mb getMb() {
		return mb;
	}

	public void setMb(B_mb mb) {
		this.mb = mb;
	}
}