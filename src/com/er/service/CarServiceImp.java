package com.er.service;

import java.util.List;

import com.er.pojo.Car;

public interface CarServiceImp {
	//��ѯ���е�car
	public List<Car> getAllCar();

	//��ѯ�ɽ�վ�ĳ�
	public List<Car> getNotInCar();
	/**
	 * ���ӳ���
	 * @param car
	 * @return
	 */
	public int insertCar(Car car);

	public void del(String cno);
	//�޸�����
	public void updateCar(Car car);
}
