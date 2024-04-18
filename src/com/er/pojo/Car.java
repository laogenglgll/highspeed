package com.er.pojo;

public class Car {
	private String cno;
	private String cname;
	private String dno;
	private String backup;
	private String createtime;
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getDno() {
		return dno;
	}
	public void setDno(String dno) {
		this.dno = dno;
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
		return "Car [cno=" + cno + ", cname=" + cname + ", dno=" + dno + ", backup=" + backup + ", createtime="
				+ createtime + "]";
	}
	
	

}
