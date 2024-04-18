package com.er.dao;

import java.util.List;

import com.er.pojo.Car;

public interface CarMapper {
	//��ѯ��Ӵ��car
	public List<Car> getAllCar();
	//��ѯ�ɽ�վ�ĳ�
	public List<Car> getNotInCar();
	//����cno��ѯ
	public Car getByCno(String cno);
	/**
	 * ���ӳ���
	 * @param car
	 * @return
	 */
	public int insertCar(Car car);
	
	/**
	 * ɾ��
	 * @param cno
	 */
	public void del(String cno);
	//�޸�����
	public void updateCar(Car car);

}
