package com.api.booker;

import io.restassured.RestAssured;

public class GetBooking {

	public static void main(String[] args) {
		RestAssured
			.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com")
				.basePath("booking/{id}")
				.pathParams("id",1)
			.when()
				.get()
			.then()
				.log()
				.all();

	}

}
