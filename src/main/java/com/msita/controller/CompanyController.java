package com.msita.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.msita.entity.Company;
import com.msita.service.CompanyService;

@Controller
public class CompanyController {
	@Autowired
	private CompanyService companyService;

	@GetMapping(value = "/createCompany")
	public String CreateCompany() {
		return "createCompany";
	}

	@PostMapping("/createCompany")
	public String CreatCompany(@RequestParam("companyName") final String companyName) {
		Company company = new Company();
		company.setName(companyName);
		companyService.CreateCompany(company);
		return "redirect:/";
	}
}
