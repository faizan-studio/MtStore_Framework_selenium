package com.Mystore.testcases;

import org.testng.annotations.Test;

import com.Mystore.PageObject.Exercise_page;

public class TC__Login_User extends BaseTestcases{
	@Test
	public void verifyLogin() {
		dr.get(url);
		Exercise_page ex = new Exercise_page(dr) ;

		ex.signup();
	}
}
