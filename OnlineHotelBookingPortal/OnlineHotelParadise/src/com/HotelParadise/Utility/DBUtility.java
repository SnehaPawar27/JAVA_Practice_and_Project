package com.HotelParadise.Utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtility {

	public static Connection dbConnection()
	{
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HotelParadise_yuga","root","root");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return con;
	}
}
