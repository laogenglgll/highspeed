package com.er.service;

import java.util.List;

import com.er.pojo.Station;
import com.github.pagehelper.PageInfo;

public interface StationServiceImp {
	//��ѯ���е�վ��
	public PageInfo<Station> selectAllStation(int pageNum);
	//����վ��
	public void add(Station station);
	//����վ������ֲ�ѯ
	public Station getBySname(String sname);
	//��������
	public void updateById(Station station);
	/**
	 * ����sidɾ��վ��
	 * @param sidO
	 */
	public void delBySid(String sid);
	//�޲β�ѯ
	public List<Station> selectAllStation();
	
	/**
	 * ��ѯ��վ�㣬���˴������������վ��
	 * @param sname
	 * @return list
	 */
	public List<Station> findOutStation(String sname);
}
