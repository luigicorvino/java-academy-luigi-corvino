package com.academy.cic.model;

public class StudentNumCourses {

	private Student student;
	private int numCourses;
	
	
	public StudentNumCourses() {
		super();
	}


	public StudentNumCourses(Student student, int numCourses) {
		super();
		this.student = student;
		this.numCourses = numCourses;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	public int getNumCourses() {
		return numCourses;
	}


	public void setNumCourses(int numCourses) {
		this.numCourses = numCourses;
	}


	@Override
	public String toString() {
		return "StudentNumCourses [student=" + student + ", numCourses=" + numCourses + "]";
	}
	
	
	
	
}
