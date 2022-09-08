package com.api.pojo;

import io.restassured.RestAssured;

public class SimplePojoPayload {
	
	public static void main(String[] args)
	
	{
		
	SimplePojo obj = new SimplePojo();
	obj.setFirst_name("Anish");
	obj.setLast_name("Kumar");
	obj.setMarital_status(false);
	obj.setMarks(80.5f);
	obj.setRoll_no(17);
	
	RestAssured
		.given()
			.log()
			.all()
			.body(obj)
		.when()
			.post()
		.then()
			.log()
			.all();
	}

}
