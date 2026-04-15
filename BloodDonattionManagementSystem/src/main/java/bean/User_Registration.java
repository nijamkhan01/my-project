package bean;

import java.sql.DriverManager;
import java.sql.SQLException;

public class User_Registration
{
	   private String email,password,name,address,state,city,bloodGroup;
	   private int contact,pin,status;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	public int addUser() throws SQLException
	{
		 DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			
		  String url = "jdbc:mysql://localhost:3306/blooddb";
		  String user = "root";
		  String pass = "";
				
	  java.sql.Connection conn =  DriverManager.getConnection(url, user, pass);
		
	  String sql ="insert into user_registration(email,password,name,contact,address,state,pin,city,bloodGroup,status) values(?,?,?,?,?,?,?,?,?,?)";
			
	  java.sql.PreparedStatement ps = (java.sql.PreparedStatement) conn.prepareStatement(sql);
		
		    ps.setString(1, email);
		    ps.setString(2, password);
		    ps.setString(3, name);
		    ps.setInt(4, contact);
		    ps.setString(5,address);
		    ps.setString(6,city);
		    ps.setInt(7,pin );
		    ps.setString(8,state);
		    ps.setString(9,bloodGroup);
		    ps.setInt(1, status);
		
	  	int response = ps.executeUpdate();
		
		   conn.close();
		   
		   return response;
	}

}
