package com.api.datasharing;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class UsingBookingIDFromAnotherClass {
	
	@Test(priority=1)
	public void updateBooking()
	{
		RestAssured
		.given()
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com/")
			.basePath("booking/"+DataStore.getData(Constants.BOOKING_ID))
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
	
	@Test(priority=2)
	public void getBooking()
	{
		RestAssured
		.given()
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com")
			.basePath("booking/"+DataStore.getData(Constants.BOOKING_ID))
			//.pathParams("id",7)
		.when()
			.get()
		.then()
			.log()
			.all();
	}

}
