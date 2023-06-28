package com.academy.cic;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.academy.cic.entity.Course;
import com.academy.cic.entity.Registration;
import com.academy.cic.entity.Student;
import com.academy.cic.util.JpaUtil;

public class Dao {

	private static final Logger logger = Logger.getLogger(Dao.class.getName());

	public void insertStudent(Student student) {
		logger.info("insertStudent");
		EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();

		try {
			entityManager.getTransaction().begin();
			entityManager.persist(student); 
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace(); 
		} finally {
			entityManager.close(); 
		}
	}

	public void insertCourse(Course course) {
		logger.info("insertCourse");
		EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();

		try {
			entityManager.getTransaction().begin();
			entityManager.persist(course); 
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace(); 
		} finally {
			entityManager.close(); 
		}
	}

	public void registryStudentCourse(Registration registration) {
		logger.info("registryStudent");
		EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();

		try {			
			entityManager.getTransaction().begin();
			entityManager.persist(registration); 
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace(); 
		} finally {
			entityManager.close(); 
		}
	}

	public List<Student> findByNameSurname(String name, String surname){
		logger.info("findByNameSurname");
		EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
		List<Student> students = null;
		try {
			TypedQuery<Student> query = entityManager.createNamedQuery("Student.findByNameSurname", Student.class);
			query.setParameter("firstName", name);
			query.setParameter("lastName", surname);
			students = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace(); 
		} finally {
			entityManager.close(); 
		}

		return students;
	}

	public void updateCourseGradeById(int registrationId, int grade) {
		logger.info("updateCourseGrade");
		EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
		Registration registration = null;
		
		try {
			registration = entityManager.find(Registration.class, registrationId);
			registration.setGrade(grade);
			entityManager.getTransaction().begin();
			entityManager.persist(registration); 
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace(); 
		} finally {
			entityManager.close(); 
		}
	}
	
	public Double findAvgGradeByStudentId(int studentId) {
		logger.info("findAvgGrade");
		EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
		Double avg = 0.0;
		try {
			TypedQuery<Double> query = entityManager.createNamedQuery("Registration.findAvgGradeByStudentId", Double.class);
			query.setParameter("studentId", studentId);
			avg = query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace(); 
		} finally {
			entityManager.close(); 
		}

		return avg;
	}


}
