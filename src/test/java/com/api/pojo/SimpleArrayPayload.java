package com.api.pojo;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;

public class SimpleArrayPayload {
	
	public static void main(String[] args)
	{
		SimplePojo obj1 = new SimplePojo();
		obj1.setFirst_name("Anish");
		obj1.setLast_name("Kumar");
		obj1.setMarital_status(false);
		obj1.setMarks(80.5f);
		obj1.setRoll_no(17);
		
		SimplePojo obj2 = new SimplePojo();
		obj2.setFirst_name("Nilesh");
		obj2.setLast_name("Mishra");
		obj2.setMarital_status(true);
		obj2.setMarks(71.5f);
		obj2.setRoll_no(21);
		
		List<SimplePojo> payload = new ArrayList<>();
		payload.add(obj1);
		payload.add(obj2);
		
		RestAssured
			.given()
				.log()
				.all()
				.body(payload)
			.when()
				.post()
			.then()
				.log()
				.all();
			
			
		
	}

}
