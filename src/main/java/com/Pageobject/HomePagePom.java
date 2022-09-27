package com.Pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePagePom {

	@FindBy(how=How.XPATH,using="(//div[@class='inventory_item_name'])[1]")
	private WebElement Sauce_Bag;
	
	@FindBy(how=How.XPATH,using="//button[@name='add-to-cart-sauce-labs-backpack']")
	private WebElement add_cart_btn;

	public WebElement getSauce_Bag() {
		return Sauce_Bag;
	}

	
	public WebElement getAdd_cart_btn() {
		return add_cart_btn;
	}

	
	
	
	
	
	
}
