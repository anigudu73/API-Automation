package com.api.deserialization;

import io.restassured.RestAssured;

public class ConvertNestedJsonArrayResponseToPojo {
	
	public static void main(String[] args)
	{
		NestedPojo response = RestAssured
			.get("https://run.mocky.io/v3/4ab98079-cd2a-4cba-a6e0-fa14d0d8e783")
			.as(NestedPojo.class);
		
		System.out.println("First Name is "+response.getFirst_name());
		System.out.println("City is "+response.getAddress().getCity());
		System.out.println("Address is "+response.getAddress().getAddressAllFields());
	}

}
