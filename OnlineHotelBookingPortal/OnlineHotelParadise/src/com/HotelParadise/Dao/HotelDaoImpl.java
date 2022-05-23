package com.HotelParadise.Dao;

import java.sql.*;
import java.util.*;

import com.HotelParadise.Pojo.Hotel;
import com.HotelParadise.Utility.DBUtility;

public class HotelDaoImpl implements HotelDao{

	String query;
	PreparedStatement ps;
	int row=0;
	ResultSet rs;
	Connection conn=DBUtility.dbConnection();
	@Override
	public boolean addHotel(Hotel h) {
		query="insert into Hotel_yuga(HotelName,HotelLocation,HotelPrice,"+
	          "HotelType,HotelDescription,HotelImage)"+
			  "values(?,?,?,?,?,?)";
		try {
		ps=conn.prepareStatement(query);
		ps.setString(1,h.getHotelName());
		ps.setString(2,h.getHotelLocation());
		ps.setDouble(3,h.getHotelPrice());
		ps.setString(4,h.getHotelType());
		ps.setString(5,h.getHotelDescription());
		ps.setBlob(6,h.getImage());
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
	public List<Hotel> displayHotels() {
		query="select * from Hotel_yuga";
		List<Hotel> list=new ArrayList<>();
		Hotel hotel;
		try
		{
			ps=conn.prepareStatement(query);
			rs=ps.executeQuery();
			while(rs.next())
			{
				hotel=new Hotel();
				hotel.setHotelId(rs.getInt("HotelId"));
				hotel.setHotelName(rs.getString("HotelName"));
				hotel.setHotelLocation(rs.getString("HotelLocation"));
				hotel.setHotelType(rs.getString("HotelType"));
				hotel.setHotelPrice(rs.getInt("HotelPrice"));
				hotel.setHotelDescription(rs.getString("HotelDescription"));
				hotel.setImage(rs.getBinaryStream("HotelImage"));
				list.add(hotel);
				
				}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public List<Hotel> getHotelByType(String type) {
		query="select * from Hotel_yuga where HotelType=?";
		List<Hotel> list=new ArrayList<>();
		Hotel hotel;
		try
		{
			ps=conn.prepareStatement(query);
			ps.setString(1,type);
			rs=ps.executeQuery();
			while(rs.next())
			{
				hotel=new Hotel(rs.getString("HotelName"),rs.getString("HotelLocation"),rs.getString("HotelType"),rs.getString("HotelDescription"),rs.getBinaryStream("HotelImage"),rs.getDouble("HotelPrice"));
				hotel.setHotelId(rs.getInt("HotelId"));
				list.add(hotel);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public Hotel getHotelById(int id) {
		query="select * from Hotel_yuga where HotelId=?";
		Hotel hotel=null;
		try
		{
			ps=conn.prepareStatement(query);
			ps.setInt(1,id);
			rs=ps.executeQuery();
			while(rs.next())
			{
				hotel=new Hotel(rs.getString("HotelName"),rs.getString("HotelLocation"),rs.getString("HotelType"),rs.getString("HotelDescription"),rs.getBinaryStream("HotelImage"),rs.getDouble("HotelPrice"));
				hotel.setHotelId(rs.getInt("HotelId"));
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return hotel;
	}
	@Override
	public List<Hotel> getHotelByLocation(String location) {
		query="select * from Hotel_yuga where HotelLocation=?";
		List<Hotel> list=new ArrayList<>();
		Hotel hotel;
		try
		{
			ps=conn.prepareStatement(query);
			ps.setString(1,location);
			rs=ps.executeQuery();
			while(rs.next())
			{
				hotel=new Hotel(rs.getString("HotelName"),rs.getString("HotelLocation"),rs.getString("HotelType"),rs.getString("HotelDescription"),rs.getBinaryStream("HotelImage"),rs.getDouble("HotelPrice"));
				hotel.setHotelId(rs.getInt("HotelId"));
				list.add(hotel);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public boolean updateHotel(Hotel h) {
		query="update Hotel_yuga set HotelName=?,"
			  +"HotelLocation=?,HotelPrice=?,HotelType=?,"
			  +"HotelDescription=?,HotelImage=? where HotelId=?";
		try
		{
		ps=conn.prepareStatement(query);
		ps.setString(1,h.getHotelName());
		ps.setString(2,h.getHotelLocation());
		ps.setDouble(3,h.getHotelPrice());
		ps.setString(4,h.getHotelType());
		ps.setString(5,h.getHotelDescription());
		ps.setBlob(6,h.getImage());
		ps.setInt(7,h.getHotelId());
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
	public boolean deleteHotel(int id) {
		query="delete from Hotel_yuga where HotelId=?";
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
	public List<Hotel> displayCategory() {
		query="select distinct(HotelType) from Hotel_yuga";
		List<Hotel> hlist=new ArrayList<>();
		try {
			ps=conn.prepareStatement(query);
			rs=ps.executeQuery();
			while(rs.next())
			{
				Hotel h=new Hotel();
				h.setHotelType(rs.getString("HotelType"));
				hlist.add(h);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return hlist;
	}

}
