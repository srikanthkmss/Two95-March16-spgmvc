package com.srikanth;

import java.util.Date;
import java.util.List;



public class CustDetails {
	private String name;
	private String mobile;
	private String email;
	private Date da;
	private List<String> roomtype;
	private String sex;
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	private Address address;
	
	public CustDetails(){
		  
	  }
	public CustDetails(String name, String mobile, String email, Date da, List<String> roomtype,String sex, Address address) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.da = da;
		this.setRoomtype (roomtype);
		this.sex = sex;
		this.setAddress(address);
	}
	public Date getDa() {
		return da;
	}
	public void setDa( Date da) {
		this.da = da;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<String> getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(List<String> roomtype) {
		this.roomtype = roomtype;
	}
}
