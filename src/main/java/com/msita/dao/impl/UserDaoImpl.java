package com.msita.dao.impl;

import com.msita.dao.UserDao;
import com.msita.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void addUser(final User user) {
		final Session session = sessionFactory.getCurrentSession();
		session.save(user);
	}

	public void deleteUser(final String userId) {
		final Session session = sessionFactory.getCurrentSession();
		final User user = session.get(User.class, userId);
		if (user == null) {
			return;
		}
		session.delete(user);
		session.flush();
	}

	public User getUserById(final String userId) {
		final Session session = sessionFactory.getCurrentSession();
		final User user = session.get(User.class, userId);
		return user;
	}

	public List<User> getAllUsers() {
		final Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from User", User.class).getResultList();
	}
}
