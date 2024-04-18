package com.er.service;

import java.util.List;

import com.er.pojo.Driver;

public interface DriverServiceImp {
	/**
	 * 查询所有的站点
	 * @return list
	 */
	public List<Driver> getAll();
	/**
	 * 充值
	 * @param dno
	 * @param adddel
	 */
	
	public void addTel(String dno,String adddel);
	/**
	 * 删除
	 * @param dno
	 */
	public void del(String dno);
	/**
	 * 	增加驾驶员
	 * @param driver
	 * @return int 是否成功
	 */
	public int addJsy(Driver driver);
	/**
	 * 修改数据
	 * @param driver
	 */
	public void update(Driver driver);
	
	/**
	 * 判断名字是否纯在
	 * @param dname
	 * @return
	 */
	public Driver validname(String dname);
}
