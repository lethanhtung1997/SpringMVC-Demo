package com.msita.dao;

import java.util.List;

import com.msita.entity.Company;

public interface CompanyDao {
	void CreateCompany(Company company);
	Company getCompany(final int id);
	List<Company> getAllCompanies();
	
}
