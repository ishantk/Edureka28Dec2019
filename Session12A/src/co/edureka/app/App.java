package co.edureka.app;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.criterion.Restrictions;

import co.edureka.model.Employee;

public class App {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(null, "Mike", "mike@example.com", 40000);
		
		Employee emp2 = new Employee();
		emp2.setEid(null);
		emp2.setName("Fionna");
		emp2.setEmail("fionna@example.com");
		emp2.setSalary(50000);

		System.out.println(emp1);
		System.out.println(emp2);
		
		// Objects Created are Temporary in the RAM
		// Data shall be persisted in DataBase
		// This time, we shall not use JDBC, instead we will use Hibernate :)
		/*
		  	Hibernate Procedure:
		  	1. Create Model
		  	2. Create Client Class with main method
		  	3. Link Hibernate Jar Files and MySQL Jar File | https://hibernate.org/orm/releases/
		  	4. Copy hibernate.cfg.xml file in src directory
		  		for database and driver configuration details
		  	5. Copy anyanme.hbm.xml file in src directory
		  		for model to table mapping
		  	6. Executing Hibernte Code in Client Class :) i.e. App	
		 
		 */
		
		// SessionFactory is used to create Session
		SessionFactory sessionFactory = null;
		
		// Session API is connection to the DataBase and shall provide further APIs
		// APIs like: save, update, delete and query to perform DB Operations
		Session session = null;
		
		// For Any Operation in Hibernate it goes as Atomic(All at Once i.e. Transaction)
		Transaction transaction = null;
		
		// Parse hibernate.cfg.xml file using APO StandardServiceRegistry in Hibernate
		// And obtain reference to SessionFactory Object
		try {
			
			StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
					.configure()
					.build();
			
			// Obtain the reference to sessionFactory
			sessionFactory = new MetadataSources(registry)
					.buildMetadata()
					.buildSessionFactory();
			
			// obtain session
			session = sessionFactory.openSession();
			
			// obtain transaction
			transaction = session.getTransaction();
			transaction.begin();
			
			// 1. Insert Data Into Table
			session.save(emp1);
			session.save(emp2);
			System.out.println(">> "+emp1.getName()+" Saved in DataBase :) ");
			System.out.println(">> "+emp2.getName()+" Saved in DataBase :) ");
			
			/*
			// 2. Get Single Record from DataBase
			Employee employee = session.get(Employee.class, 2);
			System.out.println(employee);
			
			// 3. Update Record in DatBase
			employee.setName("Mike Watson");
			employee.setSalary(47599);
			
			session.update(employee);
			System.out.println(">> "+employee.getName()+" Updated:) ");
			*/
			
			// 4. Delete Record from DataBase
			/*Employee employee = new Employee();
			employee.setEid(2);
			session.delete(employee);
			System.out.println(">> "+employee.getEid()+" Deleted:) ");*/
			
			// 5. Fetch Multiple/All Records
			/*
			//   Hibernate Query Language
			//String hql = "From Employee";
			String hql = "From Employee where salary > 40000";
			// String sql = "selet * from Employee"; | session.createSQLQuery(sql) | Change API to fire raw SQL Queries
			List<Employee> employees = session.createQuery(hql).list();
			
			for(Employee employee : employees) {
				System.out.println(employee);
			}
			*/
			
			// Fetch Records withoud SQL or HQL :)
			/*
			Criteria criteria = session.createCriteria(Employee.class);
			criteria.add(Restrictions.gt("salary", 40000));
			List<Employee> employees = criteria.list();
			
			for(Employee employee : employees) {
				System.out.println(employee);
			}*/
			
			transaction.commit();
			System.out.println(">> Transaction Finished :) ");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
		
	}

}
