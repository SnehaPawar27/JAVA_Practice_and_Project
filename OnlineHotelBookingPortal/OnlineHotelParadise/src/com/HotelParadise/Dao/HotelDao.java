package com.HotelParadise.Dao;

import java.util.List;

import com.HotelParadise.Pojo.Hotel;

public interface HotelDao {

	boolean addHotel(Hotel h);
	List<Hotel> displayHotels();
	List<Hotel> getHotelByType(String type);
	Hotel getHotelById(int id);
	List<Hotel> getHotelByLocation(String location);
	boolean updateHotel(Hotel h);
	boolean deleteHotel(int id);
	List<Hotel> displayCategory(); 
}
