package com.HotelParadise.Dao;

import java.sql.*;

import com.HotelParadise.Utility.DBUtility;

public class LoginDaoImpl implements LoginDao{

	PreparedStatement ps;
	String query;
	int row;
	ResultSet rs;
	Connection con=DBUtility.dbConnection();
	@Override
	public boolean userLogin(String email, String pass) {
		String query="select CustEmail,CustPass from Customer_yuga where CustEmail=? and CustPass=?";
		try
		{
			ps=con.prepareStatement(query);
			ps.setString(1,email);
			ps.setString(2, pass);
			rs=ps.executeQuery();
			while(rs.next()) {
				if(email.equals(rs.getString("CustEmail")) && pass.equals(rs.getString("CustPass")))
				{
					return true;
				}
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean userChangePass(String email, String pass) {
		query="update Customer_yuga set CustPass=? where CustEmail=?";
		try
		{
			ps=con.prepareStatement(query);
			ps.setString(1, pass);
			ps.setString(2, email);
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
	public boolean adminLogin(String email, String pass) {
		String query="select AdminEmail,Adminpass from Admin where AdminEmail=? and Adminpass=?";
		try
		{
			ps=con.prepareStatement(query);
			ps.setString(1,email);
			ps.setString(2, pass);
			rs=ps.executeQuery();
			while(rs.next()) {
				if(email.equals(rs.getString("AdminEmail")) && pass.equals(rs.getString("Adminpass")))
				{
					return true;
				}
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean adminChangePass(String email, String pass) {
		query="update Admin set Adminpass=? where AdminEmail=?";
		try
		{
			ps=con.prepareStatement(query);
			ps.setString(1, pass);
			ps.setString(2, email);
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
