package com.testclasses;

import java.io.FileNotFoundException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pom.LoginPom;

public class LoginTest extends BaseClass {
	

	@BeforeMethod
	public void setUp() {
		try {
			launchTheWeb();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(10000);
		driver.quit();
	}

	@Test

	public void loginTest() {

		LoginPom login = new LoginPom();
	System.out.println("..........................");
	login.setInputUsername(login.getUsername());
		login.setInputPassword(login.getPassword());
		login.clickOnButton();

	}
}