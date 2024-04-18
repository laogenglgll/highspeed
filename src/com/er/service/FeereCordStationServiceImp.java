package com.er.service;

import java.util.List;
import java.util.Map;

import com.er.pojo.FeereCordStation;

public interface FeereCordStationServiceImp {
	//��ѯ����վ��
	public List<FeereCordStation> findAll();
	//��վ�޸�
	public void insert(FeereCordStation feereCordStation);
	
	/**
	 * 	����Сվ�㵽��վ��ķ���
	 * @param cond
	 * @return int
	 */
	public int fee(Map<String,Integer> cond);
	
	//����cno��ѯdno,����dno��ѯ���
	public int getByCnoPrice(String cno);
	
	public void out(Integer endid,Integer fid,Integer price,String cno);

	
}
