package com.servletError;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class SimpleMath extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Math</title></head><body>");

		double n = Double.parseDouble(request.getParameter("val1"));
		double n2 = Double.parseDouble(request.getParameter("val2"));
		double result =0;
		String opr=request.getParameter("operator");
		if(opr.equals("+")) result=n+n2;
		if(opr.equals("-")) result=n-n2; 
		if(opr.equals("*")) result=n*n2; 
		if(opr.equals("/")) result=n/n2; 

		out.println("<h1> Result = "+result); 
		out.println("</body></html>");
	}
}