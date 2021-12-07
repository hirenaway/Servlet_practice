import javax.servlet.http.*;  
import javax.servlet.*;  
import java.io.*;  

public class DemoSev extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        String name = req.getParameter("name"); // will return a value 
        out.println("welcome"+ name);
        out.close();
    } 
}