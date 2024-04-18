package com.er.service;

import com.er.pojo.User;

public interface UserServiceImp {
	//根据姓名查询是否存在该用户
	public User selectByUname(String uname,String password);
	
	//修改pic的地址
	public void updatePic(String name,int uid);
	
	public void updateUser(Integer uid,String newPassWord);
	//根据uid查询pwd
	public String getPwd(int uid);
}
