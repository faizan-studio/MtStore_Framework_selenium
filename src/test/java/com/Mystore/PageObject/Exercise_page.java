package com.Mystore.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Exercise_page {

	WebDriver ldr;

	public Exercise_page(WebDriver rdr)
	{
		ldr =rdr;

		PageFactory.initElements(rdr, this);
	}

	@FindBy (xpath = "//a[text()=' Products']")WebElement product;

	@FindBy(linkText = "Signup / Login") WebElement signin;

	public void signup()
	{
		signin.click();
	}

	public void productbutton()
	{
		product.click();
	}
}
