package com.Mystore.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Signup_page_object {
	
	WebDriver Ldr;
	
	public Signup_page_object(WebDriver Rdr) {
		
		Ldr = Rdr;
		PageFactory.initElements(Rdr, this);
		
	}
	
	@FindBy(id = "id_gender1") WebElement gender ;
	@FindBy(id = "password") WebElement pass;
	@FindBy(id = "first_name") WebElement firstname;
	@FindBy(id = "last_name") WebElement lastname;
	@FindBy(id = "address1") WebElement add1;
	@FindBy(id = "country") WebElement contr;
	@FindBy(id = "state") WebElement sta;
	@FindBy(id = "city") WebElement ci;
	@FindBy(id = "zipcode") WebElement zip;
	@FindBy(id = "mobile_number") WebElement num;
	@FindBy(xpath  = "//button[text()='Create Account']") WebElement createbutton;
	
	public void entergen() {
		gender.click();
	}
	public void enterpassword(String pas) {
		pass.sendKeys(pas);
	}
	public void enterFirstnane(String fname)
	{
		firstname.sendKeys(fname);
	}
	public void enterLastname(String Lname) {
		lastname.sendKeys(Lname);
	}
	public void enterAddress(String add) {
		add1.sendKeys(add);
	}
	public void enterCountry(String con) {
		Select sc = new Select(contr);
		sc.selectByVisibleText(con);
	}
	public void enterState(String st) {
		sta.sendKeys(st);
	}
	public void enterCity(String city) {
		ci.sendKeys(city);
	}
	public void enterZipcode(String zp) {
		zip.sendKeys(zp);
	}
	public void enterMobilenumber(String mn) {
		num.sendKeys(mn);
	}
	public void entercreatebutton() {
		createbutton.click();
		
	}
	
	
	
	
	
	
	
	
	
}
