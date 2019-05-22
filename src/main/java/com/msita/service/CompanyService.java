package com.msita.service;

import java.util.List;

import com.msita.entity.Company;

public interface CompanyService {
	void CreateCompany(final Company company);
		Company getCompany(final int id);
		List<Company> getAllCompanies();
}
