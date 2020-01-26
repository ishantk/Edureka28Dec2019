package co.edureka.app;

import java.util.ArrayList;
import java.util.Scanner;

import co.edureka.db.DBHelper;
import co.edureka.model.Employee;

public class EMSApp {

	public static void main(String[] args) {
	
		/*
		System.out.println(">> Add Employee Details: ");
		
		Employee employee = new Employee();
		
		Scanner scanner = new Scanner(System.in);
//		System.out.println(">> Enter Employee EID: ");
//		employee.eid = scanner.nextInt();
		
		System.out.println(">> Enter Employee Salary: ");
		employee.salary = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println(">> Enter Employee Name: ");
		employee.name = scanner.nextLine();
		
		System.out.println(">> Enter Employee Email: ");
		employee.email = scanner.nextLine();
		
		System.out.println(">> Details Entered for "+employee.name);
		System.out.println(employee); // execute the toString method
		
		System.out.println(">> Would you like to save detials of "+employee.name+" (yes/no): ");
		String choice = scanner.next();
		
		if(choice.equalsIgnoreCase("yes")) {
			System.out.println(">> Saving Employee Details...");
			
			DBHelper db = new DBHelper();
			db.createConnection();
			db.insertEmployee(employee);
			db.closeConnection();
			
		}else {
			System.out.println(">> Thank you for Using EMS App :)");
		}
		*/
		
		Employee employee = new Employee(0, "Leo Lee", "leo.lee@example.com", 48972);
		
		DBHelper db = new DBHelper();
		db.createConnection();
		//db.insertEmployee(employee);
		//db.updateEmployee(employee);
		//db.deleteEmployee(6);
		
		/*ArrayList<Employee> employees = db.fetchEmployees();
		
		for(Employee e : employees) {
			System.out.println(e);
		}
		*/
		
		//db.executeProcedure(employee);
		
		db.executeBatch();
		
		db.closeConnection();
		
	}

}
