package com.er.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.er.pojo.Station;
import com.er.service.StationServiceImp;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("station")
public class StationController {
	@Autowired
	private StationServiceImp stationServiceImp;
	
	@RequestMapping("stationlist")
	public String returnAnalysis(@RequestParam(value="pageNum",defaultValue="1")int pageNum,Model model){
		PageInfo<Station> list =  stationServiceImp.selectAllStation(pageNum);
		model.addAttribute("list", list);
		return "Analysis";
	}
	
	@RequestMapping("validname")
	@ResponseBody
	public Map<String,String> getBySname(String sname){
		Map<String,String> result = new HashMap<String,String>();
		Station station =  stationServiceImp.getBySname(sname);
		if(station == null){
			result.put("msg", "站点的名称可用");
		}else{
			result.put("msg", "站点的名称不可用");
		}
		return result;
	}
	//转到修改界面
	@RequestMapping("updateStation")
	public String updateStation(String sname,int price,String sid,Model model){
		model.addAttribute("sname", sname);
		model.addAttribute("price", price);
		model.addAttribute("sid", sid);
		return "updatestation";
	}
	//修改传递参数，进行数据库的修改
	
	@RequestMapping("update")
	public String update(Station station,Model model){
		stationServiceImp.updateById(station);
		return returnAnalysis(1,model);
	}
	
	//根据id删除站点
	@RequestMapping("del")
	public String delBySid(String sid,Model model){
		stationServiceImp.delBySid(sid);
		return returnAnalysis(1,model);
	}
}
