package com.er.service;

import java.util.List;

import com.er.pojo.Car;

public interface CarServiceImp {
	//查询所有的car
	public List<Car> getAllCar();

	//查询可进站的车
	public List<Car> getNotInCar();
	/**
	 * 增加车辆
	 * @param car
	 * @return
	 */
	public int insertCar(Car car);

	public void del(String cno);
	//修改数据
	public void updateCar(Car car);
}
