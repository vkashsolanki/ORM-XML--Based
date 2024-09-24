package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.entity.User;

@Service
public class UserService {
	@Autowired
	private UserDao dao;
	
	public int createUser(User user) {
		
		return this.dao.saveUser(user);
	}

}
