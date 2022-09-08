package com.api.booker;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class RequestResponseSpec extends BaseClass {
	
	
	@Test
	public void getBooking()
	{
			given(requestspec)
				.basePath("booking/{id}")
				.pathParam("id", 7)
			.when()
				.get()
			.then()
				.spec(responsespec)
				.log()
				.all();
	}
	
	@Test
	public void createBooking()
	{
		
				given(requestspec)
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
				.when()
					.post()
				.then()
					.spec(responsespec)
					.log()
					.all();
	}

}
