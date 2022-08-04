package com.api.booker;

import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class BaseClass {
	RequestSpecification requestspec;
	ResponseSpecification responsespec;

	@BeforeClass
	public void setup()
	{
		requestspec = given()
						.log()
						.all()
						.baseUri("https://restful-booker.herokuapp.com")
						.contentType(ContentType.JSON);
		
		responsespec = expect()
						.statusCode(200)
						.contentType(ContentType.JSON)
						.time(Matchers.lessThan(5000L));
						
					
	}
}
