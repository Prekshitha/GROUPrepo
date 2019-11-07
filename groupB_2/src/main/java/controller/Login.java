package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Users;
import service.UsersDao;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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
		String empid=request.getParameter("empid");
		String pwd=request.getParameter("pwd");
	
		Users users=new Users();
		users.setUserid(empid);
		users.setPassword(pwd);
		
		boolean flag=new UsersDao().checkLogin(users);
		if(flag){
			HttpSession session=request.getSession();
			session.setAttribute("empid", empid);
			System.out.println(empid);
			response.sendRedirect("UserHome.jsp");
			
		}
		else{
			response.sendRedirect("Login.html");
		}
		
		
	}

	}


