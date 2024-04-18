package com.er.pojo;

public class FeereCordStation {
	private int fid;
	private String cno;
	private int beginid;
	private int endid;
	private int price;
	private int state;
	private String backup;
	private String createtime;
	
	private Station in;
	private Station out;
	public int getId() {
		return fid;
	}
	public void setId(int id) {
		this.fid = id;
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
	public Station getIn() {
		return in;
	}
	public void setIn(Station in) {
		this.in = in;
	}
	public Station getOut() {
		return out;
	}
	public void setOut(Station out) {
		this.out = out;
	}
	@Override
	public String toString() {
		return "FeereCordStation [id=" + fid + ", cno=" + cno + ", beginid=" + beginid + ", endid=" + endid + ", price="
				+ price + ", state=" + state + ", backup=" + backup + ", createtime=" + createtime + ", in=" + in
				+ ", out=" + out + "]";
	}
	
	
	
}
