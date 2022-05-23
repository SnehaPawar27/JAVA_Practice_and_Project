package com.HotelParadise.Pojo;

import java.io.InputStream;

public class Hotel {
private int hotelId;
private String hotelName,hotelLocation,hotelType,hotelDescription;
InputStream image;
private double hotelPrice;

public Hotel()
{
	
}
public Hotel(String hotelName, String hotelLocation, String hotelType, String hotelDescription,
		InputStream image, double hotelPrice) {
	super();
	
	this.hotelName = hotelName;
	this.hotelLocation = hotelLocation;
	this.hotelType = hotelType;
	this.hotelDescription = hotelDescription;
	this.image = image;
	this.hotelPrice = hotelPrice;
}
public int getHotelId() {
	return hotelId;
}
public void setHotelId(int hotelId) {
	this.hotelId = hotelId;
}
public String getHotelName() {
	return hotelName;
}
public void setHotelName(String hotelName) {
	this.hotelName = hotelName;
}
public String getHotelLocation() {
	return hotelLocation;
}
public void setHotelLocation(String hotelLocation) {
	this.hotelLocation = hotelLocation;
}
public String getHotelType() {
	return hotelType;
}
public void setHotelType(String hotelType) {
	this.hotelType = hotelType;
}
public String getHotelDescription() {
	return hotelDescription;
}
public void setHotelDescription(String hotelDescription) {
	this.hotelDescription = hotelDescription;
}
public InputStream getImage() {
	return image;
}
public void setImage(InputStream image) {
	this.image = image;
}
public double getHotelPrice() {
	return hotelPrice;
}
public void setHotelPrice(double hotelPrice) {
	this.hotelPrice = hotelPrice;
}
@Override
public String toString() {
	return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelLocation=" + hotelLocation
			+ ", hotelType=" + hotelType + ", hotelDescription=" + hotelDescription + ", image=" + image
			+ ", hotelPrice=" + hotelPrice + "]";
}



}
