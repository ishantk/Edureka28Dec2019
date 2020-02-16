package co.edureka.ws;

import java.util.Date;

// Web Service
public class AppService {

	// Web Methods
	// Must be public and must return something :)
	public String registerUser(String name, String email, String password) {
		Date date = new Date();
		// JDBC Code to save User in DataBase
		
		String response = name+" registered with us on "+date;
		return response;
	}
	
	public double dollarToINR(double dollar) {
		double inr = dollar * 70;
		return inr;
	}

	public int feetToInches(int feet) {
		int inches = feet * 12;
		return inches;
	}
	
}
