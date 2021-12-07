import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
  
public class FirstServlet extends HttpServlet {  
  
  public void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			String name = request.getParameter("Username");
			out.print("welcome"+name);

			Cookie ck = new Cookie("Username",name); // creating cookie object
			response.addCookie(ck); // adding cookie in the response	

			//creating submit button
			out.println("<form action='servlet2'>");	
			out.println("<input type='submit' value='go'>");
			out.println("</form>);	

			out.close();
		} catch(Exception e) {
			System.out.println(e);
		}

	}
}