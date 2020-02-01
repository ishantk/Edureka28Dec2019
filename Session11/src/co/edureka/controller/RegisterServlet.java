package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edureka.db.DBHelper;
import co.edureka.model.User;


@WebServlet({ "/RegisterServlet", "/Register" }) // URL Mappings to be used by client to execute Servlet Program
public class RegisterServlet extends HttpServlet {

	// init is executed whenever RegisterServlet Object is created by Server(Apache Tomcat)
	public void init(ServletConfig config) throws ServletException {
		System.out.println(">> [RegisterServlet] - init");
	}

	// Whenever RegisterServlet Object is no longer required in the memory it will be deleted by Server(Apache Tomcat) and destroy is executed
	public void destroy() {
		System.out.println(">> [RegisterServlet] - destroy");
	}

	// Whenever Request comes from Client it is handled in service method
	// Further we share back response as well from the same service method :)
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">> [RegisterServlet] - service");
		
		// HttpServletRequest is Request Object which will contain data from Client
		// 1. Extract Data from Request made by Client over HTTP
		User user = new User();
		user.name = request.getParameter("txtName");
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		System.out.println(">> User Details from Client:");
		System.out.println(">> "+user);
		
		// 2. Save the data in DataBase :) i.e. Register User in DataBase :)
		DBHelper db = new DBHelper();
		db.createConnection();
		int i = db.registerUser(user);
		db.closeConnection();
		
		// 3. Send Back Response to Client
		// For Successful Registration or Failure
		String message = "";
		
		if(i>0) {
			message = "<h3>"+user.name+" Thank You for Registering with Us !!</h3>";
		}else {
			message = user.name+" Some Error !! Please Try Again Later !!";
		}
		
		// Dynamic Web Page as Response :)
		String htmlResponse="<html>"
				+ "<body>"
				+ "<center>"
				+ "<br/><h4>Response from RegisterServlet:</h4>"
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
