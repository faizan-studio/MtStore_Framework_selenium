package com.Mystore.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Verify_username_Visible_PO {
	
	WebDriver Ldr;
	public Verify_username_Visible_PO(WebDriver Rdr) {
		
		
		Ldr = Rdr;
		PageFactory.initElements(Rdr, this);
	}
	
	@FindBy(xpath = "//b[text()='Faizan Ansari']") WebElement Visibility;
	@FindBy(xpath = "//a[text()=' Delete Account']") WebElement Del;
	
	public String Visi() {
		String text = 	Visibility.getText();
		return text;
	}
	public void Enterdelete() {
		Del.click();
	}

}
