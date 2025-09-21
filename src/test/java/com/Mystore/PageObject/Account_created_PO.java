package com.Mystore.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Account_created_PO {
	
	WebDriver Ldr;
	public Account_created_PO(WebDriver Rdr) {
		
		
		Ldr = Rdr;
		PageFactory.initElements(Rdr, this);
	}
	@FindBy(xpath = "//a[text()='Continue']") WebElement cont;
	
	
	public void EnterContiue() {
		cont.click();
	}

}
