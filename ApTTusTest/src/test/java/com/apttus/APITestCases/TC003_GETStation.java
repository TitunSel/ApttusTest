package com.apttus.APITestCases;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC003_GETStation {

	@Test
	void registerWithKey() {
		
		//specifying Base URI
		RestAssured.baseURI = "api.openweathermap.org/data/2.5/forecast?id=524901&APPID={4ca833d50d2176cc6d802539c574535f}";
		
		//Creating a request
		RequestSpecification httprequest= RestAssured.given();
		
		//Specifying Request Payload
		
	    
	    //Specifying Response
		
	   Response response = httprequest.request(Method.GET);
	   
	 //verifying Response
	 int res= response.getStatusCode();
	 System.out.println(res);
	// Assert.assertEquals(res, 401);
	
	 String body= response.getBody().asString();
	 System.out.println(body);
	 //Assert.assertEquals(body, "{\"cod\":401, \"message\": \"Invalid API key. Please see http://openweathermap.org/faq#error401 for more info.\"}");
	 
	 
		
		
		
		
		
	}
}

