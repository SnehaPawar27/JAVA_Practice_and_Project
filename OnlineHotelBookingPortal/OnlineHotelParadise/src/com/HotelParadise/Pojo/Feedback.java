package com.HotelParadise.Pojo;

public class Feedback {
private String custName,custEmail,contactNo,comment;

public Feedback() {
	super();
}

public Feedback(String custName, String custEmail, String contactNo, String comment) {
	super();
	this.custName = custName;
	this.custEmail = custEmail;
	this.contactNo = contactNo;
	this.comment = comment;
}

public String getCustName() {
	return custName;
}

public void setCustName(String custName) {
	this.custName = custName;
}

public String getCustEmail() {
	return custEmail;
}

public void setCustEmail(String custEmail) {
	this.custEmail = custEmail;
}

public String getContactNo() {
	return contactNo;
}

public void setContactNo(String contactNo) {
	this.contactNo = contactNo;
}

public String getComment() {
	return comment;
}

public void setComment(String comment) {
	this.comment = comment;
}

@Override
public String toString() {
	return "Feedback [custName=" + custName + ", custEmail=" + custEmail + ", contactNo=" + contactNo + ", comment="
			+ comment + "]";
}
}
