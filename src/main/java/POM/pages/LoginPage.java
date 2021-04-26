package POM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By uName = By.id("userName");
	By password = By.id("password");
	By loginBtn = By.id("login");
	
	public void enterUsername(String user) {
		driver.findElement(uName).sendKeys(user);
	}
	
	public void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	public void clickLogin() {
		driver.findElement(loginBtn).click();
	}
}
