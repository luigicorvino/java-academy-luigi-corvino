package com.academy.cic;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.TypedQuery;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.academy.cic.model.Course;
import com.academy.cic.model.Module;
import com.academy.cic.util.HibernateUtil;

public class Dao {

	public Integer insertCourse(Course course) {
		System.out.println("Insert course");
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		Integer id = 0;
		try {
			tx = session.beginTransaction();
			id=(Integer) session.save(course);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close(); 
		}
		return id;
	}
	
	public Course findCourseByName(String name) {
		System.out.println("Find course by name");
		Session session = HibernateUtil.getSessionFactory().openSession();
		Course c = null;
		try {
			TypedQuery<Course> query = session.createQuery("FROM Course c WHERE c.name = ?0", Course.class);
			query.setParameter(0, name);
			query.setMaxResults(1);
			c = query.getSingleResult();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close(); 
		}
		
		return c;
	}
	
	public void addModuleToCourse(Module module, int courseId) {
		System.out.println("Add module to course");
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		
		try {
			Course c = session.get(Course.class, courseId);
			c.getModules().add(module);
			
			tx = session.beginTransaction();
			session.update(c);
			tx.commit();
			
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close(); 
		}
	}
	
	public Set<Module> findCourseModules(int courseId){
		System.out.println("Find course modules");
		Session session = HibernateUtil.getSessionFactory().openSession();
		Set<Module> modules=null;
		try {
			Course c = session.get(Course.class, courseId);
			if(c!=null)
				modules = c.getModules();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close(); 
		}
		
		return modules;
		
	}
	
	public List<Course> findStartingCourseInRange(Date from, Date to){
		System.out.println("Find courses with date");
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Course> courses=null;
		try {
			TypedQuery<Course> query = session.createQuery("FROM Course c WHERE c.startDate BETWEEN :from AND :to", Course.class);
			query.setParameter("from", from);
			query.setParameter("to", to);	
			courses = query.getResultList();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close(); 
		}
		
		return courses;
	}
	
	public void updateStartDate(Date startDate, int courseId) {
		System.out.println("update start date");
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			Course c = session.get(Course.class, courseId);
			c.setStartDate(startDate);
			tx = session.beginTransaction();
			session.merge(c);
			tx.commit();
			
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close(); 
		}
	}
	
	public void deleteCourse(int courseId) {
		System.out.println("Delete course");
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			Course c = session.get(Course.class, courseId);
			tx = session.beginTransaction();
			session.remove(c);
			tx.commit();
			
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close(); 
		}
	}
	
}
