package com.er.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.er.dao.StationMapper;
import com.er.pojo.Station;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class StationService implements StationServiceImp{
	
	@Autowired
	private StationMapper stationMapper;
	
	@Override
	public PageInfo<Station> selectAllStation( int pageNum) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum,2);
		List<Station> list = stationMapper.selectAllStation();
		PageInfo<Station> result = new PageInfo<>(list);
		
		System.out.println(result);
		return result;
	}

	@Override
	public void add(Station station) {
		// TODO Auto-generated method stub
		stationMapper.add(station);
		
	}

	@Override
	public Station getBySname(String sname) {
		// TODO Auto-generated method stub
		
		//查询
		Station station =  stationMapper.getBySname(sname);
		
		//返回结果
		return station;
	}

	@Override
	public void updateById(Station station) {
		// TODO Auto-generated method stub
		stationMapper.updateById(station);
	}

	@Override
	public void delBySid(String sid) {
		// TODO Auto-generated method stub
		stationMapper.delBySid(sid);
	}

	@Override
	public List<Station> selectAllStation() {
		// TODO Auto-generated method stub
		List<Station> list = stationMapper.selectAllStation();
		return list;
	}

	@Override
	public List<Station> findOutStation(String sname) {
		// TODO Auto-generated method stub
		List<Station> list = stationMapper.findOutStation(sname);
		return list;
	}
	
}
