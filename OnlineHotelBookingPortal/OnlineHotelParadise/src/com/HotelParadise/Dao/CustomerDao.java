package com.HotelParadise.Dao;

import java.util.List;

import com.HotelParadise.Pojo.Customer;

public interface CustomerDao {
boolean addCustomer(Customer cust);
boolean updateCustomer(Customer cust);
boolean deleteCustomer(int id);
List<Customer> ListOfCustomer();
Customer getCustById(int id);
Customer getCustByEmail(String email);
}
