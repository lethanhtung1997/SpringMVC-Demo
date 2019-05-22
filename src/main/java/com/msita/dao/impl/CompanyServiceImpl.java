package com.msita.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msita.dao.CompanyDao;
import com.msita.entity.Company;
import com.msita.service.CompanyService;

@Service("companyService")
public class CompanyServiceImpl implements CompanyService {
	@Autowired
	private CompanyDao companyDao;

	@Transactional
	public void CreateCompany(Company company) {
		companyDao.CreateCompany(company);

	}

	@Transactional
	public Company getCompany(final int id) {
		return companyDao.getCompany(id);
	}

	@Transactional
	public List<Company> getAllCompanies() {
		return companyDao.getAllCompanies();
	}
}
//c2 dung trong controller httpservlet request /creatCompany?copanyName=... 
