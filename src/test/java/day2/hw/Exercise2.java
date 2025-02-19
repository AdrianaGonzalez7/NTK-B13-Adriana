package day2.hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise2 extends Hooks {

	public static void main(String[] args) throws InterruptedException {

		setUp("safari");

		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(2000);

		WebElement registerBtn = driver.findElement(By.xpath("//a[text()='REGISTER']"));
		registerBtn.click();
		Thread.sleep(2000);

		WebElement pageTitle = driver.findElement(By.xpath("//img[@alt='Mercury Tours']"));
			boolean isPageTitleDisplayed = 	pageTitle.isDisplayed();
		
		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.sendKeys("first name");
		
		WebElement lastName = driver.findElement(By.name("lastName"));
		lastName.sendKeys("last name");
		
		WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys("555-555");
		
		WebElement email = driver.findElement(By.id("userName"));
		email.sendKeys("email....");
		
		WebElement address = driver.findElement(By.name("address1"));
		address.sendKeys("address");
		
		
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("city");
		
		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("state");
		
		WebElement zip = driver.findElement(By.name("postalCode"));
		zip.sendKeys("zip");
		
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("user name");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("password");
		
		WebElement confirm = driver.findElement(By.name("confirmPassword"));
		confirm.sendKeys("confirm");
		
		WebElement submitBtn = driver.findElement(By.name("submit"));
		submitBtn.click();

		WebElement message = driver.findElement(By.xpath("//font[text()='']"));

		
		
		
		
		
		
		
		
		
		
		
		
		tearDown();

	}
}
