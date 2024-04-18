package com.er.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.er.dao.CarMapper;
import com.er.pojo.Car;
@Service
public class CarService implements CarServiceImp {
	
	@Autowired
	private CarMapper carMapper;

	@Override
	public List<Car> getAllCar() {
		// TODO Auto-generated method stub
		List<Car> list = carMapper.getAllCar();
		return list;
	}

	@Override
	public List<Car> getNotInCar() {
		List<Car> list = carMapper.getNotInCar();
		return list;
	}

	@Override
	public int insertCar(Car car) {
		// TODO Auto-generated method stub
		carMapper.insertCar(car);
		return 0;
	}

	@Override
	public void del(String cno) {
		// TODO Auto-generated method stub
		carMapper.del(cno);
	}

	@Override
	public void updateCar(Car car) {
		// TODO Auto-generated method stub
		carMapper.updateCar(car);
	}

}
