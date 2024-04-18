package com.er.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.er.pojo.Station;
import com.er.service.StationServiceImp;

@Controller
@RequestMapping("nav")
public class navController {
	@Autowired
	private StationServiceImp stationServiceImp;
	@Autowired
	private StationController stationController;
	@RequestMapping("addstation")
	public String toAddStation(){
		return "addstation";
	}
	
	@RequestMapping("add")
	public String toAdd(Station station,Model model){
		//�����µ�վ��
		stationServiceImp.add(station);
		//��ת��ѯ�Ľ���
		return stationController.returnAnalysis(1, model);
	}
}
