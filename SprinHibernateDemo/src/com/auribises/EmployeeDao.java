package com.auribises;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

// We are not using an interface and implementing it. We are directly creating methods !!
public class EmployeeDao {
	
	// API from Spring FW to interact with Hibernate
	HibernateTemplate template; // HAS-A Relation
	
	// Setter Injection for SessionFactory API from Spring FW
	public void setSessionFactory(SessionFactory factory) {
		template = new HibernateTemplate(factory); // Create the object for HibernateTemplate
	}
	
	public void saveEmployee(Employee e){
		template.save(e); // Which shall save the object into table
		System.out.println(e.getName()+" saved!!");
	}
	
	public void updateEmployee(Employee e){
		template.update(e);
		System.out.println("Record Updated !!");
	}
	
	public void listEmployees(){
		String hql = "From Employee";
		List<Employee> empList = template.find(hql);
		for(Employee emp : empList){
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println(emp);
		}		
	}
	
	public void deleteEmployee(Employee e){
		template.delete(e); // Which shall delete the object from table
		System.out.println("Record deleted!!");
	}
}
