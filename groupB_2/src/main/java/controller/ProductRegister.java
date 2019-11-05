package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Product;
import service.ProductsDao;

/**
 * Servlet implementation class ProductRegister
 */
public class ProductRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String pid=request.getParameter("pid");
		String pname=request.getParameter("pname");
		String unitprice=request.getParameter("unitprice");
		String stock=request.getParameter("stock");
		String category=request.getParameter("category");
		
		Product product=new Product(pid, pname, unitprice, stock, category);
		boolean flag= new ProductsDao().registerProduct(product);
		if(flag){
			RequestDispatcher rd=request.getRequestDispatcher("UserHome.jsp");
			request.setAttribute("msg","ur product is added");
			rd.forward(request, response);
			
	}
		else{
			
			RequestDispatcher rd=request.getRequestDispatcher("UserHome.jsp");
			request.setAttribute("msg","ur product is not added.........sorry");
			rd.forward(request, response);
			
		}
		
		
	}
		
	}


