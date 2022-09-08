package com.api.payloads;

import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class NestedPayload {
	
	@Test
	public void nestedJson()
	{
		Map<String,Object> nestedJson = new LinkedHashMap<>();
		
		nestedJson.put("name", "Anish");
		nestedJson.put("age", 35);
		nestedJson.put("gender", "M");
		nestedJson.put("married", false);
		
		Map<String,Object> addressJson = new LinkedHashMap<>();
		
		addressJson.put("plot no", 421);
		addressJson.put("Colony", "Bari Cooperative");
		addressJson.put("city", "Bokaro");
		
		nestedJson.put("address", addressJson);
		nestedJson.put("employment", true);
		
		RestAssured
			.given()
				.log()
				.all()
				.body(nestedJson)
			.when()
				.post();
				
		
		
		
	}

}
