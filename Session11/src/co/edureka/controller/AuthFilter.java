package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class AuthFilter
 */
@WebFilter("/AuthFilter")
public class AuthFilter implements Filter {


	public void destroy() {
		System.out.println("[AuthFilter] destroy executed");	
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("[AuthFilter] doFilter executed [BEFORE]");
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		out.print("<h4>[AuthFilter] doFilter executed [BEFORE]</h4>");
		// PRE-PROCESSING
		
		if(!email.isEmpty() && !password.isEmpty()) {
			chain.doFilter(request, response);	// Forward Request to Corresponding Servlet
		}else {
			out.print("<h4>[AuthFilter] Authentication Failed - No Inputs</h4>");
		}
	
		// POST-PROCESSING
		out.print("<h4>[AuthFilter] doFilter executed [AFTER]</h4>");
		
		
		System.out.println("[AuthFilter] doFilter executed [AFTER]");	
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("[AuthFilter] init executed");
	}

}
