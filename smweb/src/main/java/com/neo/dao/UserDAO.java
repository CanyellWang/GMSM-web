package com.neo.dao;

import java.util.List;

import com.neo.model.User;

public interface UserDAO {
	public int insertUser(User user);
	public List<User> findAll(User user);
}
