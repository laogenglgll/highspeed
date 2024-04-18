package com.er.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.er.pojo.User;
import com.er.service.StationServiceImp;
import com.er.service.UserServiceImp;

@Controller
public class login {

	@Autowired
	private UserServiceImp usi;
	@Autowired
	private StationServiceImp stationServiceImp;
	
	@RequestMapping("login1")
	@ResponseBody
	public Map login1(@RequestBody User user){
		System.out.println(user.getUname() + user.getPwd());
		Map result = new HashMap<>();
		return result;
	}
	
	//��¼����
	@RequestMapping("login")
	public String userLogin(Model model){
		return "login";
	}
	
	@RequestMapping("slogin")
	public String sUserLogin(String username,String password,
			HttpSession session,Model model){
		User user = usi.selectByUname(username, password);
		if(user != null){
			session.setAttribute("user",user );
			return "main";
		}else{
			model.addAttribute("msg","�û������������������������");
			return "login";
		}
	}
	
	@RequestMapping("nav")
	public String returnNav(){
		return "nav";
	}
	
	
	@RequestMapping("uploadhead")
	public String upLoadHead(){
		return "UpdateHead";
	}
	
	@RequestMapping("updatepic")
	public String updatePic(MultipartFile pic,Integer uid) throws IllegalStateException, IOException{
		//ϵͳʱ�䵱���ļ���
		String fileName = "" + new Date().getTime();
		System.out.println("-__________----------");
		System.out.println(pic);
		//���ļ����ҵ���չ��
		String ext = pic.getOriginalFilename().substring(pic.getOriginalFilename().lastIndexOf("."));
		//����һ���ļ�����
		File dest = new File("D:/pic",fileName+ext);
		File 	direct = new File("D:/pic");
		if(direct.exists() == false){
			direct.mkdir();
		}
		pic.transferTo(dest);
		
		//��ͼƬ��·�����浽���ݿ�
		System.out.println(uid);
		System.out.println(fileName+ext);
		usi.updatePic(fileName+ext,uid);
		return "updatesuccess";
	}
	//��ת���޸��������
	@RequestMapping("updateuser1")
	public String updateuser1(){
		return "updatePwd";
	}
	
	//�޸�����
	@RequestMapping("updateuser")
	public String updateuser(Integer uid,String newPassWord){
		System.out.println(uid);
		System.out.println(newPassWord);
		usi.updateUser(uid, newPassWord);
		return "updatesuccess";
	}
	
	//����uid��ѯpwd
	@RequestMapping("getpwd")
	@ResponseBody
	public String getPwd(int uid){
		String pwd = usi.getPwd(uid);
		return pwd;
	}
	


}
