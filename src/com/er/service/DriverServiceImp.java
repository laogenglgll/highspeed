package com.er.service;

import java.util.List;

import com.er.pojo.Driver;

public interface DriverServiceImp {
	/**
	 * ��ѯ���е�վ��
	 * @return list
	 */
	public List<Driver> getAll();
	/**
	 * ��ֵ
	 * @param dno
	 * @param adddel
	 */
	
	public void addTel(String dno,String adddel);
	/**
	 * ɾ��
	 * @param dno
	 */
	public void del(String dno);
	/**
	 * 	���Ӽ�ʻԱ
	 * @param driver
	 * @return int �Ƿ�ɹ�
	 */
	public int addJsy(Driver driver);
	/**
	 * �޸�����
	 * @param driver
	 */
	public void update(Driver driver);
	
	/**
	 * �ж������Ƿ���
	 * @param dname
	 * @return
	 */
	public Driver validname(String dname);
}
