package com.api.deserialization;

import io.restassured.RestAssured;

public class ConvertingaPortionOfResponseToPojo {
	
	public static void main(String[] args)
	{
		 Address address = RestAssured
				.get("https://run.mocky.io/v3/5ba163d4-f4f4-42ea-893c-80b8c9d5a2bd")
				.jsonPath()
				.getObject("address[1]", Address.class);
		 
		 System.out.println(address.getSector());
				
	}

}
