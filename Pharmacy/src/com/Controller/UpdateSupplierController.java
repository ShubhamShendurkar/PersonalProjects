package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BlManager;
import com.pojo.Supplier;

/* servlet implementation class UpdateSupplierController
 */
@WebServlet("/UpdateSupplierController")
public class UpdateSupplierController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    BlManager bl = new BlManager();
    Supplier su = new Supplier();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateSupplierController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id1 = request.getParameter("id");
		int id = Integer.parseInt(id1);
		
		su = bl.searchBySupplierId(id);
		
		HttpSession session = request.getSession();
		session.setAttribute("list", su);
		
		response.sendRedirect("updatesupplier.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
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
		
		bl.updateSupplier(su);
		
		pw.println("<script type = \"text/javascript\">");
		pw.println("alert('Supplier Updated');");
		pw.println("location='viewallsupplier.jsp';");
		pw.println("</script>");
	}

}
