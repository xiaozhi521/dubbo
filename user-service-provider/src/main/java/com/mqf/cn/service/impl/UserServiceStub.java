package com.mqf.cn.service.impl;

import java.util.List;

import com.mqf.cn.bean.UserAddress;
import com.mqf.cn.service.UserService;


public class UserServiceStub implements UserService {
	
	private final UserService userService;
	

	/**
	 * 传入的是userService远程的代理对象
	 * @param userService
	 */
	public UserServiceStub(UserService userService) {
		super();
		this.userService = userService;
	}


	public List<UserAddress> getUserAddressList(String userId) {
		// TODO Auto-generated method stub
		System.out.println("UserServiceStub.....");
		if(!userId.equals("")) {
			return userService.getUserAddressList(userId);
		}
		return null;
	}

}