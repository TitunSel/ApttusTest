package com.apttus.UITestCases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.apttus.pageObjects.LoginPage;

import junit.framework.Assert;

public class TC001_ProductAdd extends BaseClass {
	
	@Test
	public void validateLinks() {
		driver.get(baseURL);
		
		log.info("URL opened successfully!!");
		
		LoginPage lp= new LoginPage(driver);
		
		lp.clickSigninLink();
		log.info("SignIn Link clicked successfully!!");
		lp.setEmailID(username);
		log.info("Username fed successfully!!");
		lp.setPassword(password);
		log.info("Password fed successfully!!");
		lp.clickSigninButton();
		log.info("SignIn button clicked successfully!!");
		
		
		
	
	}

}
