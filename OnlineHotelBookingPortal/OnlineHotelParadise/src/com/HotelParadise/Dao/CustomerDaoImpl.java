package com.HotelParadise.Dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

import com.HotelParadise.Pojo.Customer;
import com.HotelParadise.Pojo.Hotel;
import com.HotelParadise.Utility.DBUtility;

public class CustomerDaoImpl implements CustomerDao{

	String query;
	int row;
	PreparedStatement ps;
	ResultSet rs;
	Connection conn=DBUtility.dbConnection();
	@Override
	public boolean addCustomer(Customer cust) {
		query="insert into Customer_yuga(CustName,CustNo,CustEmail,CustPass,CustAddress )"
				+"values(?,?,?,?,?)";
		try {
			ps=conn.prepareStatement(query);
			ps.setString(1,cust.getCustName());
			ps.setString(2,cust.getContactNo());
			ps.setString(3,cust.getCustEmail());
			ps.setString(4,cust.getCustPass());
			ps.setString(5,cust.getAddress());
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
	public boolean updateCustomer(Customer cust) {
		query="update Customer_yuga set CustName=?, CustNo=?, CustEmail=?, CustPass=?, CustAddress=? where CustId=?";
		try
		{
			ps=conn.prepareStatement(query);
			ps.setString(1,cust.getCustName());
			ps.setString(2,cust.getContactNo());
			ps.setString(3,cust.getCustEmail());
			ps.setString(4,cust.getCustPass());
			ps.setString(5,cust.getAddress());
			ps.setInt(6,cust.getCustId());
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
	public boolean deleteCustomer(int id) {
		query="delete from Customer_yuga where CustId=?";
		try
		{
			ps=conn.prepareStatement(query);
			ps.setInt(1,id);
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
	public List<Customer> ListOfCustomer() {
		query="select * from Customer_yuga";
		List<Customer> list=new ArrayList<>();
		Customer cust;
		try
		{
			ps=conn.prepareStatement(query);
			rs=ps.executeQuery();
			while(rs.next())
			{
				cust=new Customer(rs.getString("CustName"),rs.getString("CustNo"),rs.getString("CustEmail"),rs.getString("CustPass"),rs.getString("CustAddress"));
				cust.setCustId(rs.getInt("CustId"));
				list.add(cust);
			}
		}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			return list;
		}
	@Override
	public Customer getCustById(int id) {
		query="select * from Customer_yuga where CustId=?";
		Customer cust=null;
		try
		{
			ps=conn.prepareStatement(query);
			ps.setInt(1,id);
			rs=ps.executeQuery();
			while(rs.next())
			{
				cust=new Customer(rs.getString("CustName"),rs.getString("CustNo"),rs.getString("CustEmail"),rs.getString("CustPass"),rs.getString("CustAddress"));
				cust.setCustId(rs.getInt("CustId"));
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return cust;
	}

	@Override
	public Customer getCustByEmail(String email) {
		query="select * from Customer_yuga where CustEmail=?";
		Customer cust=null;
		try
		{
			ps=conn.prepareStatement(query);
			ps.setString(1,email);
			rs=ps.executeQuery();
			while(rs.next())
			{

				cust=new Customer(rs.getString("CustName"),rs.getString("CustNo"),rs.getString("CustEmail"),rs.getString("CustPass"),rs.getString("CustAddress"));
				cust.setCustId(rs.getInt("CustId"));
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return cust;
	}

}
