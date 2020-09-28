package com.apttus.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
		
		WebDriver ldriver;
		
		public LoginPage(WebDriver rdriver){
			
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
			
		}
		
		@FindBy(css=".login")
		@CacheLookup
		public WebElement SignInLink;
		
		
		@FindBy(css="#email")
		@CacheLookup
		public WebElement EmailID;
		
		@FindBy(css="#passwd")
		@CacheLookup
		public WebElement Password;
		
		@FindBy(css= "#SubmitLogin > span:nth-child(1)")
		@CacheLookup
		public WebElement SignInButton;
		
		 public void clickSigninLink() {
				
			 SignInLink.click();
			}
		
	
        public void setEmailID(String id) {
			
    	   EmailID.sendKeys(id);
		}
		
	public void setPassword(String id) {
			
		Password.sendKeys(id);
		}

		
		 
	    public void clickSigninButton() {
			
	    	SignInButton.click();
		}
	    
	   
}


