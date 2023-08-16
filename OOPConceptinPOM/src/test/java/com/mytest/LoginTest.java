/**
 * 
 */
package com.mytest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mypages.HomePage;
import com.mypages.LoginPage;

/**
 * @author ghaya
 *
 */
public class LoginTest extends BaseTest{
	
	@Test
	public void verifyLoginPageTitleTest() {
		String title = page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println("title");
		Assert.assertEquals(title, "HubSpot Login");
	}
	
	@Test
	public void verifyLoginPageHeaderTest() {
		String header = page.getInstance(LoginPage.class).getLoginPageHeader();
		System.out.println("header");
		Assert.assertEquals(header, "Don't have an account?");
	}
	
	@Test
	public void doLoginTest() {
	HomePage homePage =	page.getInstance(LoginPage.class).doLogin("naveenanimation20@gmail.com","Test@12345");
	String headerHome = homePage.getHomePageHeader();
	System.out.println(headerHome);
	Assert.assertEquals(headerHome,"Getting started with HubSpot" );
	}
}
