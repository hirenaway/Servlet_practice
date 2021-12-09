package com.forprac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class AuthFilter
 */
@WebFilter(filterName = "Auth", urlPatterns = { "/Auth" })
public class AuthFilter implements Filter {
	
	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}
	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		
		String pass = request.getParameter("pass");
		String Uname = request.getParameter("username");
		if (pass.equals("Admin") && Uname.equals("Admin")) {
			chain.doFilter(request, response);
		} else {
			out.print("Wrong password or usrername, Please try again");
			RequestDispatcher rd = request.getRequestDispatcher("Auth.html");
			rd.include(request, response);
		}
	}
	public void destroy() {
		// TODO Auto-generated method stub
	}
}