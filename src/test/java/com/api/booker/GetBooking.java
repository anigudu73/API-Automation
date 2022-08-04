package com.api.booker;

import io.restassured.RestAssured;
import io.restassured.response.ResponseBody;

public class GetBooking {

	public static void main(String[] args) {
		
		//Test Git
	ResponseBody response = 	RestAssured
			.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com")
				.basePath("booking/{id}")
				.pathParams("id",7)
			.when()
				.get()
				.body();
			
	
	System.out.println("Response is "+response.asPrettyString());
	
				

	}

}
