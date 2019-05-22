package com.msita.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.msita.dao.EmployeeDao;
import com.msita.entity.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void CreateEmployee(final Employee employee) {
		final Session session = sessionFactory.getCurrentSession();
		session.save(employee);
	}
}