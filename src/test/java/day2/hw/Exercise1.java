package day2.hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise1 extends Hooks{
		
		public static void main(String[] args) {
			
			
			setUp("safari");
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			WebElement userName = driver.findElement(By.name("username"));
			userName.sendKeys("admin");
			
			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys("admin123");
			
			WebElement logIn = driver.findElement(By.xpath("//button[@type='submit']"));
			logIn.click();
			
			WebElement headerText = driver.findElement(By.cssSelector("div[class='orangehrm-login-branding']"));
			
			String text = headerText.getText();
			
			
			
			
			tearDown();
			
			
			
			
			
			
			
			
		}
	

	

		

	

	

}
