package com.api.nestedArrayPayloadUsingPojo;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;

public class Payload {
	
	public static void main(String[] args)
	{
		MainPojo obj1 = new MainPojo();
		obj1.setId(1);
		obj1.setFirst_name("Claire");
		obj1.setLast_name("Dennerley");
		obj1.setEmail("claire.dennerley@gmail.com");
		obj1.setGender("Genderfluid");
		
		String[] mobile = {"1232432432","324324324"};
		obj1.setMobile(mobile);
		
		SkillsPojo skill1 = new SkillsPojo();
		skill1.setName("Testing");
		skill1.setProficiency("Medium");
		
		SkillsPojo[] skillslist = {skill1};
		
		obj1.setSkills(skillslist);
		
		MainPojo obj2 = new MainPojo();
		obj2.setId(2);
		obj2.setFirst_name("Cloe");
		obj2.setLast_name("Stuehmeyer");
		obj2.setEmail("cloe.sthueymer@yellowpages.com");
		obj2.setGender("Female");
		
		SkillsPojo skill1Obj2 = new SkillsPojo();
		skill1Obj2.setName("Testing");
		skill1Obj2.setProficiency("Medium");
		
		SkillsPojo skill2Obj2 = new SkillsPojo();
		skill2Obj2.setName("Java");
		skill2Obj2.setProficiency("Medium");
		
		String[] cert = {"OCJP 11","OCJP 12"};
		skill2Obj2.setCertifications(cert);
		
		SkillsPojo[] skillslist2 = {skill1Obj2,skill2Obj2};
		
		obj2.setSkills(skillslist2);
		
		List<MainPojo> payload = new ArrayList<>();
		payload.add(obj1);
		payload.add(obj2);
		
		RestAssured
			.given()
				.log()
				.all()
				.body(payload)
			.when()
				.put();
			
		
	}

}
