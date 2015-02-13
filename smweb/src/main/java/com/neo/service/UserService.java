package com.neo.service;

import java.util.List;

import com.neo.model.User;

public interface UserService {
	public int insertUser(User user);
	public List<User> findAll(User user);
}
