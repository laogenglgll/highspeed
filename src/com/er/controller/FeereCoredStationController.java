package com.er.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.er.pojo.Car;
import com.er.pojo.FeereCordStation;
import com.er.pojo.Station;
import com.er.service.CarServiceImp;
import com.er.service.FeereCordStationServiceImp;
import com.er.service.StationServiceImp;

@Controller
@RequestMapping("fee")
public class FeereCoredStationController {

	@Autowired
	private FeereCordStationServiceImp feereCordStationServiceImp;
	
	@Autowired
	private CarServiceImp carServiceImp;
	@Autowired
	private StationServiceImp stationServiceImp;
	
	@RequestMapping("toin.action")
	public String toin(Model model){
		List<Car> list =  carServiceImp.getNotInCar();
		List<Station> list2 = stationServiceImp.selectAllStation();
		
		List<FeereCordStation> list3 = feereCordStationServiceImp.findAll();
		model.addAttribute("carlist", list);
		model.addAttribute("stationlist", list2);
		model.addAttribute("feelist", list3);
		return "instation";
	}
	
	@RequestMapping("in")
	@ResponseBody
	public String in(String cno,Integer beginid){
		FeereCordStation fcs = new FeereCordStation();
		fcs.setCno(cno);
		fcs.setBeginid(beginid);
		feereCordStationServiceImp.insert(fcs);
		return "redirect:tion.action";
	}
	
	//计算费用
	@RequestMapping("fee1")
	@ResponseBody
	public Map<String,Integer> fee(Integer beginid,Integer endid){
		Map<String,Integer> result = new HashMap<String,Integer>();
		int min = beginid < endid?beginid:endid;
		int max = beginid > endid?beginid:endid;
		System.out.println(min);
		System.out.println(max);
		//存放大小站点的参数
		result.put("minid", min);
		result.put("maxid", max);
		//查询费用
		int fee = feereCordStationServiceImp.fee(result);
		result.put("fee", fee);
		return result;
	}
	
	@RequestMapping("outstation")
	public String outstation(String cno,String sname,int inid,Model model){
		model.addAttribute("cno", cno);
		model.addAttribute("sname", sname);
		model.addAttribute("inid", inid);
		//根据cno查询dno,根据dno查询余额
		int price = feereCordStationServiceImp.getByCnoPrice(cno);
		model.addAttribute("price", price);
		//获取出去的站点
		List<Station> list = stationServiceImp.findOutStation(sname);
		model.addAttribute("outlist", list);
		return "OutStation";
		
	}
	
	@RequestMapping("out")
	public String out(String endid,Integer fid,Integer price,String cno){
		
		return "redirect:toin.action";
		
	}
}
