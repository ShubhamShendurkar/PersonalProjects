package com.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BlManager;
import com.pojo.Stock;

/**
 * Servlet implementation class DeleteStockController
 */
@WebServlet("/DeleteStockController")
public class DeleteStockController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	BlManager bl = new BlManager();
	Stock s = new Stock();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteStockController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String id1 = request.getParameter("sid");
		int sid = Integer.parseInt(id1);
		
		s=bl.searchbyId(sid);
		bl.deleteStock(s);
		
		response.sendRedirect("viewallmedicines.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
