package com.Mystore.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class View_Cart_PO {
	WebDriver Ldr;
	
	public View_Cart_PO(WebDriver rdr) {
		Ldr = rdr;
		
		PageFactory.initElements(rdr, this);
	}
	@FindBy(linkText = "Blue Top") WebElement Bluet;
	@FindBy(xpath = "(//p[text()='Rs. 500'])[1]") WebElement pricecheck;
	@FindBy(xpath = "(//button[text()='1' and @class='disabled'])[1]") WebElement quantitycheck;
	@FindBy(xpath = "(//p[text()='Rs. 500' and @class='cart_total_price'])[1]") WebElement totalcheck;
	@FindBy(linkText = "Men Tshirt") WebElement tshirt_men;
	@FindBy(xpath = "(//p[text()='Rs. 400'])[1]") WebElement pricecheck2;
	@FindBy(xpath = "(//button[text()='1' and @class='disabled'])[2]") WebElement quantitycheck2;
	@FindBy(xpath = "(//p[text()='Rs. 400' and @class='cart_total_price'])[1]") WebElement totalcheck2;


	public String verifytop() {
		String vt =Bluet.getText();
		return vt;
	}
	public String Check_Price() {
		String cp = pricecheck.getText();
		return cp;
	}
	public String Check_Quantity() {
		String cq = quantitycheck.getText();
		return cq;
	}
	public String Check_Total() {
		String ct = totalcheck.getText();
		return ct;
	}
	public String Tshirt() {
		String ts = tshirt_men.getText();
		return ts;
	}
	public String Check_Price_2() {
		String cp2 = pricecheck2.getText();
		return cp2;
	}
	public String Check_Quantity2() {
		String cq2 = quantitycheck2.getText();
		return cq2;
	}
	public String Check_Total_2() {
		String ct2 = totalcheck2.getText();
		return ct2;
	}
	





}
