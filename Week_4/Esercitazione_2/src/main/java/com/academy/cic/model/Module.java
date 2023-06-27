package com.academy.cic.model;

import java.util.Objects;

public class Module {

	private int moduleId;
	private String name;
	private String teacher;
	
	
	public Module() {
		super();
	}


	public Module(String name, String teacher) {
		super();
		this.name = name;
		this.teacher = teacher;
	}


	public int getModuleId() {
		return moduleId;
	}


	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTeacher() {
		return teacher;
	}


	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}


	@Override
	public int hashCode() {
		return Objects.hash(moduleId, name, teacher);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Module other = (Module) obj;
		return moduleId == other.moduleId && Objects.equals(name, other.name) && Objects.equals(teacher, other.teacher);
	}


	@Override
	public String toString() {
		return "Module [moduleId=" + moduleId + ", name=" + name + ", teacher=" + teacher + "]";
	}
	
	 
	
	
}
