import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
public class Redirect extends HttpServlet {
  
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException {
	res.setContentType("text/hmtl");
	PrintWriter out = res.getWriter() 
	
	response.sendRedirect("http://www.google.com"); 
	out.close();
	}
}