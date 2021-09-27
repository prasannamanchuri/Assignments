package com.capgemini.springmvc.dao;

import com.capgemini.springmvc.entity.User;

public interface UserDao {
	
	public String save(User user);
	public User getUsername(String username);

}
