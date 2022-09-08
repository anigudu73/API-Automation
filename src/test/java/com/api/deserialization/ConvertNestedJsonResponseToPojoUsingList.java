package com.api.deserialization;

import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;

public class ConvertNestedJsonResponseToPojoUsingList {
	
	public static void main(String[] args)
	{
		NestedPojoWithArray response = RestAssured
			.get("https://run.mocky.io/v3/5ba163d4-f4f4-42ea-893c-80b8c9d5a2bd")
			.as(NestedPojoWithArray.class);
		
		System.out.println("First Name is "+response.getFirst_name());
		List<Address> allAddress = response.getAddress();
		
		System.out.println("First Sector is "+allAddress.get(0).getSector());
		
		System.out.println("Second Sector is "+allAddress.get(1).getSector());
		
		ObjectMapper mapper = new ObjectMapper();
		
	}

}
