package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BlManager;
import com.pojo.Cart;
import com.pojo.Customer;
import com.pojo.Stock;

/**
 * Servlet implementation class AddToCartController
 */
@WebServlet("/AddToCartController")
public class AddToCartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	BlManager bl = new BlManager();
	Cart c = new Cart();
	Stock s = new Stock();
	Customer cu = new Customer();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddToCartController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String cname = request.getParameter("cname");
		String mname = request.getParameter("mname");
		
		
		String price1 = request.getParameter("price");
		double price = Double.valueOf(price1);
		
		String quantity1 = request.getParameter("quantity");
		int quantity = Integer.parseInt(quantity1);
		
		cu = bl.searchByCustomerName(cname);
		s = bl.searchbyStockName(mname);
		
		int total = (int) (price * quantity);
		
		c.setCustomer(cu);
		c.setSeletedmedicine(mname);
		c.setPrice(price);
		c.setSelectedquantity(quantity);
		c.setTotal(total);
		c.setCusname(cname);
		
		int q1 = s.getQuantity();
		
		if(quantity < q1)
		{
			bl.saveCart(c);
			int q2 = q1 - quantity;
			s.setQuantity(q2);
			bl.updateStock(s);
			
			pw.println("<script type = \"text/javascript\">");
			pw.println("alert('Medicine Added to the cart');");
			pw.println("location='sellmedicine.jsp';");
			pw.println("</script>");
		}
		else
		{
			pw.println("<script type=\"text/javascript\">");
			pw.println("alert('Stock is not available...');");
			pw.println("location='sellmedicine.jsp';");
			pw.println("</script>");
		}
	}

}
