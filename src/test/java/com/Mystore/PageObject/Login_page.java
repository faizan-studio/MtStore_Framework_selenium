package com.Mystore.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
	WebDriver ldr;
	
	public Login_page(WebDriver rdr)
	{
		ldr = rdr;
		PageFactory.initElements(rdr, this);
	}

	@FindBy(name = "name") WebElement entername;
	@FindBy(xpath = "//input[@data-qa='signup-email' and @name='email']") WebElement Enteremail;
	@FindBy(xpath = "//button[text()='Signup']") WebElement signup;
	

	
	public void name(String nameis ) {
		entername.sendKeys(nameis);
	}
	public void Email(String emailis ) {
		Enteremail.sendKeys(emailis);
	}
	public void signin( ) {
		signup.click();
	}
	
	
	//Verify Login to your account
		@FindBy(name = "email") WebElement regsteredemail;
		@FindBy(name = "password") WebElement registeredpass;
		@FindBy(xpath = "//button[text()='Login']") WebElement loginbutton;
		 public void Enteredemailadd(String eadd) {
			 regsteredemail.sendKeys(eadd);
		 }
		 public void Enteredpass(String passad) {
			 registeredpass.sendKeys(passad);
		 }
		 public void Loginbutton() {
			 loginbutton.click();
		 }
}
