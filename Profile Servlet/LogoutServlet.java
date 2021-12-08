import java.io.IOException;  
import java.io.PrintWriter;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;

@WebServlet(name = "LogOutServlet", urlPatterns = { "/LogOutServlet" }
public class Logout extends HttpServlet {
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {  
	response.setContentType("text/html");  
		PrintWriter out=response.getWriter();
	
	request.getRequestDispacher("Links.html").include(response, request);
	
	Cookie ck = new Cookie("name","");
	ck.setMaxAge(0);
	response.addCookie(ck);

	out.print("You have been successfully Logged out");
	}
}