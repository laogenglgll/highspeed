package com.er.service;

import java.util.List;

import com.er.pojo.Station;
import com.github.pagehelper.PageInfo;

public interface StationServiceImp {
	//查询所有的站点
	public PageInfo<Station> selectAllStation(int pageNum);
	//增加站点
	public void add(Station station);
	//根据站点的名字查询
	public Station getBySname(String sname);
	//更改数据
	public void updateById(Station station);
	/**
	 * 根据sid删除站点
	 * @param sidO
	 */
	public void delBySid(String sid);
	//无参查询
	public List<Station> selectAllStation();
	
	/**
	 * 查询出站点，除了传入名字以外的站点
	 * @param sname
	 * @return list
	 */
	public List<Station> findOutStation(String sname);
}
