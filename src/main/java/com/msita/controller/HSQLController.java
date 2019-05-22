package com.msita.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.msita.entity.StudentEntity;
import com.msita.form.SvForm;
import com.msita.service.StudentService;

@Controller
public class HSQLController {
	@Autowired
	private StudentService studentService;

	@GetMapping(value = "/createStudent")
	public String CreateStudent(final Model model) {
		model.addAttribute("svForm", new SvForm());
		return "create_student";
	}

	@PostMapping(value = "/createStudent")
	public String CreateStudent(final Model model, @ModelAttribute("svForm") final SvForm svForm) {
		StudentEntity studentEntity = new StudentEntity();
		studentEntity.setId(svForm.getId());
		studentEntity.setName(svForm.getName());
		studentEntity.setMark(svForm.getMark());
		studentService.CreateStudent(studentEntity);
		return "redirect:/getALLStudents";
	}

	@GetMapping(value = "/updateStudent")
	public String EditStudent(final Model model) {
		model.addAttribute("svForm", new SvForm());
		return "update_student";
	}

	@PostMapping(value = "/updateStudent")
	public String EditStudent(final Model model, @ModelAttribute("svForm") final SvForm svForm) {
		final StudentEntity studentEntity =  new StudentEntity();
		studentEntity.setName(svForm.getName().toUpperCase());
		studentService.EditStudent(studentEntity);
		model.addAttribute("username", studentEntity);
		return "redirect:/welcome";
	}

	@GetMapping(value = "/removeStudent")
	public String RemoveStudent() {
		return "remove_student";
	}

	@PostMapping(value = "/removeStudent")
	public String RemoveStudent(@RequestParam("studentId") final Integer studentId) {
		studentService.RemoveStudent(studentId);
		return "redirect:/getALLStudents";
	}

	@GetMapping(value = "/getStudentById")
	public String getStudentById() {
		return "get_student_by_id";
	}

	@PostMapping(value = "/getStudentById")
	public String getStudentById(final Model model, @RequestParam("studentId") final Integer studentId) {
		final StudentEntity studentEntity = studentService.getStudentById(studentId);
		model.addAttribute("students", studentEntity);
		return "show_studentId";
	}

	@GetMapping(value = "/getStudentByName")
	public String getStudentByName() {
		return "get_student_by_name";
	}

	@PostMapping(value = "/getStudentByName")
	public String getStudentByName(final Model model, @RequestParam("studentName") final String studentName) {
		List<StudentEntity> studentEntity = studentService.getStudentByName(studentName);
		model.addAttribute("student", studentEntity);
		return "show_studentName";
	}

	@GetMapping(value = "/getALLStudents")
	public String getAllStudents(final Model model) {
		List<StudentEntity> students = studentService.getAllStudents();
		model.addAttribute("students", students);
		return "get_all_students";
	}

}
