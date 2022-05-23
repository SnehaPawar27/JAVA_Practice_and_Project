package pojo;

public class UserDetails {
private String username="yuga",password="1234",address="vashi";
private int number=54641;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
@Override
public String toString() {
	return "UserDetails [username=" + username + ", password=" + password + ", address=" + address + ", number="
			+ number + "]";
}


}
