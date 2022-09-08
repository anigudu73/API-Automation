package com.api.nestedArrayPayloadUsingPojo;

public class SkillsPojo {
	
	private String name;
	private String proficiency;
	private String[] certifications;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProficiency() {
		return proficiency;
	}
	public void setProficiency(String proficiency) {
		this.proficiency = proficiency;
	}
	public String[] getCertifications() {
		return certifications;
	}
	public void setCertifications(String[] certifications) {
		this.certifications = certifications;
	}
	
	

}
