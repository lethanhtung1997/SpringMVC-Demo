package com.msita.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msita.dao.EmployeeDao;
import com.msita.entity.Employee;
import com.msita.service.EmployeeService;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;

	@Transactional
	public void CreateEmployee(Employee employee) {
		employeeDao.CreateEmployee(employee);

	}

}
