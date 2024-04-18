package com.er.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.er.pojo.Car;
import com.er.pojo.Driver;
import com.er.service.CarServiceImp;
import com.er.service.DriverServiceImp;

@Controller
@RequestMapping("car")
public class CarController {
	@Autowired
	private CarServiceImp carServiceImp;
	@Autowired
	private DriverServiceImp dsi;
	@RequestMapping("list")
	public String getAllCar(Model model){
		List<Car> list = carServiceImp.getAllCar();
		model.addAttribute("carlist", list);
		return "Carlist";
	}
	//��ת���ӽ���
	@RequestMapping("addcar")
	public String addCar(Model model){
		List<Driver> list = dsi.getAll();
		model.addAttribute("list", list);
		return "AddCar";
	}
	//���ӳ���
	@RequestMapping("addcar1")
	public String addCar1(Car car){
		carServiceImp.insertCar(car);
		return "redirect:list.action";
	}
	
	@RequestMapping("del")
	public String del(String cno){
		carServiceImp.del(cno);
		return "redirect:list.action";
	}
	//��ת���޸Ľ���
	@RequestMapping("update")
	public String update(){
		return "updatecar";
	}
	
	//�޸�����
	@RequestMapping("update1")
	public String update1(Car car){
		carServiceImp.updateCar(car);
		return "redirect:list.action";
	}
}
