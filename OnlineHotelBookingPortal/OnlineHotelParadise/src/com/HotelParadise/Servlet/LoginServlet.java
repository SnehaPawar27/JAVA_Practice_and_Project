package com.HotelParadise.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.HotelParadise.Dao.LoginDaoImpl;

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
		HttpSession session=request.getSession();
		session.invalidate();
		response.sendRedirect("Home.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		LoginDaoImpl dao=new LoginDaoImpl();
		PrintWriter out=response.getWriter();
		
		String operation=request.getParameter("operation");
		String type=request.getParameter("type");
		boolean result;
		String email=request.getParameter("emailid");
		String pass=request.getParameter("password");
		
		if(operation!=null && operation.equals("Login"))
		{
			if(type.equals("Customer"))
			{
				result=dao.userLogin(email, pass);
				if(result)
				{
					session.setAttribute("username", email);
					request.setAttribute("status","<b style=color:red> You have Successfully Logged in!! </b>");
					RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
					rd.forward(request,response);
				}
				else
				{
					out.println("<b style=color:red;> You have entered wrong creditials!!!</b>");
					RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
					rd.include(request,response);
				}
			}
			else
			{
				result=dao.adminLogin(email,pass);
				if(result)
				{
					session.setAttribute("admin",email);
					request.setAttribute("status","<b style=color:red> You have Successfully Logged in!! </b>");
					RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
					rd.forward(request,response);
				}
				else
				{
					out.println("<b style=color:red;> You have entered wrong creditials!!!</b>");
					RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
					rd.include(request,response);
				}
			}
		}
		else if(operation!=null && operation.equals("ChangePass"))
		{
			String newPass=request.getParameter("newpass");
			result=dao.adminLogin(email,pass);
			if(result)
			{
				result=dao.adminChangePass(email,newPass);
				if(result)
				{
					session.invalidate();
					request.setAttribute("status","SuccessFully changed"
					             + "Password. Please Login again!!");
					RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
					rd.forward(request,response);
				}
				else
				{
					request.setAttribute("status","Failed to set"
							+"Passwor.. Try again!!");
					RequestDispatcher rd=request.getRequestDispatcher("ChangePass.jsp");
					rd.forward(request,response);
				}
			}
			else
			{
				request.setAttribute("status","You entered wrong password");
				RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
				rd.forward(request,response);
			}
		}
		
		
	}
				
}


