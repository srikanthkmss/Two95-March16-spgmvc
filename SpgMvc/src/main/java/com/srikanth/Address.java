package com.srikanth;

public class Address {
	private int doorno;
	private String city;
	private String state;
	private String country;
	private int zipcode;
	@Override
	public String toString() {
		return "[Door No.=" + doorno + ", City=" + city + ", State=" + state + ", Country=" + country + ", Zipcode="
				+ zipcode + "]";
	}
	public Address(){
		
	}
	public Address(int doorno, String city, String state, String country, int zipcode) {
		super();
		this.doorno = doorno;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
	}
	public int getDoorno() {
		return doorno;
	}
	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	}


