package Week4.AtClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
public class Bai1 {

	public static void main(String[] arsg) {
		String key = "webdriver.gecko.driver";
		String value = "/Users/lehokimminh/Downloads/geckodriver";
		System.setProperty(key, value);
    	
		WebDriver driver = new FirefoxDriver();
		
		String url = "https://www.verizon.com";
		driver.get(url);
		driver.findElement(By.id("gnav20-account-menu")).click();
		
		String xpathExpression = "//*[@id=\"gnav20-sign-in\"]/ul/li[2]/a";
		driver.findElement(By.xpath(xpathExpression)).click();

		driver.quit();
	}
}
