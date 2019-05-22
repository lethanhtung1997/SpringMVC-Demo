package com.msita.dao;

import java.util.List;

import com.msita.entity.StudentEntity;

public interface StudentDao {
	List<StudentEntity> getAllStudents();

	void CreateStudent(final StudentEntity studentEntity);

	boolean EditStudent(final StudentEntity studentEntity);

	boolean RemoveStudent(final Integer studentId);

	StudentEntity getStudentById(final Integer studentId);

	List<StudentEntity> getStudentByName(final String studentName);

}
