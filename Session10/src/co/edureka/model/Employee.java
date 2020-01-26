package co.edureka.model;

/*
 	
 	SQL : Structured Query Language
 	ORM : Object Relational Mapping
 		  Whatever is structure of Object, shall be the structure of Table in DataBase
 		 
 	Java:
 	class Employee {
 		public int eid;
		public String name;
		public String email;
		public int salary;
 	}
 		
 	SQL:	  
 	create table Employee(
 		eid int primary key auto_increment, 
 		name varchar(256),
 		email varchar(256),
 		salary int
 	)	  
 
 	Java:
 	Employee employee = new Employee(1, "John", "john@example.com", 30000)
 	
 	employee.setDetails(1, "John Watson", "john.watson@example.com", 35700)
 	
 	In Java Object Deletion happens automatically
 	In Java we can use toString to fetch the data and show it to the user :)
 	
 	SQL:
 	insert into Employee values(1, 'John', 'john@example.com', 30000) ---can use null for eid---> insert into Employee values(null, 'John', 'john@example.com', 30000)
 	
 	update Employee set name ='John Watson', email = 'john.watson@example.com', salary = 37500 where eid = 1
 	
 	delete from Employee where eid = 1
 	
 	select * from Employee						--- all the records ---
 	select * from Employee where eid = 1		--- all the records for eid 1---
 	select name, email from Employee			--- all the records with 2 columns ---
 	
 	
 */


public class Employee {
	
	// Attributes : Property of Object :)
	public int eid;
	public String name;
	public String email;
	public int salary;
	
	public Employee() {
		
	}
	
	public Employee(int eid, String name, String email, int salary) {
		this.eid = eid;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", email=" + email + ", salary=" + salary + "]";
	}
	
}
