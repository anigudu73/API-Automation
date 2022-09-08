package com.api.payloads;

import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class SimplePayload {
	
	@Test
	public void createPayload()
	{
		Map<String,Object> payload = new LinkedHashMap<String, Object>();
		
		payload.put("name", "anish");
		payload.put("city", "bokaro");
		payload.put("age", 35);
		payload.put("gender", 'M');
		payload.put("married", false);
		
		RestAssured
			.given()
				.log()
				.all()
				.body(payload)
			.when()
				.get();
			
		
		
	}

}
