package com.apttus.APITestCases;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.apttus.UITestCases.BaseClass;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001_RegisterStation_WithoutKey {
	
	@Test
	void registerWithoutKey() {
		
		//specifying Base URI
		RestAssured.baseURI = "http://api.openweathermap.org/data/3.0";
		
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
		
	   Response response = httprequest.request(Method.POST,"/stations");
	   
	 //verifying Response
	 int res= response.getStatusCode();
	 Assert.assertEquals(res, 401);
	
	 String body= response.getBody().asString();
	 Assert.assertEquals(body, "{\"cod\":401, \"message\": \"Invalid API key. Please see http://openweathermap.org/faq#error401 for more info.\"}");
	 
	 
		
		
		
		
		
	}
	

}
