package com.er.service;

import java.util.List;
import java.util.Map;

import com.er.pojo.FeereCordStation;

public interface FeereCordStationServiceImp {
	//查询所有站点
	public List<FeereCordStation> findAll();
	//入站修改
	public void insert(FeereCordStation feereCordStation);
	
	/**
	 * 	计算小站点到大站点的费用
	 * @param cond
	 * @return int
	 */
	public int fee(Map<String,Integer> cond);
	
	//根据cno查询dno,根据dno查询余额
	public int getByCnoPrice(String cno);
	
	public void out(Integer endid,Integer fid,Integer price,String cno);

	
}
