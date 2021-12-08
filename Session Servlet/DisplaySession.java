package com.forprac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DisplaySession
 */
@WebServlet(name = "DisplaySessionServlet", urlPatterns = { "/DisplaySessionServlet" })
public class DisplaySession extends HttpServlet {
	/*@see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)*/
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession se = request.getSession(true);
		String username = (String)se.getAttribute("username");
		String pass = (String)se.getAttribute("password");
		
		out.print("Username "+ username + "<br></br>");
		out.print("Password " + pass);		
		out.close();	
	}
}