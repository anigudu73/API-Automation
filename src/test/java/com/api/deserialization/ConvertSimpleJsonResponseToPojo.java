package com.api.deserialization;

import io.restassured.RestAssured;

public class ConvertSimpleJsonResponseToPojo {
	
	public static void main(String[] args)
	{
		SimplePojoClass obj = RestAssured
			.given()
				.log()
				.all()
			.when()
				.get("https://run.mocky.io/v3/c51e5e64-76ca-4d17-a1e3-b3b6000bc3d8")
			.then()
				.extract()
				.body()
				.as(SimplePojoClass.class);
		
		System.out.println("First name is "+obj.getFirst_name()+" Email is "+obj.getEmail());
			
			
	}

}
