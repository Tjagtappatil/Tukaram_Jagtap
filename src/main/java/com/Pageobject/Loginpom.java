package com.Pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpom {

	@FindBy(how=How.XPATH,using="//input[@name='user-name']")
	private WebElement username;
	
	@FindBy(how=How.XPATH,using="//input[@id='password']")
	private WebElement password;
	
	@FindBy(how=How.XPATH,using="//input[@id='login-button']")
	private WebElement login_button;

	public WebElement getUsername() {
		return username;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getLogin_button() {
		return login_button;
	}

	
	
	
	
	
	
}
