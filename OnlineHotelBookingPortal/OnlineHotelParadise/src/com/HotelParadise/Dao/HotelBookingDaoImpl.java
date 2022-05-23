package com.HotelParadise.Dao;

import java.sql.*;
import java.util.*;

import com.HotelParadise.Pojo.HotelBooking;
import com.HotelParadise.Utility.DBUtility;

public class HotelBookingDaoImpl implements HotelBookingDao{

	PreparedStatement ps;
	ResultSet rs;
	int row;
	String query;
	Connection conn=DBUtility.dbConnection();
	@Override
	public boolean addBooking(HotelBooking hb) {
	query="insert into HotelBooking_yuga(CustEmail,HotelId,NoOfRooms,NoOfDays)"+
	      "values(?,?,?,?)";
	try
	{
		ps=conn.prepareStatement(query);
		ps.setString(1,hb.getCustEmail());
		ps.setInt(2,hb.getHotelId());
		ps.setInt(3,hb.getNoOfRooms());
		ps.setInt(4,hb.getNoOfDays());
		row=ps.executeUpdate();
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	if(row>0)
		return true;
	else
		return false;
	}

	@Override
	public List<HotelBooking> getAllBooking(String email) {
		query="select hb.BookingId,hb.CustEmail,hb.NoOfRooms,hb.NoOfDays,hb.HotelId,"+
			  "h.HotelName,h.HotelPrice from HotelBooking_yuga as hb inner join "+
			  "Hotel_yuga as h on hb.HotelId=h.HotelId and CustEmail=?";
		List<HotelBooking> list=new ArrayList<>();
		HotelBooking hb;
		try
		{
			ps=conn.prepareStatement(query);
			ps.setString(1,email);
			rs=ps.executeQuery();
			while(rs.next())
			{
				hb=new HotelBooking();
				hb.setBookingId(rs.getInt(1));
				hb.setCustEmail(rs.getString(2));
				hb.setNoOfRooms(rs.getInt(3));
				hb.setNoOfDays(rs.getInt(4));
				hb.setHotelId(rs.getInt(5));
				hb.setHotelName(rs.getString(6));
				hb.setHotelPrice(rs.getDouble(7));
				list.add(hb);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean cancelBooking(int bookingId) {
		query="delete from HotelBooking_yuga where BookingId=?";
		try
		{
			ps=conn.prepareStatement(query);
			ps.setInt(1, bookingId);
			row=ps.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		if(row>0)
			return true;
			else
				return false;
	}

	@Override
	public boolean clearAllBooking(String email) {
		query="delete from HotelBooking_yuga where custEmail=?";
		try
		{
			ps=conn.prepareStatement(query);
			ps.setString(1, email);
			row=ps.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		if(row>0)
			return true;
			else
				return false;
	}

}
