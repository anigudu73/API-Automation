package com.api.deserialization;

import java.util.Arrays;
import java.util.List;

public class Address {
	
	private int qno;
	private int street;
	private String sector;
	private String city;
	private int zip;
	
	public int getQno() {
		return qno;
	}
	public void setQno(int qno) {
		this.qno = qno;
	}
	public int getStreet() {
		return street;
	}
	public void setStreet(int street) {
		this.street = street;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	
	public List<Object> getAddressAllFields()
	{
		return Arrays.asList(this.qno,this.street,this.city);
	}
	
	

}
