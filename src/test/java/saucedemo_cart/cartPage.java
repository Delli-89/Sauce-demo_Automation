package saucedemo_cart;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cartPage 
{
		WebDriver driver;
		WebDriverWait wait;
		public cartPage(WebDriver driver)
		{
			this.driver=driver;    
			this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		}

		public void proceedToCheckout()
		{
			WebElement cart=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='shopping_cart_link']")));
			cart.click();
			
			WebElement checkout=wait.until(ExpectedConditions.elementToBeClickable(By.id("checkout")));
			checkout.click();
		}

}
