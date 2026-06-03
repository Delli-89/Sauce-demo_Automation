package saucedemo_cart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class mainRunner {

	public static void main(String[] args)
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("incognito");
		WebDriver driver=new ChromeDriver(options);
		
		//WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		loginpage login=new loginpage(driver);
		login.login("standard_user", "secret_sauce");
		
		productPage product=new productPage(driver);
		product.addItemToCart();
		
		cartPage cart=new cartPage(driver);
		cart.proceedToCheckout();
		
		checkOutpage checkout=new checkOutpage(driver);
		checkout.fillDetailsAndFinish("Priya", "P", "600048");
		
		System.out.println("Thank you for your order");
		
		driver.quit();		
	}

}
