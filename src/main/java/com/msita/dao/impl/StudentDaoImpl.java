package com.msita.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.msita.dao.StudentDao;
import com.msita.entity.Student;
import com.msita.entity.StudentEntity;

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private SessionFactory sessionFactory;

	public List<StudentEntity> getAllStudents() {
		Session session = sessionFactory.getCurrentSession();
		String hql = "FROM StudentEntity";
		Query query = session.createQuery(hql);
		return (List<StudentEntity>) query.list();
	}

	public void CreateStudent(StudentEntity studentEntity) {
		Session session = sessionFactory.getCurrentSession();
		session.save(studentEntity);
		session.evict(studentEntity);

	}

	public boolean EditStudent(StudentEntity studentEntity) {
		Session session = sessionFactory.getCurrentSession();
		studentEntity.setName("Nguyen Van Cuong");
		session.update(studentEntity);
		System.out.println("Update thanh cong");
		return true;
	}

	public boolean RemoveStudent(Integer studentId) {
		Session session = sessionFactory.getCurrentSession();
		final StudentEntity studentEntity = session.get(StudentEntity.class, studentId);
		if (studentEntity == null) {
			System.out.println("Xoa khong thanh cong");
			return false;
		}
		session.delete(studentEntity);
		session.flush();
		System.out.println("Xoa thanh cong" + studentEntity);
		return true;

	}

	public StudentEntity getStudentById(final Integer studentId) {
		Session session = sessionFactory.getCurrentSession();
		final StudentEntity studentEntity = session.get(StudentEntity.class, studentId);
		return studentEntity;
	}

	public List<StudentEntity>getStudentByName(final String studentName) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "FROM StudentEntity WHERE name =:name";
		Query query = session.createQuery(hql);
		query.setParameter("name","Le Thanh Tung");
		return (List<StudentEntity>)query.list();
	}
}
