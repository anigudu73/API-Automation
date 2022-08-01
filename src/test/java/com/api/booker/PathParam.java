package com.api.booker;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;

public class PathParam {

	public static void main(String[] args) {
		Map<String,Object> baseparam = new HashMap<>();
		baseparam.put("country", "US");
		baseparam.put("zip","39172");
		RestAssured
			.given()
				.log()
				.all()
				.pathParams(baseparam)
			.when()
				.get("https://api.zippopotam.us/{country}/{zip}")
			.then()
				.log()
				.all()
				.statusCode(200);
			
				

	}

}
