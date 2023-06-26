package com.academy.cic;

import java.sql.SQLException;
import java.util.List;

import com.academy.cic.model.Course;
import com.academy.cic.model.Registration;
import com.academy.cic.model.Student;
import com.academy.cic.model.StudentNumCourses;

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Dao dao = new Dao();
		//Prova inserimento studente
		Student s = new Student(1,"Mario","Rossi",25);

		dao.insertStudent(s);

		//Prova inserimento corso
		Course c = new Course(1,"OOP");

		dao.insertCourse(c);

		//Prova registrazione
		Registration r = new Registration(1,s,c,25);

		dao.registryStudentCourse(r);

		//Prova trovare uno studente per nome e cognome
		Student s1 = dao.selectByNameSurname("Mario", "Rossi");
				
		System.out.println(s1);

		//Prova aggiornamento voto
		dao.updateCourseGradeById(r.getId(), 28);

		
		//Prova trovare corsi studente
		Course c2 = new Course(2,"Databases");

		dao.insertCourse(c2);

		Registration r2 = new Registration(2,s,c2,30);

		dao.registryStudentCourse(r2);

		List<Course> listaCorsi;

		listaCorsi = dao.findStudentCourses(1);

		System.out.println("Lista corsi dello studente: "+s);

		listaCorsi.forEach(System.out::println);

		System.out.println("-------------------------------");


		//Prova lista Id studente e numero corsi
		Student s2 = new Student(2,"Paolo","Bianchi",28);

		dao.insertStudent(s2);

		dao.registryStudentCourse(new Registration(3,s2,c,24));

		List<StudentNumCourses> listaIdStudenteNumeroCorsi;

		listaIdStudenteNumeroCorsi = dao.findStudentIdNumCourses();

		System.out.println("Student id + numero corsi");


		listaIdStudenteNumeroCorsi.forEach(System.out::println);

		System.out.println("-------------------------------");


		//Prova lista dati studente e numero corsi
		List<StudentNumCourses> listaDatiStudenteNumeroCorsi;

		listaDatiStudenteNumeroCorsi = dao.findStudentDataNumCourses();

		System.out.println("Student data + numero corsi");

		listaDatiStudenteNumeroCorsi.forEach(System.out::println);




	}

}
