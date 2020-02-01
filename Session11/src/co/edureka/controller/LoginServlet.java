package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edureka.db.DBHelper;
import co.edureka.model.User;

@WebServlet({ "/LoginServlet", "/Login" })
public class LoginServlet extends HttpServlet {
	
	// doPost is just like service method
	// but will be executed iff request from the client is a POST request :)
	// service method is capable of handling any type of request either GET or POSt or PUT etc..
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println(">> [LoginServlet] - doPost");
		
		// HttpServletRequest is Request Object which will contain data from Client
		// 1. Extract Data from Request made by Client over HTTP
		User user = new User();
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		System.out.println(">> User Details from Client:");
		System.out.println(">> "+user);
		
		//2. Validate the User in DataBase
		DBHelper db = new DBHelper();
		db.createConnection();
		boolean login = db.loginUser(user);
		db.closeConnection();
		
		// 3. Send Back Response to Client
		// For Successful Registration or Failure
		String message = "";
		
		if(login) {
			Date date = new Date();
			message = "<h3>"+user.name+" Welcome to LMS !!</h3> ["+date+"]"
					+ "<br/><a href='Awesome'>Enter Home</a><br/>";
			
			// 1. Session Tracking - Cookies :)
			// Cookie is kind of HashMap i.e. Key value Pair
			Cookie cookie1 = new Cookie("keyName", user.name);
			Cookie cookie2 = new Cookie("keyEmail", user.email);
			
			// In Response Add Cookies Back to Client's Machine i.e. in Browser :) 
			response.addCookie(cookie1);
			response.addCookie(cookie2);
			
		}else {
			message = "Invalid Credentials. Please Enter Correct Details and Try Again !!";
			response.sendRedirect("https://google.co.in"); // Redirecting User to Some Other resource
		}
		
		// Dynamic Web Page as Response :)
		String htmlResponse="<html>"
				+ "<body>"
				+ "<center>"
				+ "<br/><h4>Response from LoginServlet:</h4>"
				+ message
				+ "</cenetr>"
				+ "</body>"
				+ "</html>";
		
		// HttpServletResponse is response Object in Servlet to send back response to client
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print(htmlResponse);	// Sent Back to the Client as Response
	}

}
