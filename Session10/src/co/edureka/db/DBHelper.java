package co.edureka.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import co.edureka.model.Employee;

/*
 	-------------------------------------------
 	JDBC[Java DataBase Connectivity] Procedure:
 	-------------------------------------------
 	1. Load the Driver
 	   1.1 Download the Driver from DB vendors Web Page 
 	   	   [https://dev.mysql.com/downloads/connector/j/]
 	   1.2 Configure the Driver i.e. jar file in your project
 	   	   Rt Click on Project > Build Path > Configure Build Path > Libraries > Add External Jars
 	   1.3 Use Class.forName API to load the Driver
 	   
 	2. Create Connection to DataBase
 	   2.1 Username, password and URL to DB
 	   2.2 Use Connection and DriverManager API to establish Connection
 	   
 	3. Write SQL Statement
 	   3.1 Write SQL Statement in String
 	   3.2 Use Statement or PreparedStatment API to represent SQL
 	
 	4. Execute SQL Statement
 	   4.1 Execute executeUpdate or executeQuery Method on Statement or PreparedStatment API
 	
 	5. Close the Connection
 	   5.1 Execute close method on Connection API
 */

// class to access database
public class DBHelper {
	
	Connection con;
	
	Statement stmt;
	PreparedStatement pStmt;
	
	CallableStatement cStmt;

	// 1. Load the Driver 
	public DBHelper() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(">> 1. Driver Loaded");
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	// 2. Create Connection to DataBase
	public void createConnection() {
		try {
			String user = "root";
			String password = "";
			String url = "jdbc:mysql://localhost/edureka";
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println(">> 2. Connection Created");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		} 
	}
	
	// 3. Write SQL Statement + 4. Execute SQL Statement
	public void insertEmployee(Employee employee) {
		try {
			// SQL Statement with substitution of data from Employee Object
			/*String sql = "insert into Employee values(null, '"+employee.name+"', '"+employee.email+"', "+employee.salary+")";
			
			stmt = con.createStatement();
			int i = stmt.executeUpdate(sql);		// executeUpdate -> will perform insert, update and delete queries :)
			*/
			
			String sql = "insert into Employee values(null, ?, ?, ?)";
			
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, employee.name);
			pStmt.setString(2, employee.email);
			pStmt.setInt(3, employee.salary);
			
			int i = pStmt.executeUpdate();
			
			if(i>0) {
				System.out.println(">> 3. + 4. "+employee.name+" Saved i["+i+"] :)");
			}else {
				System.out.println(">> 3. + 4. Error While Saving "+employee.name);
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	public void updateEmployee(Employee employee) {
		
		try {
			
			String sql = "update Employee set name = ?, email = ?, salary = ? where eid = ?";
			
			pStmt = con.prepareStatement(sql);
			
			pStmt.setString(1, employee.name);
			pStmt.setString(2, employee.email);
			pStmt.setInt(3, employee.salary);
			pStmt.setInt(4, employee.eid);
			
			int i = pStmt.executeUpdate();
			
			if(i>0) {
				System.out.println(">> 3. + 4. "+employee.name+" Updated i["+i+"] :)");
			}else {
				System.out.println(">> 3. + 4. Error While Updating "+employee.name);
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
			e.printStackTrace();
		}
	}
	
	public void deleteEmployee(int eid) {
		
		try {
			
			String sql = "delete from Employee where eid = ?";
			
			pStmt = con.prepareStatement(sql);
	
			pStmt.setInt(1, eid);
			
			int i = pStmt.executeUpdate();
			
			if(i>0) {
				System.out.println(">> 3. + 4. "+eid+" Deleted i["+i+"] :)");
			}else {
				System.out.println(">> 3. + 4. Error While Deleting "+eid);
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
			e.printStackTrace();
		}
	}
	
	public ArrayList<Employee> fetchEmployees() {
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		try {
			
			String sql = "select * from Employee";
			
			pStmt = con.prepareStatement(sql);
			ResultSet rs = pStmt.executeQuery();
			
			// ResultSet will have data of table.
			// We will iterate row by row
			while(rs.next()) {
				
				Employee emp = new Employee();
				
				emp.eid = rs.getInt(1);
				emp.name = rs.getString(2);
				emp.email = rs.getString(3);
				emp.salary = rs.getInt(4);
				
				employees.add(emp);
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
		
		
		return employees;
	}
	
	public void executeProcedure(Employee employee) {
		try {
			
			String sql = "{call addEmployee(?, ?, ?)}";
			
			cStmt = con.prepareCall(sql);
			cStmt.setString(1, employee.name);
			cStmt.setString(2, employee.email);
			cStmt.setInt(3, employee.salary);
					
			cStmt.execute();
			
			System.out.println(">> PROCEDURE Executed");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	public void executeBatch() {
		try {
			
			String sql1 = "insert into Employee values(null, 'Jim', 'jim@example.com', 45000)";
			String sql2 = "delete from Employee where empId = 2";	// empId will give error :(
			
			stmt = con.createStatement();
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			
			con.setAutoCommit(false); 	// We as developers will manage Transaction
			
			stmt.executeBatch();
			con.commit();				// Execute Batch as a Transaction
			
			System.out.println(">> BATCH EXECUTED");
			
			
		} catch (Exception e) {
			
			System.out.println(">> Some Exception: "+e);
			
			try {
				System.out.println(">> ROLLING BACK CHANGES");
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		}
	}
	
	// 5. Close the Connection
	public void closeConnection() {
		try {
			con.close();
			System.out.println(">> 5. Connection Closed");
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
}
