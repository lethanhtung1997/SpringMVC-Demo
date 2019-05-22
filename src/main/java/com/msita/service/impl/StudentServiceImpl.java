package com.msita.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msita.dao.StudentDao;
import com.msita.entity.StudentEntity;
import com.msita.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;

	@Transactional
	public List<StudentEntity> getAllStudents() {
		return studentDao.getAllStudents();
	}

	@Transactional
	public void CreateStudent(StudentEntity studentEntity) {
		studentDao.CreateStudent(studentEntity);
	}

	@Transactional
	public boolean RemoveStudent(Integer studentId) {
		return studentDao.RemoveStudent(studentId);
	}

	@Transactional
	public List<StudentEntity> getStudentByName(String studentName) {
		return studentDao.getStudentByName(studentName);
	}

	@Transactional
	public boolean EditStudent(StudentEntity studentEntity) {
		return studentDao.EditStudent(studentEntity);
	}

	@Transactional
	public StudentEntity getStudentById(Integer studentId) {
		return studentDao.getStudentById(studentId);
	}

}
