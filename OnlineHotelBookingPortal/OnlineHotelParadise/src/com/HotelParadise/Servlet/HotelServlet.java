package com.HotelParadise.Servlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.HotelParadise.Dao.HotelDaoImpl;
import com.HotelParadise.Pojo.Hotel;

/**
 * Servlet implementation class HotelServlet
 */
@WebServlet("/HotelServlet")
@MultipartConfig(maxFileSize=16777215)
public class HotelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HotelServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		HotelDaoImpl hdao=new HotelDaoImpl();
		String op=request.getParameter("operation");
		//System.out.println(op);
		if(op!=null && op.equals("delete"))
		{
			int hId=Integer.parseInt(request.getParameter("hotelId"));
			boolean result=hdao.deleteHotel(hId);
			if(result)
			{
				//response.sendRedirect("success.html");
				request.setAttribute("status", "<b style='color:red;'>Hotel deleted SuccessFully!!");
				List<Hotel> hlist=hdao.displayHotels();
				session.setAttribute("hList", hlist);
				RequestDispatcher rd=request.getRequestDispatcher("HotelList.jsp");
				rd.forward(request, response);
			}
			else
			{
				//response.sendRedirect("fail.html");
				request.setAttribute("status", "<b style='color:red;'>Hotel not deleted!!");
				List<Hotel> hlist=hdao.displayHotels();
				session.setAttribute("hList", hlist);
				RequestDispatcher rd=request.getRequestDispatcher("HotelList.jsp");
				rd.forward(request, response);
			}
					
		}
		else if(op!=null && op.equals("edit"))
		{
			int hId=Integer.parseInt(request.getParameter("hotelId"));
			Hotel hotelObj=hdao.getHotelById(hId);
			System.out.println(hotelObj);
			session.setAttribute("hotelObj",hotelObj);
			RequestDispatcher rd=request.getRequestDispatcher("UpdateHotel.jsp");
			rd.forward(request, response);
			
		}
		else if(op!=null && op.equals("showHotels"))
		{
		List<Hotel> hlist=hdao.displayHotels();
		session.setAttribute("hList", hlist);
		RequestDispatcher rd=request.getRequestDispatcher("HotelList.jsp");
		rd.forward(request, response);
		}
		else if(op!=null && op.equals("getHotelByType"))
		{
			String type=request.getParameter("type");
			List<Hotel> hList=hdao.getHotelByType(type);
			session.setAttribute("typeHotel", hList);
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
		else
		{
			List<Hotel> hlist=hdao.displayCategory();
			session.setAttribute("typeList", hlist);
			response.sendRedirect("index.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Hotel h=new Hotel();
		HttpSession session=request.getSession();
		HotelDaoImpl hdao=new HotelDaoImpl();
		boolean result;
		String op=request.getParameter("operation");
		String hname=request.getParameter("hotelname");
		double price=Double.parseDouble(request.getParameter("hotelprice"));
		String type=request.getParameter("hoteltype");
		String loc=request.getParameter("hotellocation");
		Part image=request.getPart("hotelimage");
		String desc=request.getParameter("hoteldescription");
		
		InputStream is=image.getInputStream();
		
		if(op!=null && op.equals("AddHotel"))
		{
		h=new Hotel(hname,loc,type,desc,is,price);
		result=hdao.addHotel(h);
		if(result)
		{
			//response.sendRedirect("success.html");
			request.setAttribute("status", "<b style='color:red;'>Hotel Added SuccessFully!!");
			List<Hotel> hlist=hdao.displayHotels();
			session.setAttribute("hList", hlist);
			RequestDispatcher rd=request.getRequestDispatcher("HotelList.jsp");
			rd.forward(request, response);
		}
		else
		{
			request.setAttribute("status", "<b style='color:red'>Hotel Not Added!!</b>");
			List<Hotel> hlist=hdao.displayHotels();
			session.setAttribute("hList", hlist);
			RequestDispatcher rd=request.getRequestDispatcher("HotelList.jsp");
			rd.forward(request, response);
			
		}
		}
		else if(op!=null && op.equals("UpdateHotel"))
		{
			int id=Integer.parseInt(request.getParameter("hotelid"));
			h=new Hotel(hname,loc,type,desc,is,price);
			h.setHotelId(id);
			result=hdao.updateHotel(h);
			if(result)
			{
				//response.sendRedirect("success.html"); 
				request.setAttribute("status", "<b style='color:red'>Hotel Updated Successfully!!</b>");
				List<Hotel> hlist=hdao.displayHotels();
				session.setAttribute("hList", hlist);
				RequestDispatcher rd=request.getRequestDispatcher("HotelList.jsp");
				rd.forward(request, response);
				
			}
			else
			{
				request.setAttribute("status", "<b style='color:red'>Hotel Not Updated!!</b>");
				List<Hotel> hlist=hdao.displayHotels();
				session.setAttribute("hList", hlist);
				RequestDispatcher rd=request.getRequestDispatcher("HotelList.jsp");
				rd.forward(request, response); 
			}
		}
	}

}
