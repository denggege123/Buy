package com.java1234.service;

import com.java1234.entity.User;

/**
 * 用户Service接口
 * @author yuyang
 *
 */
public interface UserService {

	/**
	 * 用户登录
	 * @param user
	 * @return
	 */
	public User login(User user);
}
