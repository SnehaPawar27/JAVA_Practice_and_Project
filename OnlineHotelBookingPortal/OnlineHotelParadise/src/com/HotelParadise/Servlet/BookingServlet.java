package com.HotelParadise.Servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.HotelParadise.Dao.BillDaoImpl;
import com.HotelParadise.Dao.HotelBookingDaoImpl;
import com.HotelParadise.Pojo.Bill;
import com.HotelParadise.Pojo.HotelBooking;

/**
 * Servlet implementation class BookingServlet
 */
@WebServlet("/BookingServlet")
public class BookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		HotelBookingDaoImpl bdao=new HotelBookingDaoImpl();
		HotelBooking hb=new HotelBooking();
		String op=request.getParameter("operation");
		RequestDispatcher rd;
		String email=(String)session.getAttribute("username");
		boolean flag;
		if(op!=null && op.equals("addToCart"))
		{
			int id=Integer.parseInt(request.getParameter("hotelId"));
			hb.setHotelId(id);
			hb.setCustEmail(email);
			hb.setNoOfDays(1);
			hb.setNoOfRooms(1);
			flag=bdao.addBooking(hb);
			if(flag)
			{
				request.setAttribute("status", "<b style='color:red'>Booking Details added</b>");
				rd=request.getRequestDispatcher("HotelList.jsp");
				rd.forward(request, response);
			}
			else
			{
				request.setAttribute("status", "<b style='color:red'>Booking Details not added</b>");
				rd=request.getRequestDispatcher("HotelList.jsp");
				rd.forward(request, response);
			}
		}
		else if(op!=null && op.equals("deleteBooking"))
		{
			int id=Integer.parseInt(request.getParameter("bookingId"));
			System.out.println(op+" "+id);
			flag=bdao.cancelBooking(id);
			if(flag)
			{
				request.setAttribute("status", "<b style='color:red'>Booking Deleted...</b>");
				List<HotelBooking> hblist=bdao.getAllBooking(email);
				session.setAttribute("bookingList", hblist);
				rd=request.getRequestDispatcher("bookingList.jsp");
				rd.forward(request, response);
			}
			else
			{
				request.setAttribute("status", "<b style='color:red'>Booking not deleted..</b>");
				List<HotelBooking> hblist=bdao.getAllBooking(email);
				session.setAttribute("bookingList", hblist);
				rd=request.getRequestDispatcher("bookingList.jsp");
				rd.forward(request, response);
			}
			
		}
		else
		{
			List<HotelBooking> hblist=bdao.getAllBooking(email);
			session.setAttribute("bookingList", hblist);
			rd=request.getRequestDispatcher("bookingList.jsp");
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Welcome");
		HttpSession session=request.getSession();
		BillDaoImpl bdao=new BillDaoImpl();
		HotelBookingDaoImpl hbdao=new HotelBookingDaoImpl();
		RequestDispatcher rd;
		int billid=0;
		double totalbill=0;
		LocalDate date=LocalDate.now();
		String orderDate=date.toString();
		String price[]=request.getParameterValues("hotelprice");
		String noOfRoom[]=request.getParameterValues("noofrooms");
		String noOfDays[]=request.getParameterValues("noofdays");
		String email=(String)session.getAttribute("username");
		
		
		//calculating total bill
		for(int i=0;i<price.length;i++)
		{
			totalbill=totalbill+Double.parseDouble(price[i])*Integer.parseInt(noOfRoom[i])*Integer.parseInt(noOfDays[i]);
		}
		
		System.out.println(totalbill);
		//setting value to object
		Bill bill=new Bill();
		bill.setEmail(email);
		bill.setDate(orderDate);
		bill.setBill(totalbill);
		
		//calling method
		billid=bdao.confirmBooking(bill);
		if(billid>0)
		{
			hbdao.clearAllBooking(email);
			request.setAttribute("billDetail","<P style=\"color:red; text-align:center;\"><b>"+"Your Booking is done!!!."
			+"With BillId "+billid+" Bill: "+totalbill);
			rd=request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
		
		
	}

}
