package com.java1234.dao;

import com.java1234.entity.User;

/**
 * �û�DAO�ӿ�
 */
public interface UserDao {
	
	/**
	 * �û���¼
	 * @param user
	 * @return
	 */
	public User login(User user);
}
