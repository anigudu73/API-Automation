package com.api.testcontext;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.api.datasharing.Constants;

import io.restassured.RestAssured;

public class DataSharingUsingSuite_2 {
	
	@Test
	public void getBooking(ITestContext context)
	{
		RestAssured
		.given()
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com")
			.basePath("booking/"+context.getSuite().getAttribute(Constants.BOOKING_ID))
			//.pathParams("id",7)
		.when()
			.get()
		.then()
			.log()
			.all();
	}

}
