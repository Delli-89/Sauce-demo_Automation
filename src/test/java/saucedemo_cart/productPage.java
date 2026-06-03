package saucedemo_cart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class productPage
{
	WebDriver driver;
	WebDriverWait wait;
	 
	public productPage(WebDriver driver)
	{
		this.driver=driver;    
		this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void addItemToCart()
	{
		WebElement item1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Sauce Labs Backpack']")));
		item1.click();
		
		WebElement addToCart1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add to cart']")));
		addToCart1.click();
		
		WebElement item=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='back-to-products']")));
		item.click();
		
		//button[@id='back-to-products']
		
		WebElement item2=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']")));
		item2.click();
		
		WebElement addToCart2=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add to cart']")));
		addToCart2.click();
	}
}
