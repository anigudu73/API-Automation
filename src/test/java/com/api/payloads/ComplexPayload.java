package com.api.payloads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class ComplexPayload {
	
	@Test
	public void complexJsonPayload()
	{
		List<Map<String,Object>> finalPayload = new ArrayList<>();
		
		Map<String,Object> firstElement = new LinkedHashMap<>();
		
		firstElement.put("id", 1);
		firstElement.put("first_name", "Claire");
		firstElement.put("last_name", "Dennerley");
		firstElement.put("email", "claire.dennerley@gmail.com");
		firstElement.put("gender", "Genderfluid");
		
		//List<String> mobileNo = new ArrayList<>();
		//mobileNo.add("1232432432");
		//mobileNo.add("324324324");
		
		List<String> mobileNos = Arrays.asList("1232432432","324324324");
		
		firstElement.put("mobile", mobileNos);
		
		Map<String,Object> skills = new LinkedHashMap<>();
		skills.put("name", "Testing");
		skills.put("proficiency", "Medium");
		
		firstElement.put("skills", skills);
		
		finalPayload.add(firstElement);
		
		Map<String,Object> secondElement = new LinkedHashMap<>();
		
		secondElement.put("id", 2);
		secondElement.put("first_name", "Cloe");
		secondElement.put("last_name", "Stuehmeyer");
		secondElement.put("email", "cloe.sthueymer@yellowpages.com");
		secondElement.put("gender", "Female");
		//secondElement.put("skills", skills);
		
		List<Map<String,Object>> skillsList = new ArrayList<>();
		skillsList.add(skills);
		
		Map<String,Object> skillmap = new LinkedHashMap<>();
		skillmap.put("name", "Java");
		skillmap.put("proficiency", "Medium");
		
		List<String> cert = Arrays.asList("OCJP 11","OCJP 12");
		
		skillmap.put("certifications", cert);
		
		skillsList.add(skillmap);
		
		secondElement.put("skills", skillsList);
		
		finalPayload.add(secondElement);
		
		RestAssured
			.given()
				.log()
				.all()
				.body(finalPayload)
			.when()
				.post();
		
		
	}

}
