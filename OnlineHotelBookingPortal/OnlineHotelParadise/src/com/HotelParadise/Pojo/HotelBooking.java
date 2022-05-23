package com.HotelParadise.Pojo;

public class HotelBooking {
private int bookingId,hotelId,noOfRooms,noOfDays;
private String custEmail,hotelName;
private double hotelPrice;
public HotelBooking() {
	super();
	// TODO Auto-generated constructor stub
}
public HotelBooking(int bookingId, int hotelId, int noOfRooms, int noOfDays, String custEmail, String hotelName,
		double hotelPrice) {
	super();
	this.bookingId = bookingId;
	this.hotelId = hotelId;
	this.noOfRooms = noOfRooms;
	this.noOfDays = noOfDays;
	this.custEmail = custEmail;
	this.hotelName = hotelName;
	this.hotelPrice = hotelPrice;
}
public int getBookingId() {
	return bookingId;
}
public void setBookingId(int bookingId) {
	this.bookingId = bookingId;
}
public int getHotelId() {
	return hotelId;
}
public void setHotelId(int hotelId) {
	this.hotelId = hotelId;
}
public int getNoOfRooms() {
	return noOfRooms;
}
public void setNoOfRooms(int noOfRooms) {
	this.noOfRooms = noOfRooms;
}
public int getNoOfDays() {
	return noOfDays;
}
public void setNoOfDays(int noOfDays) {
	this.noOfDays = noOfDays;
}
public String getCustEmail() {
	return custEmail;
}
public void setCustEmail(String custEmail) {
	this.custEmail = custEmail;
}
public String getHotelName() {
	return hotelName;
}
public void setHotelName(String hotelName) {
	this.hotelName = hotelName;
}
public double getHotelPrice() {
	return hotelPrice;
}
public void setHotelPrice(double hotelPrice) {
	this.hotelPrice = hotelPrice;
}
@Override
public String toString() {
	return "HotelBooking [bookingId=" + bookingId + ", hotelId=" + hotelId + ", noOfRooms=" + noOfRooms + ", noOfDays="
			+ noOfDays + ", custEmail=" + custEmail + ", hotelName=" + hotelName + ", hotelPrice=" + hotelPrice + "]";
}


}

