package com.api.booker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class DeleteRequest {

	public static void main(String[] args) {
		RestAssured
			.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com/")
				.basePath("booking/{bookingID}")
				.pathParam("bookingID", 17)
				.header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
				.contentType(ContentType.JSON)
			.when()
				.delete()
			.then()
				.log()
				.all();

	}

}
