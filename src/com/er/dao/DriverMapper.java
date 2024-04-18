package com.er.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.er.pojo.Driver;

public interface DriverMapper {
	/**
	 * 查询所哟的驾驶员
	 * @return List<Driver>
	 */
	public List<Driver> getAll();
	/**
	 * 充值
	 * @param dno
	 * @param adddel
	 */
	public void addTel(@Param("dno")String dno,@Param("addtel")String adddel);
	/**
	 * 删除
	 * @param dno
	 */
	public void del(String dno);
	/**
	 * 
	 * @param driver
	 * @return int
	 */
	public int addJsy(Driver driver);
	/**
	 * date
	 * @param driver
	 */
	public void update(Driver driver);
	/**
	 * 根据名字判断是否存在
	 * @param dname
	 * @return
	 */
	public Driver validname(String dname);
	/**
	 * 根据id查询
	 * @param string
	 * @return
	 */
	public Driver getByDno(String string);
	/**
	 * 根据car的Cno，查询driver
	 * @param cno
	 * @return
	 */
	public Driver GetByCno(String cno);
}
