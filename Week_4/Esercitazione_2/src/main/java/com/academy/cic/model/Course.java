package com.academy.cic.model;

import java.util.Date;
import java.util.Set;

public class Course {

	private int courseId;
	private String name;
	private Date startDate;
	private Date endDate;
	private Set<Module> modules;
	
	
	public Course() {
		super();
	}

	public Course(String name, Date startDate, Date endDate, Set<Module> modules) {
		super();
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.modules = modules;
	}






	public Set<Module> getModules() {
		return modules;
	}

	public void setModules(Set<Module> modules) {
		this.modules = modules;
	}

	public int getCourseId() {
		return courseId;
	}



	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Date getStartDate() {
		return startDate;
	}



	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}



	public Date getEndDate() {
		return endDate;
	}



	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", name=" + name + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", modules=" + modules + "]";
	}

	
	
	
}
