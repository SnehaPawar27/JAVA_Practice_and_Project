package com.HotelParadise.Pojo;

public class Customer {
private int custId;
private String custName,contactNo,custEmail,custPass,address;

public Customer() {
	super();
}

public Customer(String custName, String contactNo, String custEmail, String custPass, String address) {
	super();
	this.custName = custName;
	this.contactNo = contactNo;
	this.custEmail = custEmail;
	this.custPass = custPass;
	this.address = address;
}

public int getCustId() {
	return custId;
}

public void setCustId(int custId) {
	this.custId = custId;
}

public String getCustName() {
	return custName;
}

public void setCustName(String custName) {
	this.custName = custName;
}

public String getContactNo() {
	return contactNo;
}

public void setContactNo(String contactNo) {
	this.contactNo = contactNo;
}

public String getCustEmail() {
	return custEmail;
}

public void setCustEmail(String custEmail) {
	this.custEmail = custEmail;
}

public String getCustPass() {
	return custPass;
}

public void setCustPass(String custPass) {
	this.custPass = custPass;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

@Override
public String toString() {
	return "Customer [custId=" + custId + ", custName=" + custName + ", contactNo=" + contactNo + ", custEmail="
			+ custEmail + ", custPass=" + custPass + ", address=" + address + "]";
}



}
