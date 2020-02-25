package org.samples;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		
		// Spring Container to perform I.O.C.
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		// IOC
		StudentJDBCTemplate studentJDBCTemplate = context.getBean("studentJDBCTemplate", StudentJDBCTemplate.class);
		
		/*
		System.out.println("------Records Creation--------");
		
		studentJDBCTemplate.createStudent(null,"Tarun", 30);
		studentJDBCTemplate.createStudent(null,"Jennie", 2);
		studentJDBCTemplate.createStudent(null,"Kevin", 15);
		studentJDBCTemplate.createStudent(null,"George", 18);
		
		Student s = new Student();
		s.setId(null);
		s.setName("Fionna");
		s.setAge(50);
		
		studentJDBCTemplate.createStudent(s);
		*/
		
		
		
		/*System.out.println("-----------------------------");
		System.out.println("------Listing Multiple Records--------");
		List<Student> students = studentJDBCTemplate.listStudents();
		for (Student record : students) {
			System.out.println(record);
			System.out.println("-----------------------------");
		}*/
		
		
		/*
		System.out.println("----Listing Record with ID = 3 -----");
		Student student = studentJDBCTemplate.getStudent(3);
		System.out.println(student);
		*/
		
		/*
		System.out.println("----Updating Record with ID = 3 -----");
		studentJDBCTemplate.update(3, 67);
		System.out.println("-----------------------------");
		*/
		
		//studentJDBCTemplate.delete(3);
	}
}
