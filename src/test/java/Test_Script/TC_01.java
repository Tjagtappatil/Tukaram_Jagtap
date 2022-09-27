package Test_Script;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Pageobject.Cart;
import com.Pageobject.HomePagePom;
import com.Pageobject.Loginpom;
import com.Pageobject.SideBar;
import com.Utility.BaseClass;

public class TC_01 extends BaseClass {

	@Test
	public void Test_Script() throws Exception 
	{
		Loginpom login=PageFactory.initElements(driver, Loginpom.class);
		
		//Login Page Module
		login.getUsername().sendKeys("standard_user");  //Send Username value
		Thread.sleep(2000);
		login.getPassword().sendKeys("secret_sauce");  //Send Password value
		Thread.sleep(2000);
		login.getLogin_button().click();  //Click on login button
		Thread.sleep(2000);
		
		//Home Page Module
		HomePagePom home=PageFactory.initElements(driver, HomePagePom.class);
		home.getSauce_Bag().click();  //Click on Sauce Labs Backpack
		Thread.sleep(2000);
		home.getAdd_cart_btn().click();  //Click on add to cart button
		Thread.sleep(2000);
		
		//Cart Module
		Cart cart=PageFactory.initElements(driver, Cart.class);
		cart.getCart_btn().click();  //Click on cart button
		Thread.sleep(2000);
		cart.getCheckout().click();  //Click on checkout button
		Thread.sleep(2000);
		cart.getFirst_name().sendKeys("Tukaram");
		Thread.sleep(2000);
		cart.getLast_name().sendKeys("Jagtap");
		Thread.sleep(2000);
		cart.getZip().sendKeys("123456");
		Thread.sleep(2000);
		cart.getContinu().click(); //click on continue
		Thread.sleep(2000);
		cart.getFinish().click();
		Thread.sleep(2000);
		cart.getBack().click();
		
		//Side bar 
		SideBar side_bar=PageFactory.initElements(driver, SideBar.class);
		side_bar.getSide_btn().click();  //Click on sidebar button
		side_bar.getLogout().click();
		
		
		
		
		
		
		
		
		
		
		
	}	

}
