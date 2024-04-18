package com.er.pojo;

public class FeereCord {
	private int id;
	private String cno;
	private int beginid;
	private int endid;
	private int price;
	private int state;
	private String backup;
	private String createtime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public int getBeginid() {
		return beginid;
	}
	public void setBeginid(int beginid) {
		this.beginid = beginid;
	}
	public int getEndid() {
		return endid;
	}
	public void setEndid(int endid) {
		this.endid = endid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
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
	public FeereCord(int id, String cno, int beginid, int endid, int price, int state, String backup,
			String createtime) {
		super();
		this.id = id;
		this.cno = cno;
		this.beginid = beginid;
		this.endid = endid;
		this.price = price;
		this.state = state;
		this.backup = backup;
		this.createtime = createtime;
	}
	
	
}
