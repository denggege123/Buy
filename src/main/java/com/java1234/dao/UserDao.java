package com.java1234.dao;

import com.java1234.entity.User;

/**
 * 用户DAO接口
 */
public interface UserDao {
	
	/**
	 * 用户登录
	 * @param user
	 * @return
	 */
	public User login(User user);
}
