package com.academy.cic;

import java.util.ArrayList;
import java.util.List;

import com.academy.cic.entity.Course;
import com.academy.cic.entity.Registration;
import com.academy.cic.entity.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dao dao = new Dao();
		
		Student student = new Student("Mario","Rossi",29);
		Student student2 = new Student("Paolo","Bianchi",25);
		Student student3 = new Student("Maria","Rossi",23);
		Student student4 = new Student("Luigi","Verdi",23);
		Student student5 = new Student("Mario","Rossi",35);

		dao.insertStudent(student);
		dao.insertStudent(student2);
		dao.insertStudent(student3);
		dao.insertStudent(student4);
		dao.insertStudent(student5);
		
		Course course = new Course("Java");
		Course course2 = new Course("DB");
		Course course3 = new Course("GIT");

		dao.insertCourse(course);
		dao.insertCourse(course2);
		dao.insertCourse(course3);

		//Registrazione student1 a corso1
		Registration registration = new Registration(student,course,28);
		List<Registration> registrations = new ArrayList<>();
		registrations.add(registration);
		
		student.setRegistrations(registrations);
		course.setRegistrations(registrations);
		
		dao.registryStudentCourse(registration);
		
		//Registrazione student a corso2
		Registration registration2 = new Registration(student,course2);
		List<Registration> registrations2 = new ArrayList<>();
		registrations2.add(registration2);
		
		student.getRegistrations().add(registration2);
		course2.setRegistrations(registrations2);
		
		dao.registryStudentCourse(registration2);
		
		//Registrazione student2 a corso3
		Registration registration3 = new Registration(student2,course3,30);
		List<Registration> registrations3 = new ArrayList<>();
		registrations3.add(registration3);
		
		student2.setRegistrations(registrations3);
		course3.setRegistrations(registrations3);
		
		dao.registryStudentCourse(registration3);

		//Registrazione student3 a corso 2 e 3
		Registration registration4 = new Registration(student3,course2,18);
		List<Registration> registrations4 = new ArrayList<>();
		registrations4.add(registration4);
		
		student3.setRegistrations(registrations4);
		course2.getRegistrations().add(registration4);
		
		dao.registryStudentCourse(registration4);

		
		Registration registration5 = new Registration(student3,course3,27);
		List<Registration> registrations5 = new ArrayList<>();
		registrations5.add(registration5);
		
		student3.getRegistrations().add(registration5);
		course2.getRegistrations().add(registration5);
		
		dao.registryStudentCourse(registration5);

		
		//Find By Name Surname
		
		List<Student> studentsFound = dao.findByNameSurname("Mario", "Rossi");
		if(studentsFound!=null)
			studentsFound.forEach(System.out::println);
		
		//updateCourseGradeById
		
		System.out.println(registration.getId());
		dao.updateCourseGradeById(registration.getId(), 27);
		
		System.out.println("Average grade dello student: "+student);
		System.out.println(dao.findAvgGradeByStudentId(student.getId()));
		
		System.out.println("Average grade dello student: "+student3);
		System.out.println(dao.findAvgGradeByStudentId(student3.getId()));
		
		
		//Visualizzare i dati di uno studente recuperato tramite id, 
		//i corsi a cui è registrato e per ognuno il voto conseguito (se presente)
		Student studentFound = dao.findStudent(student.getId());
		System.out.println("Corsi studente: "+studentFound);
		List<Registration> registrationsStudentFound = studentFound.getRegistrations();
		
		if(registrationsStudentFound !=null) {
			for(Registration r : registrationsStudentFound) {
				System.out.println("Corso: "+ r.getCourse()+
						(r.getGrade()!=0?" Voto: "+r.getGrade():""));
				
			}
		}
	}

}
