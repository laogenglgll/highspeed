package com.er.dao;

import java.util.List;
import java.util.Map;

import com.er.pojo.FeereCordStation;

public interface FeereCordStationMapper {
	//��վ�޸�
	public void insert(FeereCordStation feereCordStation);
	//��ѯ���е�վ��
	public List<FeereCordStation> findAll();
	/**
	 * 	����Сվ�㵽��վ��ķ���
	 * @param cond
	 * @return int
	 */
	public int fee(Map<String,Integer> cond);
	/**
	 * �޸�վ�㣬��վ������fid
	 * @param feereCordStation
	 */
	public void updateOut(FeereCordStation feereCordStation);
}
