package com.er.dao;

import org.apache.ibatis.annotations.Param;

import com.er.pojo.User;

public interface UserMapper {
	//����������ѯ�Ƿ���ڸ��û�
	public User selectByUname(String uname);
	
	//�޸�pic�ĵ�ַ
	public void update(@Param("name")String name,@Param("uid")int uid);
	
	public void updateUser(@Param("uid")Integer uid,@Param("newPassWord")String newPassWord);
	//����uid��ѯpwd
	public String getPwd(int uid);

}
