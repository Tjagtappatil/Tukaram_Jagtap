package com.Pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Cart {

	@FindBy(how=How.XPATH,using="//a[@class='shopping_cart_link']")
	private WebElement cart_btn;
	
	@FindBy(how=How.XPATH,using="//button[@id='checkout']")
	private WebElement checkout;
	
	@FindBy(how=How.XPATH,using="//input[@id='first-name']")
	private WebElement first_name;
	
	@FindBy(how=How.XPATH,using="//input[@id='last-name']")
	private WebElement last_name;
	
	@FindBy(how=How.XPATH,using="//input[@id='postal-code']")
	private WebElement zip;
	
	@FindBy(how=How.XPATH,using="//input[@name='continue']")
	private WebElement continu;
	
	@FindBy(how=How.XPATH,using="//button[@id='finish']")
	private WebElement finish;
	
	@FindBy(how=How.XPATH,using="//button[@name='back-to-products']")
	private WebElement back;

	
	
	public WebElement getBack() {
		return back;
	}
	
	
	public WebElement getCart_btn() {
		return cart_btn;
	}

	

	public WebElement getCheckout() {
		return checkout;
	}

	

	public WebElement getFinish() {
		return finish;
	}


	public WebElement getFirst_name() {
		return first_name;
	}

	

	public WebElement getLast_name() {
		return last_name;
	}

	

	public WebElement getZip() {
		return zip;
	}

	

	public WebElement getContinu() {
		return continu;
	}

	
	
	
	
	
	
	
	
	
	
}
