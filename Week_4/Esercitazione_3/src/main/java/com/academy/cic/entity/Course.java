package com.academy.cic.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "COURSE")
public class Course extends Base {

	@Column(length = 64, nullable = false)
	private String name;
	
	@OneToMany(mappedBy = "course", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Registration> registrations;

	
	
	public Course() {
		super();
	}

	
	
	public Course(String name) {
		super();
		this.name = name;
	}



	public Course(String name, List<Registration> registrations) {
		super();
		this.name = name;
		this.registrations = registrations;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Registration> getRegistrations() {
		return registrations;
	}

	public void setRegistrations(List<Registration> registrations) {
		this.registrations = registrations;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + "]";
	}
	
	
}
