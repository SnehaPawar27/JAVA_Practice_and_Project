package com.HotelParadise.Dao;

import java.util.List;

import com.HotelParadise.Pojo.HotelBooking;

public interface HotelBookingDao {
boolean addBooking(HotelBooking hb);
List<HotelBooking> getAllBooking(String email);
boolean cancelBooking(int bookingId);
boolean clearAllBooking(String email);
}
