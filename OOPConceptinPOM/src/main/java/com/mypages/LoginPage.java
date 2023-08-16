package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
	
	//page locators:
	private By emailId = By.id("username");
	private By password = By.id("password");
	private By loginButton = By.id("loginBtn");
	private By header = By.xpath("//i18n-string[@data-key=\"login.signupLink.text\"]");
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//public getters:
	/**
	 * @return the emailId
	 */
	public WebElement getEmailId() {
		return getElement(emailId);
	}


	/**
	 * @return the password
	 */
	public WebElement getPassword() {
		return getElement(password);
	}


	/**
	 * @return the loginButton
	 */
	public WebElement getLoginButton() {
		return getElement(loginButton);
	}


	/**
	 * @return the header
	 */
	public WebElement getHeader() {
		return getElement(header);
	}

	public String getLoginPageTitle() {
		return getPageTitle();
	}
	
	public String getLoginPageHeader() {
		return getPageHeader(header);
	}
	
	public HomePage doLogin(String username, String pwd) {
		getEmailId().sendKeys(username);
		getPassword().sendKeys(pwd);
		getLoginButton().click();
		
		return getInstance(HomePage.class);
	}
	
	public HomePage doLogin() {
		getEmailId().sendKeys("");
		getPassword().sendKeys("");
		getLoginButton().click();
		
		return getInstance(HomePage.class);
	}
		
	//username
	public void doLogin(String userCred) {
		
		if(userCred.equals("username")) {
		getEmailId().sendKeys(userCred.split(":")[1].trim());
		}else if(userCred.contains("password")) {
		getEmailId().sendKeys(userCred.split(":")[1].trim());
		}
		getLoginButton().click();
		}
	
	

}