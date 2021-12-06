package com.protocol;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.*;

public class Data extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("uname");
		String age = req.getParameter("uage");
		out.println("name is "+name);
		out.println("age is "+age);
		out.close();
	}
}