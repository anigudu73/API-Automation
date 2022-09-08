package com.api.mocker;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class ResponseMocker {
	
	@Test
	public void mockResponse()
	{
		//designer.mocky.io
		//Mocker is used to mock any response which can be used by subsequent APIs
		//Don't wait for the backend to be ready, generate custom API responses with Mocky and start working on your application straightaway
		
		RestAssured
			.given()
				.log()
				.all()
				.baseUri("https://run.mocky.io/v3/f036ddc5-e353-46f3-8b1e-0ecc69d1b333")
			.when()
				.get()
			.then()
				.log()
				.all();
			
	}

}
