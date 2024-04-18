package com.er.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.er.pojo.Driver;

public interface DriverMapper {
	/**
	 * ��ѯ��Ӵ�ļ�ʻԱ
	 * @return List<Driver>
	 */
	public List<Driver> getAll();
	/**
	 * ��ֵ
	 * @param dno
	 * @param adddel
	 */
	public void addTel(@Param("dno")String dno,@Param("addtel")String adddel);
	/**
	 * ɾ��
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
	 * ���������ж��Ƿ����
	 * @param dname
	 * @return
	 */
	public Driver validname(String dname);
	/**
	 * ����id��ѯ
	 * @param string
	 * @return
	 */
	public Driver getByDno(String string);
	/**
	 * ����car��Cno����ѯdriver
	 * @param cno
	 * @return
	 */
	public Driver GetByCno(String cno);
}
