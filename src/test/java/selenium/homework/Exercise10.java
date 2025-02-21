package selenium.homework;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise10 extends Hooks{

	public static void main(String[] args) throws InterruptedException {
		
		setUp("safari");
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement searchField = driver.findElement(By.cssSelector("#Wikipedia1_wikipedia-search-input"));
		searchField.sendKeys("selenium (software)");
		WebElement searchButton = driver.findElement(By.cssSelector(".wikipedia-search-button"));
		searchButton.click();
		Thread.sleep(2000);
		WebElement seleniumLink = driver.findElement(By.linkText("Selenium (software)"));
		seleniumLink.click();
		Thread.sleep(2000);
		
		
		String parentWindow = driver.getWindowHandle();
		
		driver.switchTo().window(parentWindow);

		
		searchField.clear();
		searchField.sendKeys("eBay");
		
		searchButton.click();
		Thread.sleep(2000);
		
		WebElement ebayLink = driver.findElement(By.linkText("EBay"));
		ebayLink.click();
		Thread.sleep(2000);
		
		driver.switchTo().window(parentWindow);
		
		searchField.clear();
		searchField.sendKeys("Target Corporation");

		searchButton.click();
		Thread.sleep(2000);
		
		WebElement targetLink = driver.findElement(By.linkText("Target Corporation"));
		targetLink.click();
		Thread.sleep(2000);
		
		driver.switchTo().window(parentWindow);
		
		searchField.clear();
		searchField.sendKeys("Google");
		
		searchButton.click();
		Thread.sleep(2000);
		
		WebElement googletLink = driver.findElement(By.linkText("Google"));
		googletLink.click();
		Thread.sleep(2000);
		
		
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String windowID: allWindows) {
			driver.switchTo().window(windowID);
		
			String pageTitle = driver.getTitle();
			
			if(pageTitle.equals("Selenium (software) - Wikipedia")) {	
				WebElement seleniumPage = driver.findElement(By.xpath("//a[@href='https://selenium.dev/']"));		
				Thread.sleep(2000);
				seleniumPage.click();
			
				String seleniumTitle = driver.getTitle();
				
				WebElement documentation = driver.findElement(By.linkText("Documentation"));
				documentation.click();
				Thread.sleep(2000);

				
				driver.close();
			
			} else if(pageTitle.equals("eBay - Wikipedia")) {
				WebElement ebayPage = driver.findElement(By.xpath("//a[@href='https://www.ebay.com/']"));		
				Thread.sleep(2000);
				ebayPage.click();
			
				String ebayTitle = driver.getTitle();
			
				driver.close();
				
			} else if(pageTitle.equals("Target Corporation - Wikipedia")) {
				WebElement targetPage = driver.findElement(By.xpath("//a[@href='https://target.com/']"));		
				Thread.sleep(2000);
				targetPage.click();
			
				String targetTitle = driver.getTitle();
			
				driver.close();
				
			} else if(pageTitle.equals("Google - Wikipedia")) {
				WebElement googlePage = driver.findElement(By.xpath("//a[@href='https://about.google/']"));		
				Thread.sleep(2000);
				googlePage.click();
			
				String googletTitle = driver.getTitle();
			
				driver.close();
		}
		
		}
		
	


		
		
		tearDown();
	}
}
