package com.java1234.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java1234.dao.UserDao;
import com.java1234.entity.User;
import com.java1234.service.UserService;

/**
 * �û�Serviceʵ����
 * @author yuyang
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService{

	@Resource
	private UserDao userDao;
	
	public User login(User user) {
		return userDao.login(user);
	}

}
