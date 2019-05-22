package com.msita.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.msita.entity.Company;
import com.msita.entity.Employee;
import com.msita.form.EmployeeForm;
import com.msita.service.CompanyService;
import com.msita.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private CompanyService companyService;
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/createEmployee")
	public String CreataEmployee(final Model model) {
		model.addAttribute("employeeForm", new EmployeeForm());
		return "create_employee";
	}

	@PostMapping("/createEmployee")
	public String CreateEmployee(@ModelAttribute("employeeForm") final EmployeeForm employeeForm) {
		Employee employee = new Employee();
		employee.setName(employeeForm.getName());
		employee.setGender(employee.getGender());
		employee.setHomeTown(employee.getHomeTown());
		final int id = employeeForm.getId();
		Company company = new Company();
		company.setId(id);
		employee.setCompany(company);
		employeeService.CreateEmployee(employee);
		return "redirect:/";
	}

	@ModelAttribute("genders")
	public Map<String, String> getGenders() {
		Map<String, String> genders = new HashMap<String, String>();
		genders.put("F", "Female");
		genders.put("M", "Male");
		return genders;
	}

	@ModelAttribute("companies")
	public Map<Integer, String> getCompanies() {
		Map<Integer, String> companies = new HashMap<Integer, String>();
		List<Company> companiesList = companyService.getAllCompanies();
		if (companiesList == null) {
			return companies;
		}
		for (int i = 0; i < companiesList.size(); i++) {
			Company company = companiesList.get(i);
			companies.put(company.getId(), company.getName());
		}
		return companies;

	}
}
