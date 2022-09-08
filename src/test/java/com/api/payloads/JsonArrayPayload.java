package com.api.payloads;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class JsonArrayPayload {
	
	@Test
	public void jsonArrayPayload()
	{
		Map<String,Object> data1 = new LinkedHashMap<>();
		
		data1.put("id", 1);
		data1.put("first_name", "Byron");
		data1.put("last_name", "Gantt");
		data1.put("email", "anigudu72@gmail.com");
		data1.put("gender", "Male");
		data1.put("city", "Ekimchan");
		
		Map<String,Object> data2 = new LinkedHashMap<>();
		
		data2.put("id", 2);
		data2.put("first_name", "Sandra");
		data2.put("last_name", "Bullocks");
		data2.put("email", "sandra.bullocks@gmail.com");
		data2.put("gender", "Female");
		
		Map<String,Object> address = new LinkedHashMap<>();
		address.put("plot", 421);
		address.put("sector", 13);
		address.put("colony", "Bari Cooperative");
		
		data2.put("address", address);
		data2.put("city", "Texas");
		
		List<Map<String,Object>> payload = new LinkedList<>();
		
		payload.add(data1);
		payload.add(data2);
		
		RestAssured
			.given()
				.log()
				.all()
				.body(payload)
			.when()
				.get();
		
		
		
		
	}

}
