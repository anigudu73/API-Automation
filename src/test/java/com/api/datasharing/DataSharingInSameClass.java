package com.api.datasharing;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class DataSharingInSameClass {
	
	int id;
	
	@Test(priority=1)
	public void createBooking()
	{
		id = RestAssured
		.given()
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com/")
			.basePath("booking")
			.body("{\r\n"
					+ "    \"firstname\" : \"Jim\",\r\n"
					+ "    \"lastname\" : \"Brown\",\r\n"
					+ "    \"totalprice\" : 111,\r\n"
					+ "    \"depositpaid\" : true,\r\n"
					+ "    \"bookingdates\" : {\r\n"
					+ "        \"checkin\" : \"2018-01-01\",\r\n"
					+ "        \"checkout\" : \"2019-01-01\"\r\n"
					+ "    },\r\n"
					+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
					+ "}")
			.contentType(ContentType.JSON)
		.when()
			.post()
		.then()
			.log()
			.all()
			.statusCode(200)
			.extract()
			.jsonPath()
			.getInt("bookingid");
			
		
	}
	
	@Test(priority=2)
	public void getBooking()
	{
		RestAssured
		.given()
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com")
			.basePath("booking/"+id)
			//.pathParams("id",7)
		.when()
			.get()
		.then()
			.log()
			.all();
	}
	

}
