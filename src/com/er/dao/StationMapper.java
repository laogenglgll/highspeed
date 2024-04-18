package com.er.dao;

import java.util.List;

import com.er.pojo.Station;

public interface StationMapper {
	//��ѯ���е�վ��
	public List<Station> selectAllStation();
	//����վ��
	public void add(Station station);
	//����վ������ֲ�ѯ
	public Station getBySname(String sname);
	//��������
	public void updateById(Station station);
	/**
	 * ����sidɾ�����ݿ������վ��
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
	 * ��ѯ��վ�㣬���˴������������վ��
	 * @param sname
	 * @return list
	 */
	public List<Station> findOutStation(String sname);
}
