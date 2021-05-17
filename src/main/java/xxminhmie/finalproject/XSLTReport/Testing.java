package xxminhmie.finalproject.XSLTReport;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testing {
	
	WebDriver driver;

	@BeforeTest
	public void init(){
		String key = "webdriver.gecko.driver";
		String value = "/Users/lehokimminh/Downloads/geckodriver";
		System.setProperty(key, value);
		driver = new FirefoxDriver();
	}
	@Test(priority = 1)
	public void Login() {
		driver.get("http://demo.guru99.com/V4/");

		driver.findElement(By.name("uid")).sendKeys("mngr326122");
		driver.findElement(By.name("password")).sendKeys("ErUhejy");
		driver.findElement(By.name("btnLogin")).click();
		
		// Verifying the manager home page
		Assert.assertEquals(driver.getTitle(), "Guru99 Bank Manager HomePage");
	}

	@Test(priority = 2)
	public void verifytitle() {
		// Verifying the title of the home page
		Assert.assertEquals(driver.getTitle(), "Guru99 Bank Manager HomePage");
	}

	@Test(priority = 3)
	public void Logout() {
		driver.findElement(By.linkText("Log out")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		// Verifying the title of the logout page
		Assert.assertEquals(driver.getTitle(), "Guru99 Bank Home Page");
	}
}