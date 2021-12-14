package com.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BlManager;
import com.pojo.Supplier;

/**
 * Servlet implementation class DeleteSupplierController
 */
@WebServlet("/DeleteSupplierController")
public class DeleteSupplierController extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	BlManager bl = new BlManager();
	Supplier su = new Supplier();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteSupplierController() {
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
		
		bl.deleteSupplier(su);
		
		response.sendRedirect("viewallsupplier.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
