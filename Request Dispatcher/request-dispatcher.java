import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  

public class Login extends HttpServlet {

	public void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWrite out = response.getWriter();
		
		String name = request.getParameter("Username");
		String pass = request.getParameter("pw");
		
		if(pass.equals("servlet") {
			RequestDispatcher rd = request.getRequestDispatcher("second-servlet");
			rd.forward(request,response);
		} else {
			out.println("Sorry your username or password is incorrect");
			RequestDispatcher rd = request.getRequestDispatcher("/request-dispatcher.html");
			rd.include(request,response);
		}
	}
}