package com.api.booker;

import java.io.File;
import java.io.FileInputStream;

import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;

public class SchemaValidator {
	
	@Test
	public void Validator1()
	{
		 File request = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\PutRequestBody.json");
		 
		 String requestdata = "{\r\n"
		 		+ "    \"firstname\" : \"James\",\r\n"
		 		+ "    \"lastname\" : \"Brown\",\r\n"
		 		+ "    \"totalprice\" : 111,\r\n"
		 		+ "    \"depositpaid\" : true,\r\n"
		 		+ "    \"bookingdates\" : {\r\n"
		 		+ "        \"checkin\" : \"2018-01-01\",\r\n"
		 		+ "        \"checkout\" : \"2020-01-01\"\r\n"
		 		+ "    },\r\n"
		 		+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
		 		+ "}";
		
		// MatcherAssert.assertThat(requestdata, JsonSchemaValidator.matchesJsonSchemaInClasspath("Schema/PutRequestSchema.json"));
		
		RestAssured
			.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com/booking/10")
				.contentType(ContentType.JSON)
				.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
				.body(request)
				.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("Schema/PutRequestSchema.json"))
			.when()
				.put()
			.then()
				.log()
				.all()
				.statusCode(200);
				//.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("Schema/PutRequestSchema.json"));
				
	}

}
