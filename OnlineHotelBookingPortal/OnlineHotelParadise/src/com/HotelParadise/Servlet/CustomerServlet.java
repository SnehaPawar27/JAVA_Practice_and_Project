package com.HotelParadise.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.HotelParadise.Dao.CustomerDaoImpl;
import com.HotelParadise.Dao.HotelDaoImpl;
import com.HotelParadise.Pojo.Customer;
import com.HotelParadise.Pojo.Hotel;

/**
 * Servlet implementation class CustomerServlet
 */
@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		Customer cust=new Customer();
		CustomerDaoImpl cdao=new CustomerDaoImpl();
		boolean result;
		RequestDispatcher rd;
		String op=request.getParameter("operation");
		if(op!=null && op.equals("delete"))
		{
			int id=Integer.parseInt(request.getParameter("custId"));
			result=cdao.deleteCustomer(id);
			if (result)
			{
			response.sendRedirect("success.html");
			}	
		else 
			{
			response.sendRedirect("fail.html");
			}
		}
		else if(op!=null && op.equals("edit"))
		{
			//int id=Integer.parseInt(request.getParameter("custId"));
			 String email=(String)session.getAttribute("username");
			cust=cdao.getCustByEmail(email);
			//System.out.println(cust);
			session.setAttribute("custObj",cust);
			rd=request.getRequestDispatcher("UpdateProfile.jsp");
			rd.forward(request, response);
		}
		else
		{
			List<Customer> clist=cdao.ListOfCustomer();
			session.setAttribute("cList", clist);
			rd=request.getRequestDispatcher("custList.jsp");
			rd.forward(request, response);
			}
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Customer cust=new Customer();
		CustomerDaoImpl cdao=new CustomerDaoImpl();
		boolean result;
		String op=request.getParameter("operation");
		String cname=request.getParameter("customername");
		String addre=request.getParameter("customeraddress");
		String number=request.getParameter("customercontactno");
		String email=request.getParameter("customeremailid");
		String pass=request.getParameter("customerpassword");
		
		if (op != null && op.equals("addCust")) 
		{
			cust = new Customer(cname, number, email, pass, addre);
			result = cdao.addCustomer(cust);
			if (result)
				{
				response.sendRedirect("success.html");
				}	
			else 
				{
				response.sendRedirect("fail.html");
				}
		} 
		else if (op != null && op.equals("updateCust")) 
		{
			int id = Integer.parseInt(request.getParameter("customerId"));
			cust =new Customer(cname, number, email, pass, addre);
			cust.setCustId(id);
			result = cdao.updateCustomer(cust);
			if (result) 
				{
				response.sendRedirect("success.html");
				} 
			else 
				{
				response.sendRedirect("fail.html");
				}
		}
	}
}


