package com.er.dao;

import java.util.List;

import com.er.pojo.Car;

public interface CarMapper {
	//查询所哟的car
	public List<Car> getAllCar();
	//查询可进站的车
	public List<Car> getNotInCar();
	//根据cno查询
	public Car getByCno(String cno);
	/**
	 * 增加车辆
	 * @param car
	 * @return
	 */
	public int insertCar(Car car);
	
	/**
	 * 删除
	 * @param cno
	 */
	public void del(String cno);
	//修改数据
	public void updateCar(Car car);

}
