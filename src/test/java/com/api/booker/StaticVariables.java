package com.api.booker;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class StaticVariables {
	
	@BeforeTest
	public void setup()
	{
		//RestAssured.baseURI = "https://restful-booker.herokuapp.com/";
		//RestAssured.basePath = "booking/1";
		//RestAssured.requestSpecification = RestAssured.given().log().all();
		//RestAssured.responseSpecification = RestAssured.expect().statusCode(200).contentType(ContentType.JSON);
		
		//After Static Import
		baseURI = "https://restful-booker.herokuapp.com/";
		basePath = "booking/8";
		requestSpecification = given().log().all();
		responseSpecification = expect().statusCode(200);
		
	}
	
	@Test(priority=2)
	public void getBooking()
	{
		
		when()
			.get()
		.then()
			.log()
			.all();
	}
	
	@Test(priority=1)
	public void createToken()
	{
		given()
			.basePath("auth")
			.contentType(ContentType.JSON)
			.body("{\r\n"
					+ "    \"username\" : \"admin\",\r\n"
					+ "    \"password\" : \"password123\"\r\n"
					+ "}")
		.when()
			.post()
		.then()
			.log()
			.all();
	}

}
