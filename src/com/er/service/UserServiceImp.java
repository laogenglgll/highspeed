package com.er.service;

import com.er.pojo.User;

public interface UserServiceImp {
	//����������ѯ�Ƿ���ڸ��û�
	public User selectByUname(String uname,String password);
	
	//�޸�pic�ĵ�ַ
	public void updatePic(String name,int uid);
	
	public void updateUser(Integer uid,String newPassWord);
	//����uid��ѯpwd
	public String getPwd(int uid);
}
