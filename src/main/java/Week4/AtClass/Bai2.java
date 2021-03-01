package Week4.AtClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bai2 {
	
	public static void main(String[] arsg) {
		String key = "webdriver.gecko.driver";
		String value = "/Users/lehokimminh/Downloads/geckodriver";
		System.setProperty(key, value);
    	
		WebDriver driver = new FirefoxDriver();
		
		String url = "https://secure.verizon.com/vzauth/UI/Login";
		driver.get(url);
				
		String xpathUsername = "//*[@id=\"IDToken1\"]";
		driver.findElement(By.xpath(xpathUsername)).sendKeys("username");

		String xpathPassword = "//*[@id=\"IDToken2\"]";
		driver.findElement(By.xpath(xpathPassword)).sendKeys("password");

		String xpathSignInBtn = "//*[@id=\"login-submit\"]";
		driver.findElement(By.xpath(xpathSignInBtn)).click();;
		
		driver.quit();
	}

}
