package saucedemo_cart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginpage {

		WebDriver driver;
		WebDriverWait wait;
		 
		public loginpage(WebDriver driver)
		{
			this.driver=driver;    //"this .driver refers to the instance of variable"
			this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		}
	
		public void login(String usernameStr, String passwordStr)
		{
			WebElement username=wait.until(ExpectedConditions.elementToBeClickable(By.id("user-name")));
			username.sendKeys(usernameStr);
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys(passwordStr);
			
			WebElement login=driver.findElement(By.id("login-button"));
			login.click();
		}

}
