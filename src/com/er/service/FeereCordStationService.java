package com.er.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.er.dao.CarMapper;
import com.er.dao.DriverMapper;
import com.er.dao.FeereCordStationMapper;
import com.er.dao.MoneyCordMapper;
import com.er.pojo.Car;
import com.er.pojo.Driver;
import com.er.pojo.FeereCordStation;
import com.er.pojo.MoneyCord;
@Service
public class FeereCordStationService implements FeereCordStationServiceImp {
	@Autowired
	private FeereCordStationMapper feereCordMapper;
	@Autowired
	private CarMapper carMapper;
	@Autowired
	private DriverMapper driverMapper;
	@Autowired
	private MoneyCordMapper moneyCordMapper;
	
	
	@Override
	public List<FeereCordStation> findAll() {
		// TODO Auto-generated method stub
		List<FeereCordStation> list = feereCordMapper.findAll();
		return list;
	}
	@Override
	public void insert(FeereCordStation feereCordStation) {
		// TODO Auto-generated method stub
		feereCordMapper.insert(feereCordStation);
	}
	@Override
	public int fee(Map<String, Integer> cond) {
		int fee = feereCordMapper.fee(cond);
		return fee;
	}
	@Override
	public int getByCnoPrice(String cno) {
		// TODO Auto-generated method stub
		Car car =  carMapper.getByCno(cno);
		Driver driver = driverMapper.getByDno(car.getDno());
		
		return driver.getMoney();
	}
	@Override
	public void out(Integer endid, Integer fid, Integer price, String cno) {
		// TODO Auto-generated method stub
		//封装feerecordStation,之后进行修改
		FeereCordStation feerdCordStation = new FeereCordStation();
		feerdCordStation.setEndid(endid);
		feerdCordStation.setPrice(price);
		feerdCordStation.setCno(cno);
		feerdCordStation.setId(fid);
		feereCordMapper.updateOut(feerdCordStation);
		
		//2修改驾驶员余额
		Driver driver = driverMapper.GetByCno(cno);
		driver.setMoney(driver.getMoney() - price);
		driverMapper.update(driver);
		
		//3插入一条记录
		MoneyCord moneyCord = new MoneyCord();
		moneyCord.setMoney(price);
		moneyCord.setDno(driver.getDno());
		moneyCord.setType(2);
		moneyCordMapper.insert(moneyCord);
		
		
	}

}
