package POM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {
	WebDriver driver;

	public Dashboard(WebDriver driver) {
		this.driver = driver;
	}

	By heading = By.xpath("//div[@class=]\"main-header\"]");
	By logoutBtn = By.id("submit");

	By searchField = By.id("searchBox");
	By searchBtn = By.xpath("//*[@id=\\\"basic-addon2\\\"]");

	public String getHeading() {
		String head = driver.findElement(heading).getText();
		return head;
	}

	public void clickLogout() {
		driver.findElement(logoutBtn).click();
	}

	public void enterSearchStr(String str) {
		driver.findElement(searchField).sendKeys(str);
		System.out.println("The search string is : " + str);
		driver.findElement(searchBtn).click();
	}

}
