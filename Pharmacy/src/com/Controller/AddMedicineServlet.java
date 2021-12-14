package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BlManager;
import com.pojo.Stock;

/**
 * Servlet implementation class AddMedicineServlet
 */
@WebServlet("/AddMedicineServlet")
public class AddMedicineServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	BlManager bl = new BlManager();
	Stock s = new Stock();
    
    public AddMedicineServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String mcompany = request.getParameter("mcompany");
		String mname = request.getParameter("mname");
		String mdescription = request.getParameter("mdescription");
		
		String quantity1 = request.getParameter("quantity");
		int quantity = Integer.parseInt(quantity1);
		
		String price1 = request.getParameter("price");
		double price = Double.valueOf(price1);
		
		String mdate = request.getParameter("mdate");
		String edate = request.getParameter("edate");
		
		
		s.setMcompany(mcompany);
		s.setMname(mname);
		s.setMdescription(mdescription);
		s.setQuantity(quantity);
		s.setPrice(price);
		s.setMdate(mdate);
		s.setEdate(edate);
		
		bl.saveMedicines(s);
		
		pw.println("<script type = \"text/javascript\">");
		pw.println("alert('Medicines Added Succefully');");
		pw.println("location='addmedicine.jsp';");
		pw.println("</script>");
		
	}

}
