package saucedemo_cart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class checkOutpage
{
	WebDriver driver;
	WebDriverWait wait;
	 
	public checkOutpage(WebDriver driver)
	{
		this.driver=driver;    
		this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void fillDetailsAndFinish(String first, String last, String zip)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first-name"))).sendKeys(first);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("last-name"))).sendKeys(last);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postal-code"))).sendKeys(zip);
		
		WebElement continueBtn=wait.until(ExpectedConditions.elementToBeClickable(By.id("continue")));
		continueBtn.click();
		
		WebElement finish=wait.until(ExpectedConditions.elementToBeClickable(By.id("finish")));
		finish.click();
	}


}
