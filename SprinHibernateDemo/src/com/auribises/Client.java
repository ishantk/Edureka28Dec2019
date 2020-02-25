package com.auribises;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
	public static void main(String[] args) {
		
		// Execute the same code in Servlet
		
		// Spring Container | BeanFactory | ApplicationContext
		//Resource r=new ClassPathResource("applicationContext.xml");
		//BeanFactory factory=new XmlBeanFactory(r);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDao dao = (EmployeeDao)context.getBean("dao");
		
//		Employee e = new Employee();
//		e.setName("Becca");
//		e.setSalary(30000);
//		
//		dao.saveEmployee(e);
//		
//		e=new Employee();
//		e.setName("Henry");
//		e.setSalary(50000);
//		
//		dao.saveEmployee(e);
	
//		Employee e=new Employee();
//		e.setId(1); // which id to update
//		e.setName("Becca Watson");
//		e.setSalary(77500);
//		
//		dao.updateEmployee(e);
		
//		dao.listEmployees();
		
//		Employee e=new Employee();
//		e.setId(1);
//	
//		dao.deleteEmployee(e);
		
		
	}
}
