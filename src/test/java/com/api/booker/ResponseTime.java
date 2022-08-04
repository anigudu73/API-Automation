package com.api.booker;

import static io.restassured.RestAssured.given;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ResponseTime {
	
	@Test
	public void validateResponseTime()
	{
		Response response = given()
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com/")
			.body("{\r\n"
					+ "    \"firstname\" : \"Jimmy\",\r\n"
					+ "    \"lastname\" : \"Anderson\",\r\n"
					+ "    \"totalprice\" : 117,\r\n"
					+ "    \"depositpaid\" : true,\r\n"
					+ "    \"bookingdates\" : {\r\n"
					+ "        \"checkin\" : \"2018-01-01\",\r\n"
					+ "        \"checkout\" : \"2019-01-01\"\r\n"
					+ "    },\r\n"
					+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
					+ "}")
			.contentType(ContentType.JSON)
		.when()
			.post();
		
		
		//System.out.println("Response is "+response);
		
		
		System.out.println("Response Time is "+response.timeIn(TimeUnit.MILLISECONDS));
		
		//System.out.println(response.then().extract().asPrettyString());
			
	}

}
