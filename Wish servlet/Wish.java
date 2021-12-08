package com.forprac;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "WishApp", urlPatterns = { "/WishApp" })
public class Wish extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		Calendar cl = Calendar.getInstance();
		int hour = cl.get(Calendar.HOUR_OF_DAY);
		if (hour<12) {
			out.print("Good Morning");
		} else if (hour < 16) {
			out.println("Good Afternoon");
		} else if (hour < 20) {
			out.print("Good Evening");
		} else {
			out.print("Good night");
		}
		out.close();
	}
}