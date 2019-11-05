package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Users;
import service.UsersDao;

/**
 * Servlet implementation class UserReg
 */
public class UserReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserReg() {
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
		String userid=request.getParameter("empid");
		String name=request.getParameter("ename");
		String password=request.getParameter("pwd");
		String contactno=request.getParameter("phone1");
		String emailid=request.getParameter("email");
		String gender=request.getParameter("gender");
		
		Users users=new Users(userid, name, password, contactno, emailid, gender);
		boolean flag=new UsersDao().registerUser(users);
		if(flag){
			response.sendRedirect("Login.html");
	}
		else{
			response.sendRedirect("UserReg.html");
		}
	}

	}


