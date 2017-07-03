package com.orilore.model;
public class Cities{
	private Integer id;
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return this.id;
	}
	private String cityid;
	public void setCityid(String cityid){
		this.cityid=cityid;
	}
	public String getCityid(){
		return this.cityid;
	}
	private String city;
	public void setCity(String city){
		this.city=city;
	}
	public String getCity(){
		return this.city;
	}
	private String provinceid;
	public void setProvinceid(String provinceid){
		this.provinceid=provinceid;
	}
	public String getProvinceid(){
		return this.provinceid;
	}
}