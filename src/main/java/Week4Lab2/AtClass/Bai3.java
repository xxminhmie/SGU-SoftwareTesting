package Week4Lab2.AtClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bai3 {
	public static void main(String[] arsg) {
		String key = "webdriver.gecko.driver";
		String value = "/Users/lehokimminh/Downloads/geckodriver";
		System.setProperty(key, value);

		WebDriver driver = new FirefoxDriver();

		String url = "https://www.flipkart.com";
		driver.get(url);

		String xpathCloseBlock = "/html/body/div[2]/div/div/button";
		driver.findElement(By.xpath(xpathCloseBlock)).click();

		String xpathTfSearch = "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input";
		driver.findElement(By.xpath(xpathTfSearch)).sendKeys("laptop dell");

		String xpathSubmitBtn = "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button";
		driver.findElement(By.xpath(xpathSubmitBtn)).click();
		;

		driver.quit();
	}
}
