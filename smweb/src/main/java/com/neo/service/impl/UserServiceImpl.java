package com.neo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neo.dao.UserDAO;
import com.neo.model.User;
import com.neo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
    private UserDAO userDAO;
	
	public int insertUser(User user) {
		return userDAO.insertUser(user);
	}

	public List<User> findAll(User user) {
		return userDAO.findAll(user);
	}

}
