package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;

public class ServletDemo implements Servlet {
	ServletConfig conf;
	
	//lifeCycle method
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		this.conf = conf;
		System.out.println("creating a object");
	}
	
	@Override
	public void destroy() {
		System.out.println("Going to destroy servlet object");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Servicing");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>This is my first servlet using servlet interface</h1>");
	}
	
	//non-lif-cycle method
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return conf;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "This is the first servlet created by Hiren Solanki";
	}
}
