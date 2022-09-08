package com.api.arrayPayloadUsingPojo;

public class MainPojo {
	
	private int roll_no;
	private String first_name;
	private String last_name;
	private float marks;
	private boolean marital_status;
	private SubPojo address;
	
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public boolean isMarital_status() {
		return marital_status;
	}
	public void setMarital_status(boolean marital_status) {
		this.marital_status = marital_status;
	}
	public SubPojo getAddress() {
		return address;
	}
	public void setAddress(SubPojo address) {
		this.address = address;
	}
	
	
	

}
