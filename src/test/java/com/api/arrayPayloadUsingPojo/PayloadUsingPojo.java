package com.api.arrayPayloadUsingPojo;

import io.restassured.RestAssured;

public class PayloadUsingPojo {
	
	public static void main(String args[])
	{
		SubPojo address = new SubPojo();
		address.setQno(529);
		address.setStreet(13);
		address.setSector("9B");
		address.setCity("Bokaro");
		address.setZip(827009);
		
		MainPojo payload = new MainPojo();
		payload.setFirst_name("Anish");
		payload.setLast_name("Kumar");
		payload.setRoll_no(17);
		payload.setMarital_status(false);
		payload.setMarks(80.5f);
		payload.setAddress(address);
		
		RestAssured
				.given()
					.log()
					.all()
					.body(payload)
				.when()
					.post();
				
		
			
	}

}
