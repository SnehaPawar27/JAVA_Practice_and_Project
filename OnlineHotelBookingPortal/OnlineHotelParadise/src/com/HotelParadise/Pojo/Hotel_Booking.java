package com.HotelParadise.Pojo;

public class Hotel_Booking {
private int bookingId,hotelId,noOfRooms,noOfDays;
private String custEmail;

public Hotel_Booking() {
	super();
}

public Hotel_Booking(int bookingId, int hotelId, int noOfRooms, int noOfDays, String custEmail) {
	super();
	this.bookingId = bookingId;
	this.hotelId = hotelId;
	this.noOfRooms = noOfRooms;
	this.noOfDays = noOfDays;
	this.custEmail = custEmail;
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

@Override
public String toString() {
	return "Hotel_Booking [bookingId=" + bookingId + ", hotelId=" + hotelId + ", noOfRooms=" + noOfRooms + ", noOfDays="
			+ noOfDays + ", custEmail=" + custEmail + "]";
}



}
