package com.er.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.er.pojo.Driver;
import com.er.service.DriverServiceImp;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("driver")
public class DriverController {
	@Autowired
	private DriverServiceImp driverServiceImp;
	//访问驾驶员查询界面
	@RequestMapping("Jsylist")
	public String jsyList(@RequestParam(value="pageNum",defaultValue="1") int pageNum,Model model){
		PageHelper.startPage(pageNum, 2);
		List<Driver> list = driverServiceImp.getAll();
		PageInfo<Driver> result = new PageInfo<Driver>(list);
		model.addAttribute("pageinfo", result);
		return "Jsylist";
	}
	//充值界面
	@RequestMapping("chongzhi")
	public String chongZhi(String tel,String dno,String dname,Model model){
		model.addAttribute("tel", tel);
		model.addAttribute("dno", dno);
		model.addAttribute("dname", dname);
		return "chongzhi";
	}
	
	//充值修改金额
	@RequestMapping("add")
	public String addTel(@RequestParam(value="pageNum",defaultValue="1") int pageNum,String dno,
						String adddel,Model model){
		driverServiceImp.addTel(dno, adddel);
		List<Driver> list = driverServiceImp.getAll();
		PageInfo<Driver> result = new PageInfo<Driver>(list);
		model.addAttribute("pageinfo", result);
		return "Jsylist";
	}
	@RequestMapping("del")
	public String del(String dno,Model model){
		driverServiceImp.del(dno);
		List<Driver> list = driverServiceImp.getAll();
		PageInfo<Driver> result = new PageInfo<Driver>(list);
		model.addAttribute("pageinfo", result);
		return "Jsylist";
		
	}
	//跳转新增驾驶员的界面
	@RequestMapping("addjsy")
	public String addjsy(){
		return "AddJsy";
	}
	//新增驾驶员
	@RequestMapping("addjsy1")
	public String addJsy(Driver driver,Model model){
		driverServiceImp.addJsy(driver);
		List<Driver> list = driverServiceImp.getAll();
		PageInfo<Driver> result = new PageInfo<Driver>(list);
		model.addAttribute("pageinfo", result);
		return "jsylist";
	}
	
	//跳转修改界面
	@RequestMapping("update")
	public String update(Driver driver){
		return "updatejsy";
	}
	//修改数据
	@RequestMapping("update1")
	public String update1(Driver driver,Model model){
		driverServiceImp.update(driver);
		List<Driver> list = driverServiceImp.getAll();
		PageInfo<Driver> result = new PageInfo<Driver>(list);
		model.addAttribute("pageinfo", result);
		return "redirect:Jsylist.action";
	}
	
	//检查名字是否重复
	@ResponseBody
	@RequestMapping("validname")
	public Map<String,String> validname(String dname,Model model){
		Driver driver = driverServiceImp.validname(dname) ;
		Map<String,String> result = new HashMap<String,String>();
		System.out.println(driver);
		if(driver == null){
			result.put("msg", "名字不重复");
		}else{
			System.out.println("12");
			result.put("msg", "名字重复");
		}
		return result;
	}
}
