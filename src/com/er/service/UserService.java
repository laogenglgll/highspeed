package com.er.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.er.dao.UserMapper;
import com.er.pojo.User;

@Service
public class UserService implements UserServiceImp {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public User selectByUname(String uname, String password) {
		// TODO Auto-generated method stub
		User user =  userMapper.selectByUname(uname);
		if(user != null && password.equals(user.getPwd())){
			return user;
		}
		
		return null;
	}

	@Override
	public void updatePic(String name, int uid) {
		// TODO Auto-generated method stub
		userMapper.update(name,uid);
		
	}

	@Override
	public void updateUser(Integer uid, String newPassWord) {
		// TODO Auto-generated method stub
		userMapper.updateUser(uid, newPassWord);
	}

	@Override
	public String getPwd(int uid) {
		// TODO Auto-generated method stub
		String pwd = userMapper.getPwd(uid);
		return null;
	}



}
