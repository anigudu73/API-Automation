package com.api.nestedArrayPayloadUsingPojo;

public class MainPojo {
	
	private int id;
	private String first_name;
	private String last_name;
	private String email;
	private String gender;
	private String[] mobile;
	private SkillsPojo[] skills;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getMobile() {
		return mobile;
	}
	public void setMobile(String[] mobile) {
		this.mobile = mobile;
	}
	public SkillsPojo[] getSkills() {
		return skills;
	}
	public void setSkills(SkillsPojo[] skills) {
		this.skills = skills;
	}
	
	

}
