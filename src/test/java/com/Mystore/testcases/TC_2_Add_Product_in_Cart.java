package com.Mystore.testcases;


import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Mystore.PageObject.Exercise_page;
import com.Mystore.PageObject.Product_page_PO;
import com.Mystore.PageObject.View_Cart_PO;

public class TC_2_Add_Product_in_Cart extends BaseTestcases {
	@Test
	
	public void Add_Product_in_Cart() throws IOException {
		
		Exercise_page exer = new Exercise_page(dr);
		exer.productbutton();
		
		Product_page_PO Product = new Product_page_PO(dr);
		Product.img1();
		Product.cart1();
		Product.continueshop();
		Product.img2();
		Product.cart2();
		Product.cartview();
		
		View_Cart_PO Viewcart = new View_Cart_PO(dr);
		
		String top_verify = Viewcart.verifytop();
		String Price_Verify = Viewcart.Check_Price();
		String Total_verify = Viewcart.Check_Total();
		String Total_quantity = Viewcart.Check_Quantity();
		String Tshirt_Verify = Viewcart.Tshirt();
		String Price_Verify_2 = Viewcart.Check_Price_2();
		String Total_verify_2 = Viewcart.Check_Total_2();
		String Total_quantity_2 = Viewcart.Check_Quantity2();
		
		
		String expectedTop = "Top";
		String expectedPrice = "500";
		String expectedTotal = "500";
		String expectedPrice_2 = "400";
		String expectedTotal_2 = "400";
		String expectedQty = "1";
		String expectedTshirt = "T-shirt";
		
		if (
			    top_verify.contains(expectedTop) &&
			    Price_Verify.contains(expectedPrice) &&
			    Total_verify.contains(expectedTotal) &&
			    Total_quantity.contains(expectedQty) &&
			    Tshirt_Verify.contains(expectedTshirt) &&
			    Price_Verify_2.contains(expectedPrice_2) &&
			    Total_verify_2.contains(expectedTotal_2) &&
			    Total_quantity_2.contains(expectedQty)
			)
		{
		    SoftAssert soft = new SoftAssert();
		    soft.assertTrue(true);
		    System.out.println(top_verify +"\n"+Price_Verify+"\n"+Total_verify + "\n" +Total_quantity + "\n" +Tshirt_Verify +"\n" +Price_Verify_2+
		    		"\n" +Total_verify_2+ "\n" +Total_quantity_2);
		    
		} else {
		   SoftAssert else_assert = new SoftAssert();
		   else_assert.assertTrue(false);
		   CaptureScreenShot(dr, "Add_Product_in_Cart");
		}

	}
	
	

}
