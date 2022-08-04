package com.api.booker;

import io.restassured.RestAssured;

public class ExtractResponse {

	public static void main(String[] args) {
		String response = RestAssured
			.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com")
				.basePath("booking/{id}")
				.pathParams("id",7)
			.when()
				.get()
			.then()
				.extract()
				.asPrettyString();
		
		System.out.println(response);

	}

}
