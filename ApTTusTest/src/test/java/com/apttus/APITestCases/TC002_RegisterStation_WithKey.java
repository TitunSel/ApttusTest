package com.apttus.APITestCases;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC002_RegisterStation_WithKey {

	@Test
	void registerWithKey() {
		
		//specifying Base URI
		RestAssured.baseURI = "http://api.openweathermap.org/data/3.0/stations&APPID={4ca833d50d2176cc6d802539c574535f}";
		
		//Creating a request
		RequestSpecification httprequest= RestAssured.given();
		
		//Specifying Request Payload
		JSONObject rpayload= new JSONObject();
		rpayload.put("external_id", "DEMO_TEST001");
		rpayload.put("name", "Bengaluru Test Station");
		rpayload.put("latitude", 33.33);
		rpayload.put("longitude", -111.43);
		rpayload.put("altitude", 290);
		
		httprequest.header("Content-Type","application/json");
	    httprequest.body(rpayload.toJSONString()) ;
	    
	    //Specifying Response
		
	   Response response = httprequest.request(Method.POST);
	   
	 //verifying Response
	 int res= response.getStatusCode();
	 System.out.println(res);
	// Assert.assertEquals(res, 401);
	
	 String body= response.getBody().asString();
	 System.out.println(body);
	 //Assert.assertEquals(body, "{\"cod\":401, \"message\": \"Invalid API key. Please see http://openweathermap.org/faq#error401 for more info.\"}");
	 
	 
		
		
		
		
		
	}
}
