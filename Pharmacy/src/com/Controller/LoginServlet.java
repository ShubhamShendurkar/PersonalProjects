package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String email = request.getParameter("username");
		String pass = request.getParameter("password");
		
		if(email.equals("shubham.shendurkar@gmail.com")&& pass.equals("pass"))
		{
			
			RequestDispatcher rd = request.getRequestDispatcher("PharmacyDashboard.jsp");
			rd.forward(request, response);
			
			
			
//			pw.println("<script type = \"text/javascript\">");
//			pw.println("alert('Welcome to Dashboard')");
//			pw.println("location='PharmacyDashboard.jsp';");
//			pw.println("</script>");
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("Adminlogin.html");
			rd.include(request, response);
			
//			pw.println("<script type = \"text/javascript\">");
//			pw.println("alert('Invalid Credential')");
//			pw.println("location='Adminlogin.html';");
//			pw.println("</script>");
		}
	}

}
