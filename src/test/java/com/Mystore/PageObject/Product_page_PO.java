package com.Mystore.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_page_PO {
	
	WebDriver Ldr; 
	
	public Product_page_PO(WebDriver rdr) {
		
		Ldr = rdr;
		PageFactory.initElements(rdr, this);	
	}
	
	@FindBy(xpath = "//img[@src='/get_product_picture/1']") WebElement prodimg1;
	@FindBy(linkText = "Add to cart") WebElement addtocart;
	@FindBy(xpath = "//button[text()='Continue Shopping']") WebElement Continueshopping;
	@FindBy(xpath = "//img[@src='/get_product_picture/2']") WebElement prodimg2;
	@FindBy(xpath = "//a[text()='Add to cart' and  @data-product-id ='2']") WebElement addtocart2;
	@FindBy(linkText = "View Cart") WebElement viewcart;
	
	public void img1()
	{
		Actions ac1 = new Actions(Ldr);
		ac1.moveToElement(prodimg1).build().perform();
	}
	public void cart1() {
		addtocart.click();
	}
	public void continueshop() {
		Continueshopping.click();
	}
	public void img2() {
		Actions ac2 = new Actions(Ldr);
		ac2.moveToElement(prodimg2).build().perform();
	}
	public void cart2() {
		addtocart2.click();
	}
	public void cartview() {
		viewcart.click();
	}
}
