package com.er.dao;

import java.util.List;
import java.util.Map;

import com.er.pojo.FeereCordStation;

public interface FeereCordStationMapper {
	//入站修改
	public void insert(FeereCordStation feereCordStation);
	//查询所有的站点
	public List<FeereCordStation> findAll();
	/**
	 * 	计算小站点到大站点的费用
	 * @param cond
	 * @return int
	 */
	public int fee(Map<String,Integer> cond);
	/**
	 * 修改站点，出站。根据fid
	 * @param feereCordStation
	 */
	public void updateOut(FeereCordStation feereCordStation);
}
