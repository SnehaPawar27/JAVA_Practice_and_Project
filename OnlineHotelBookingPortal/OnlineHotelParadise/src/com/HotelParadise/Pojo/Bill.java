package com.HotelParadise.Pojo;

public class Bill {
private int billId;
private String email,date;
private double bill;

public Bill() {
	super();
}

public Bill( String email, String date, double bill) {
	super();
	
	this.email = email;
	this.date = date;
	this.bill = bill;
}

public int getBillId() {
	return billId;
}

public void setBillId(int billId) {
	this.billId = billId;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public double getBill() {
	return bill;
}

public void setBill(double bill) {
	this.bill = bill;
}

@Override
public String toString() {
	return "Bill [billId=" + billId + ", email=" + email + ", date=" + date + ", bill=" + bill + "]";
}


}
