package com.api.deserialization;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

public class ConvertResponsewithAddressArraytoPojo {

	public static void main(String[] args)
	{
		Address[] address = RestAssured
			.get("https://run.mocky.io/v3/20b4157c-3efd-4f75-b642-574b05943144")
			.as(Address[].class);
		
		System.out.println(address[1].getQno());
		
		 List<Address> addresses = RestAssured
				.get("https://run.mocky.io/v3/20b4157c-3efd-4f75-b642-574b05943144")
				.as(new TypeRef<List<Address>>(){});
				
	}
}
