package com.httpServletExample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class HttpServletDemoClass extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		System.out.println("This is a get method");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1> this is my get method in http servlet</h1>");	
	}
}