import java.io.IOException;  
import java.io.PrintWriter;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;


@WebServlet(name = "LoginServlet", urlPatterns = { "/LoginServlet" }
public class Login extends HttpServlet { 
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {  
	response.setContentType("text/html");  
		PrintWriter out=response.getWriter(); 
	
	request.getRequestDispatcher("Links.html").include(request,response);
		
	String name=request.getParameter("name");  
		String password=request.getParameter("password");

		if (password.equals("Admin")) {
			out.print("You have successfully logged in");
			out.print("<b> Welcome,"+name);

			Cookie ck = new Cookie("name",name);
			response.addCookie(ck);
		} else {
			out.print("sorry, wrong username or username");
			request.getRequestDispatcher("Login.html");
			request.include(request, response);
		}
		out.close();
	}	
}