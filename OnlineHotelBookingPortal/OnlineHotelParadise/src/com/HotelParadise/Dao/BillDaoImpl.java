package com.HotelParadise.Dao;

import java.util.*;
import java.sql.*;
import java.time.LocalDate;

import com.HotelParadise.Pojo.Bill;
import com.HotelParadise.Utility.DBUtility;

public class BillDaoImpl implements BillDao {

	String query;
	PreparedStatement ps;
	ResultSet rs;
	int row;
	Connection conn=DBUtility.dbConnection();
	@Override
	public boolean placeBooking(String emailId) {
		LocalDate date=LocalDate.now();
		String odate=date.toString();
		double totalBill=0;
	query="select sum(h.HotelPrice*hb.NoOfRooms*hb.NoOfDays) as TotalBill from Hotel_yuga as h "+
	      "inner join HotelBooking_yuga as hb on h.HotelId=hb.HotelId and custEmail=?";
	try
	{
		ps=conn.prepareStatement(query);
		ps.setString(1,emailId);
		rs=ps.executeQuery();
		while(rs.next())
		{
			totalBill=rs.getDouble("TotalBill");
		}
		query="insert into Bill_yuga(CustEmail,TotalBill,OrderDate) values(?,?,?)";
		ps=conn.prepareStatement(query);
		ps.setString(1,emailId);
		ps.setDouble(2,totalBill);
		ps.setString(3,odate);
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
	public List<Bill> viewBookingByEmail(String emailId) {
		query="select * from Bill_yuga where CustEmail=?;";
		List<Bill> list=new ArrayList<>();
		Bill bill;
		try
		{
			ps=conn.prepareStatement(query);
			ps.setString(1,emailId);
			rs=ps.executeQuery();
			while(rs.next())
			{
				bill=new Bill(rs.getString("CustEmail"),rs.getString("OrderDate"),rs.getDouble("TotalBill"));
				bill.setBillId(rs.getInt("BillId"));
				list.add(bill);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Bill> viewAllBooking() {
		query="select * from Bill_yuga";
		List<Bill> list=new ArrayList<>();
		Bill bill;
		try
		{
			ps=conn.prepareStatement(query);
			rs=ps.executeQuery();
			while(rs.next())
			{
				bill=new Bill(rs.getString("CustEmail"),rs.getString("OrderDate"),rs.getDouble("TotalBill"));
				bill.setBillId(rs.getInt("BillId"));
				list.add(bill);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int confirmBooking(Bill bill) {
		int billId=0;
		query="insert into Bill_yuga(CustEmail,TotalBill,OrderDate) values(?,?,?)";
		try
		{
			ps=conn.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, bill.getEmail());
			ps.setDouble(2, bill.getBill());
			ps.setString(3, bill.getDate());
			row=ps.executeUpdate();
			rs=ps.getGeneratedKeys();
			while(rs.next())
			{
				billId=rs.getInt(1);
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return billId;
	}

}
