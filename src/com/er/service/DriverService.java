package com.er.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.er.dao.DriverMapper;
import com.er.pojo.Driver;
import com.sun.org.apache.xpath.internal.operations.Div;
@Service
public class DriverService implements DriverServiceImp {

	@Autowired
	private DriverMapper dirverMapper;
	
	@Override
	public List<Driver> getAll() {
		// TODO Auto-generated method stub
		//调用dao的方法
		List<Driver> list = dirverMapper.getAll();
		return list;
	}

	@Override
	public void addTel(String dno, String adddel) {
		// TODO Auto-generated method stub
		dirverMapper.addTel(dno,adddel);
	}

	@Override
	public void del(String dno) {
		// TODO Auto-generated method stub
		dirverMapper.del(dno);
	}

	@Override
	public int addJsy(Driver driver) {
		// TODO Auto-generated method stub
		int flag = dirverMapper.addJsy(driver);
		return flag;
	}

	@Override
	public void update(Driver driver) {
		// TODO Auto-generated method stub
		dirverMapper.update(driver);
		
	}

	@Override
	public Driver validname(String dname) {
		// TODO Auto-generated method stub
		Driver driver = dirverMapper.validname(dname);
		return driver;
	}




}
