

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Verify
 */
@WebServlet("/Verify")
public class Verify extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Verify() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	response.setContentType("text/html"); 

       PrintWriter out=response.getWriter();
       
       String a=request.getParameter("Username");
       String b=request.getParameter("Password");
       
       if(a.equals("princy") && b.equals("123")) {
    	   RequestDispatcher rd =request.getRequestDispatcher("Admin");
    	   rd.forward(request, response);
    	   
       }else if(a.equals("test") && b.equals("321")){
    	   RequestDispatcher rd =request.getRequestDispatcher("Home");
    	   rd.forward(request, response);
    	   
       }else {
    	   out.print("Username or password are wrong");
    	   RequestDispatcher rd =request.getRequestDispatcher("Rd.html");
    	   rd.include(request, response);
       }
       
//       out.println(a+b);
       
	}
	

}
