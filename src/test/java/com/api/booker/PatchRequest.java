package com.api.booker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PatchRequest {

	public static void main(String[] args) {
		RestAssured
			.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com/")
				.basePath("booking/17")
				.contentType(ContentType.JSON)
				.header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
				.body("{\r\n"
						+ "    \"firstname\" : \"James\",\r\n"
						+ "    \"lastname\" : \"Brown\"\r\n"
						+ "}")
			.when()
				.patch()
			.then()
				.log()
				.all();

	}

}
