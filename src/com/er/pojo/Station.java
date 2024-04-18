package com.er.pojo;

public class Station {
	
	private int sid;
	private String sname;
	private int price;
	private String datetime;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	@Override
	public String toString() {
		return "pojo [sid=" + sid + ", sname=" + sname + ", price=" + price + ", datetime=" + datetime + "]";
	}
	
	
	
}
