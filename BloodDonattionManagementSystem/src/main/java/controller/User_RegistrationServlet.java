package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class User_RegistrationServlet
 */
@WebServlet(urlPatterns = "/User_RegistrationServlet")
public class User_RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public User_RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//PrintWriter out=response.getWriter();
		// out.print("Hii");
		 
		
		  String email = request.getParameter("email");
		  String password = request.getParameter("password");
		  String name = request.getParameter("name");
		  int contact = Integer.parseInt(request.getParameter("contact"));
		  String address = request.getParameter("address");
		  int pin = Integer.parseInt(request.getParameter("pin"));
		  String city = request.getParameter("city");
		  String state = request.getParameter("state");
		  String bloodGroup = request.getParameter("bloodGroup");
		  int status = Integer.parseInt(request.getParameter("status"));
		 
		  
		    PrintWriter out=response.getWriter();
		    
		    out.println(email+" "+name+" "+address);
		    
		  
		 
	}

}
