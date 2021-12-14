package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BlManager;
import com.pojo.Supplier;


@WebServlet("/AddSupplierController")
public class AddSupplierController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       BlManager bl = new BlManager();
       Supplier su = new Supplier();

    public AddSupplierController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String sname = request.getParameter("sname");
		String smobile = request.getParameter("smobile");
		String semail = request.getParameter("semail");
		String saddress = request.getParameter("saddress");
		
		su.setSname(sname);
		su.setSmobile(smobile);
		su.setSemail(semail);
		su.setSaddress(saddress);
		
		bl.saveSupplier(su);
		
		pw.println("<script type = \"text/javascript\">");
		pw.println("alert('Supplier Added Successfuly');");
		pw.println("location='addsupplier.jsp';");
		pw.println("</script>");
		
	}

}
