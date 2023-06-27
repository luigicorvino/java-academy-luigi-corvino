package com.academy.cic;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.academy.cic.model.Course;
import com.academy.cic.model.Module;

public class Main {

	public static void main(String[] args) {
		Dao dao = new Dao();
		
		Module m = new Module("modulo1","Rossi");
		Module m2 = new Module("modulo2","Bianchi");
		Module m3 = new Module("modulo3","Verdi");
		Module m4 = new Module("modulo4","Neri");
	
		Set<Module> modules1 = new HashSet<>();	
		modules1.add(m);
		modules1.add(m2);
		
		Course c1 = new Course("OOP", new Date(2023-1900,05,14),new Date(2023-1900,06,14),modules1);
		
		int id = dao.insertCourse(c1);
		System.out.println(id);
		
		Set<Module> modules2 = new HashSet<>();	
		modules2.add(m3);
		modules2.add(m4);
		
		Course c2 = new Course("Databases",new Date(2023-1900,06,14),new Date(2023-1900,07,14),modules2);
		dao.insertCourse(c2);
		
		//find course by name
		
		Course course = dao.findCourseByName("OOP");
		System.out.println(course);
		
		//Add module to course
		
		Module module5 = new Module("modulo5","Marco");
		
		dao.addModuleToCourse(module5, c2.getCourseId());
		
		
		//find course mosdules
		
		Set<Module> modulesFound = dao.findCourseModules(c2.getCourseId());
		modulesFound.forEach(System.out::println);
		
		//find course in range
		
		List<Course> coursesInRange = dao.findStartingCourseInRange(new Date(2023-1900,6,13), new Date(2023-1900,6,15));
		
		coursesInRange.forEach(System.out::println);
		
		
		//update start date
		
		dao.updateStartDate(new Date(2023-1900,7,12), c1.getCourseId());
		
		

		
	}
}
