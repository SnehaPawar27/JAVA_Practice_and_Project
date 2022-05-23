package com.HotelParadise.Dao;

public interface LoginDao {

	boolean userLogin(String email,String pass);
	boolean userChangePass(String email,String pass);
	boolean adminLogin(String email,String pass);
	boolean adminChangePass(String email,String pass);
}
