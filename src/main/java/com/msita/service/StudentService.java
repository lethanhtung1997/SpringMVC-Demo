package com.msita.service;

import java.util.List;

import com.msita.entity.StudentEntity;

public interface StudentService {
	List<StudentEntity> getAllStudents();

	void CreateStudent(final StudentEntity studentEntity);

	boolean EditStudent(StudentEntity studentEntity);

	boolean RemoveStudent(final Integer studentId);

	List<StudentEntity> getStudentByName(final String studentName);

	StudentEntity getStudentById(final Integer studentId);
}
