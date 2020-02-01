package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/FrontController", "/Front" })
public class FrontController extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String type = request.getParameter("txtType");
		
		// Dynamic Web Page as Response :)
		String htmlResponse="<html>"
				+ "<body>"
				+ "<center>"
				+ "<br/><h4>Response from FrontController</h4>"
				+ "</cenetr>"
				+ "</body>"
				+ "</html>";
		
		// HttpServletResponse is response Object in Servlet to send back response to client
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print(htmlResponse);	// Sent Back to the Client as Response
		
		/*if(type.equals("login")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("Login"); // Login -> URL Mapping for LoginServlet
			
		}else { // register
			RequestDispatcher dispatcher = request.getRequestDispatcher("Register"); // Register -> URL Mapping for LoginServlet
		}*/
		
		// From FrontController we will forward both request and response to the next Servlet with url mapping :)
		RequestDispatcher dispatcher = request.getRequestDispatcher(type);
		dispatcher.forward(request, response); 
		// Since we have forwarded request/response to other Servlet, response from FrontController Servlet will not be shared to the client
		
		//dispatcher.include(request, response);
		// Since we have included request/response to other Servlet, response from FrontController Servlet will be shared to the client alongwith other Servlet's response
	}

}
