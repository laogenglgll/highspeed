package com.er.dao;

import org.apache.ibatis.annotations.Param;

import com.er.pojo.User;

public interface UserMapper {
	//根据姓名查询是否存在该用户
	public User selectByUname(String uname);
	
	//修改pic的地址
	public void update(@Param("name")String name,@Param("uid")int uid);
	
	public void updateUser(@Param("uid")Integer uid,@Param("newPassWord")String newPassWord);
	//根据uid查询pwd
	public String getPwd(int uid);

}
