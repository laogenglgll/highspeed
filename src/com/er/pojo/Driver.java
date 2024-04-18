package com.er.pojo;

public class Driver {
	private String dno;
	private String dname;
	private String idcard;
	private int sex;
	private int score;
	private String tel;
	private int money;
	private String backup;
	private String createtime;
	public String getDno() {
		return dno;
	}
	public void setDno(String dno) {
		this.dno = dno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getBackup() {
		return backup;
	}
	public void setBackup(String backup) {
		this.backup = backup;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	@Override
	public String toString() {
		return "Driver [dno=" + dno + ", dname=" + dname + ", idcard=" + idcard + ", sex=" + sex + ", score=" + score
				+ ", tel=" + tel + ", money=" + money + ", backup=" + backup + ", createtime=" + createtime + "]";
	}
	
	
}
