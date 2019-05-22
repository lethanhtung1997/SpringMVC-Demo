package com.msita.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.msita.dao.CompanyDao;
import com.msita.entity.Company;

@Repository("companyDao")
public class CompanyDaoImpl implements CompanyDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void CreateCompany(final Company company) {
		Session session = sessionFactory.getCurrentSession();
		session.save(company);
	}

	public Company getCompany(final int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Company.class, id);
	}

	public List<Company> getAllCompanies() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("FROM Company");
		return query.list();
	}
}
