package com.academy.cic.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
@NamedQuery(name = "Student.findByNameSurname", 
			query = "SELECT s FROM Student s WHERE s.firstName = :firstName and s.lastName = :lastName" )
public class Student extends Base {

	@Column(name = "first_name", length = 32, nullable = false)
	private String firstName;
	
	@Column(name = "last_name", length = 32, nullable = false)
	private String lastName;
	
	@Column
	private int age;
	
	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Registration> registrations;

	
	
	public Student() {
		super();
	}

	
	
	public Student(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}



	public Student(String firstName, String lastName, int age, List<Registration> registrations) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.registrations = registrations;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public List<Registration> getRegistrations() {
		return registrations;
	}



	public void setRegistrations(List<Registration> registrations) {
		this.registrations = registrations;
	}



	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	
	
	
	
}
