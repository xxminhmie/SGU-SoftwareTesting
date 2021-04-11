package Week9.Lab7;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void testTitle() {
		String key = "webdriver.gecko.driver";
		String value = "/Users/lehokimminh/Downloads/geckodriver";
		System.setProperty(key, value);

		WebDriver driver = new FirefoxDriver();

		String url = "https://demo.owncloud.org/login";
		driver.get(url);

		String actuals = driver.getTitle();
		String expecteds = "Tuoi tre";
//		System.out.println("Title: "+title);
		Assert.assertEquals(expecteds, actuals);


		driver.quit();

	}

	@Test
	public void testLogin() {
		String xpathUsername = "//*[@id=\"user\"]";
		String xpathPassword = "//*[@id=\"password\"]";
		String xpathSubmitBtn = "//*[@id=\"submit\"]";
		
		String key = "webdriver.gecko.driver";
		String value = "/Users/lehokimminh/Downloads/geckodriver";
		System.setProperty(key, value);

		WebDriver driver = new FirefoxDriver();

		String url = "https://demo.owncloud.org/login";
		driver.get(url);
		
		WebElement username = driver.findElement(By.xpath(xpathUsername));
		username.clear();
		username.sendKeys("demo");
		
		WebElement password = driver.findElement(By.xpath(xpathPassword));
		password.clear();
		password.sendKeys("demo");
		
		
		driver.findElement(By.xpath(xpathSubmitBtn)).click();


		// To Delay execution for 3 seconds . as to view the resize browser
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		driver.quit();
		
			
		
	}
}
