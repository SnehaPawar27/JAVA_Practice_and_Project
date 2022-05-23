package com.HotelParadise.Dao;

import java.util.List;

import com.HotelParadise.Pojo.Bill;

public interface BillDao 
{
boolean placeBooking(String emailId);
List<Bill> viewBookingByEmail(String emailId);
List<Bill> viewAllBooking();
int confirmBooking(Bill bill);
}
