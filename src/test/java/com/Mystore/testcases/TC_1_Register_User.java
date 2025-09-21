package com.Mystore.testcases;

import java.io.IOException;

import org.apache.hc.core5.util.Asserts;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Mystore.PageObject.Account_created_PO;
import com.Mystore.PageObject.Delete_account_PO;
import com.Mystore.PageObject.Exercise_page;
import com.Mystore.PageObject.Login_page;
import com.Mystore.PageObject.Signup_page_object;
import com.Mystore.PageObject.Verify_username_Visible_PO;


public class TC_1_Register_User extends BaseTestcases {
	@Test(enabled = false)
	public void verifyregistration(){

		Exercise_page ex = new Exercise_page(dr) ;

		ex.signup();

		Login_page lp = new Login_page(dr);
		lp.name("Faizan");
		lp.Email("faizan191300@gmail.com");
		lp.signin();

		Signup_page_object sp = new Signup_page_object(dr);
		sp.entergen();
		sp.enterpassword("Ad123##$$");
		sp.enterFirstnane("Faizan");
		sp.enterLastname("Ansari");
		sp.enterAddress("B-13,Worli");
		sp.enterCountry("India");
		sp.enterState("Maharashtra");
		sp.enterCity("Mumbai");
		sp.enterZipcode("400018");
		sp.enterMobilenumber("7208039966");
		sp.entercreatebutton();

		Account_created_PO ac = new Account_created_PO(dr);
		ac.EnterContiue();

		Verify_username_Visible_PO vs = new Verify_username_Visible_PO(dr);
		String username = 	vs.Visi();

		Assert.assertEquals("Faizan", username);

		System.out.println(username);
		vs.Enterdelete();

		Delete_account_PO da = new Delete_account_PO(dr);
		String deleted=	da.enteracctdeleted();
		SoftAssert soft = new SoftAssert();
		soft.assertEquals("ACCOUNT DELETED!", deleted);
		System.out.println(deleted);
		soft.assertAll();

		//Assert.assertEquals("Account Deleted!", deleted);
		da.clickcontibutt();

	}

	@Test
	public void loginUser() throws IOException {
		Exercise_page exp = new Exercise_page(dr) ;
		
		exp.signup();
		
		Login_page lp = new Login_page(dr);
		lp.Enteredemailadd("faizansary2025@gmail.com");
		lp.Enteredpass("Ad123##$$");
		lp.Loginbutton();
		
		Verify_username_Visible_PO verify = new Verify_username_Visible_PO(dr);
		String username = verify.Visi();
		if(username.equals("Faizan Ansari")) {
			SoftAssert st = new SoftAssert();
			st.assertTrue(true);
			System.out.println(username);
			st.assertAll();
		}
		else {
			SoftAssert sat = new SoftAssert();
			sat.assertTrue(false);
			CaptureScreenShot(dr, "loginUser");	
			System.out.println(username);
			sat.assertAll();
		}
		
		verify.Enterdelete();
		
		Delete_account_PO dp = new Delete_account_PO(dr);
		String delete = dp.enteracctdeleted();
		if (delete.equals("ACCOUNT DELETED!")) {
			SoftAssert softs = new SoftAssert();
			softs.assertTrue(true);
			System.out.println(delete);
			softs.assertAll();
		}
		else {
			SoftAssert soft = new SoftAssert();
			soft.assertTrue(false);
			CaptureScreenShot(dr, "loginUser");	
			System.out.println(delete);
			soft.assertAll();
		}
	
		
		dp.clickcontibutt();
		
	}

}