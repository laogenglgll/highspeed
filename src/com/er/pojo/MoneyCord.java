package com.er.pojo;

public class MoneyCord {
	private int mid;
	private String dno;
	private int money;
	private int type;
	private String createtime;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getDno() {
		return dno;
	}
	public void setDno(String dno) {
		this.dno = dno;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	@Override
	public String toString() {
		return "MoneyreCord [mid=" + mid + ", dno=" + dno + ", money=" + money + ", type=" + type + ", createtime="
				+ createtime + "]";
	}
	
	
}
