package co.edureka.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import co.edureka.model.User;

public class DBHelper {

	Connection con;
	PreparedStatement pStmt;
	

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
	public int registerUser(User user) {
		
		int i = 0;
		
		try {
			
			String sql = "insert into User values(null, ?, ?, ?)";
			
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, user.name);
			pStmt.setString(2, user.email);
			pStmt.setString(3, user.password);
			
			i = pStmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
		
		return i;
	}
	
	public boolean loginUser(User user) {
		
		boolean login = false;
		
		try {
			
			String sql = "select * from User where email = ? and password = ?";
			
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, user.email);
			pStmt.setString(2, user.password);
			
			ResultSet rs = pStmt.executeQuery();
			
			login = rs.next();
			
			user.name = rs.getString(2);
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
		
		return login;
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
