package com.Mystore.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Delete_account_PO {
	WebDriver Ldr;
	public Delete_account_PO(WebDriver Rdr) {


		Ldr = Rdr;
		PageFactory.initElements(Rdr, this);
	}
	@FindBy(xpath = "//b[text()='Account Deleted!']") WebElement deleted;
	@FindBy(xpath = "//a[text()='Continue']") WebElement coniti;

	public String enteracctdeleted() {
		String text =deleted.getText();
		return text;
	}
	
	public void clickcontibutt() {
		coniti.click();
	}
}
