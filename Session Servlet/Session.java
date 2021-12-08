package com.forprac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Session
 */
@WebServlet(name = "SessionServlet", urlPatterns = { "/SessionServlet" })
public class Session extends HttpServlet {
	/* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("Username");
		String pass = request.getParameter("Password");
		
		if (username == null || username.equals("") || pass == null || pass == ("")) {
			out.print("Please enter your Username and Password");
			RequestDispatcher rd = request.getRequestDispatcher("Login.html");
			rd.include(request, response);
		} else if (username.equals("Hiren") && pass.equals("123")) {
			HttpSession se = request.getSession();
			se.setAttribute("username", username);
			se.setAttribute("password", pass);
			out.println("You have logged in successfully </br>");
			out.println("click below link to see the value of your username and password </br>");
			out.println("<a href='DisplaySessionServlet'>" +"Click here</a>");
		} else {
			out.print("Wrong username or password<br></br>");
			RequestDispatcher rd = request.getRequestDispatcher("Login.html");
			rd.include(request, response);
		}
	out.close();
	}
}
