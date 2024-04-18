package com.er.dao;

import java.util.List;

import com.er.pojo.Station;

public interface StationMapper {
	//查询所有的站点
	public List<Station> selectAllStation();
	//增加站点
	public void add(Station station);
	//根据站点的名字查询
	public Station getBySname(String sname);
	//更改数据
	public void updateById(Station station);
	/**
	 * 根据sid删除数据库里面的站点
	 * @param sid
	 */
	public void delBySid(String sid);
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Station getById(int id);
	/**
	 * 查询出站点，除了传入名字以外的站点
	 * @param sname
	 * @return list
	 */
	public List<Station> findOutStation(String sname);
}
