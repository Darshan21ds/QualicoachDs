package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BadgeDownload {
	public WebDriver driver;
	
	By closeModule = By.xpath("//li[@class='allsectionnames'] //a[contains(text(),'Module 6')]");
	By badgeAndFb = By.xpath("//li[@class='allsectionnames'] //a[contains(text(),'Badge and Feedback')]");
	By claimBadge = By.xpath("//div[contains(text(),'Click here to claim your Gold badge')]");		 

	public BadgeDownload(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement closeModule() {
		return driver.findElement(closeModule);
	}
	
	public WebElement badgeAndFb() {
		return driver.findElement(badgeAndFb);
	}
	
	public WebElement claimBadge() {
		return driver.findElement(claimBadge);
	}

}