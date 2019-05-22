package com.msita.service.impl;

import com.msita.dao.UserDao;
import com.msita.entity.User;
import com.msita.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Transactional
	public void addUser(final User user) {
		userDao.addUser(user);
	}

	@Transactional
	public void deleteUser(final String userId) {
		userDao.deleteUser(userId);
	}

	@Transactional
	public User getUserById(final String userId) {
		return userDao.getUserById(userId);
	}

	@Transactional
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

}
