import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  

public class Welcome extends HttpServlet {

	public void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWrite out = response.getWriter();
	
		String name = request.getParameter("Username");
		out.print("Welcome"+name);
	}
}