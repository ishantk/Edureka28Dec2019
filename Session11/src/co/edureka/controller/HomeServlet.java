package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/HomeServlet", "/Home" })
public class HomeServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		// Read Cookies from Client's Machine in Browser
		// We will be able to read all the cookies together :)
		Cookie[] cookies = request.getCookies(); 
		
		StringBuffer cookieData = new StringBuffer();
		
		for(Cookie cookie : cookies) {
			cookieData.append(cookie.getName()+" | "+cookie.getValue()+"<br/>");
		}
		
		// Dynamic Web Page as Response :)
		String htmlResponse="<html>"
				+ "<body>"
				+ "<center>"
				+ "<br/><h4>Response from HomeServlet:</h4>"
				+ "Welcome to Home !!<br/>"
				+ cookieData.toString()
				+ "</cenetr>"
				+ "</body>"
				+ "</html>";
		
		// HttpServletResponse is response Object in Servlet to send back response to client
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print(htmlResponse);	// Sent Back to the Client as Response
		
		
	}

}
