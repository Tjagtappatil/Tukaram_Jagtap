package com.Pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SideBar {

	@FindBy(how=How.XPATH,using="//button[@id='react-burger-menu-btn']")
	private WebElement side_btn;
	
	@FindBy(how=How.XPATH,using="(//a[@class='bm-item menu-item'])[3]")
	private WebElement logout;

	
	public WebElement getSide_btn() {
		return side_btn;
	}

	

	public WebElement getLogout() {
		return logout;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
