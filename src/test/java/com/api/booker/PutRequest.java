package com.api.booker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PutRequest {

	public static void main(String[] args) {
		
		RestAssured
			.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com/")
				.basePath("booking/17")
				.header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
				.contentType(ContentType.JSON)
				.body("{\r\n"
						+ "    \"firstname\" : \"Gudu\",\r\n"
						+ "    \"lastname\" : \"Kumar\",\r\n"
						+ "    \"totalprice\" : 111,\r\n"
						+ "    \"depositpaid\" : true,\r\n"
						+ "    \"bookingdates\" : {\r\n"
						+ "        \"checkin\" : \"2018-01-01\",\r\n"
						+ "        \"checkout\" : \"2019-01-01\"\r\n"
						+ "    },\r\n"
						+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
						+ "}")
			.when()
				.put()
			.then()
				.log()
				.all();
				

	}

}
