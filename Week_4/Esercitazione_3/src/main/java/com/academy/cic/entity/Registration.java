package com.academy.cic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "REGISTRATION")
@NamedQuery(name = "Registration.findAvgGradeByStudentId",
			query = "SELECT avg(r.grade) FROM Registration r WHERE r.student.id = :studentId and r.grade!=0")
public class Registration extends Base {

	@ManyToOne
	@JoinColumn(name = "student_id" )
	private Student student;
	
	@ManyToOne
	@JoinColumn(name = "course_id")
	private Course course;
	
	@Column
	private int grade;

	
	
	public Registration() {
		super();
	}



	
	public Registration(Student student, Course course) {
		super();
		this.student = student;
		this.course = course;
	}




	public Registration(Student student, Course course, int grade) {
		super();
		this.student = student;
		this.course = course;
		this.grade = grade;
	}



	public Student getStudent() {
		return student;
	}



	public void setStudent(Student student) {
		this.student = student;
	}



	public Course getCourse() {
		return course;
	}



	public void setCourse(Course course) {
		this.course = course;
	}



	public int getGrade() {
		return grade;
	}



	public void setGrade(int grade) {
		this.grade = grade;
	}



	@Override
	public String toString() {
		return "Registration [student=" + student + ", course=" + course + ", grade=" + grade + "]";
	}
	
	
	
	
}
