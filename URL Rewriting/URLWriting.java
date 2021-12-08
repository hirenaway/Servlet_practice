package com.forprac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*Servlet implementation class URLWriting */
@WebServlet(name = "URL", urlPatterns = { "/URL" })
public class URLWriting extends HttpServlet {
	/*@see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)*/
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			PrintWriter out= response.getWriter();
			
			String n = request.getParameter("name");
			out.print("Welcome "+ n);
			out.print("<a href='URLSecond?name="+n+"'>visit</a>");
			
			out.close();
		}catch (Exception e) {
			System.out.print(e);
		}
	}
}