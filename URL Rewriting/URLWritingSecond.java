package com.forprac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*Servlet implementation class URLWritingSecond*/
@WebServlet(name = "URLSecond", urlPatterns = { "/URLSecond" })
public class URLWritingSecond extends HttpServlet {
	/*@see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)*/
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			String n = request.getParameter("name");
			out.print("Hello "+n);
			
			out.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}