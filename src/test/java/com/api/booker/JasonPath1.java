package com.api.booker;

import java.util.Map;

import io.restassured.path.json.JsonPath;

public class JasonPath1 {

	public static void main(String[] args) {
		
		String jsonDemo = "{\r\n"
				+ "    \"firstname\": \"Sally\",\r\n"
				+ "    \"lastname\": \"Brown\",\r\n"
				+ "    \"totalprice\": 111,\r\n"
				+ "    \"depositpaid\": true,\r\n"
				+ "    \"bookingdates\": {\r\n"
				+ "        \"checkin\": \"2013-02-23\",\r\n"
				+ "        \"checkout\": \"2014-10-23\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\": \"Breakfast\"\r\n"
				+ "}";
		
		JsonPath jpath = new JsonPath(jsonDemo);
		
		Object obj = jpath.get("lastname");
		System.out.println(obj);
		
		obj = jpath.get("bookingdates.checkout");
		System.out.println(obj);
		
		obj = jpath.get("additionalneeds");
		System.out.println(obj);
		
		System.out.println((Map)jpath.get("$"));
		

	}

}
