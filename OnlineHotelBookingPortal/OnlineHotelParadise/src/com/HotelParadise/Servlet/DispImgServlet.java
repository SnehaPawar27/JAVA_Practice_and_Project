package com.HotelParadise.Servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.HotelParadise.Dao.HotelDaoImpl;
import com.HotelParadise.Pojo.Hotel;





/**
 * Servlet implementation class DispImgServlet
 */
@WebServlet("/DispImgServlet")
@MultipartConfig(maxFileSize=16777215)
public class DispImgServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DispImgServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HotelDaoImpl hdao=new HotelDaoImpl();
		
		int id=Integer.parseInt(request.getParameter("id"));
		
		Hotel h=hdao.getHotelById(id);
		
		response.setContentType("images/*");
		InputStream is=h.getImage();
		OutputStream o=response.getOutputStream();
		
		if(is!=null)
		{
			int d=is.read();
			
			while(d!=-1)
			{
				o.write(d);
				d=is.read();
			}
		}
		o.flush();
		o.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
