package Week5.AtHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Home {
	public static void main(String[] arsg) {
		String key = "webdriver.gecko.driver";
		String value = "/Users/lehokimminh/Downloads/geckodriver";
		System.setProperty(key, value);

		WebDriver driver = new FirefoxDriver();

		String url = "https://www.techlistic.com/p/selenium-practice-form.html";
		driver.get(url);
		
		String xpathFirstNameIp = "//*[@id=\"post-body-3077692503353518311\"]/div/div/div[3]/input";
		driver.findElement(By.xpath(xpathFirstNameIp)).sendKeys("Le");
		
		String xpathLastNameIp = "//*[@id=\"post-body-3077692503353518311\"]/div/div/div[6]/input";
		driver.findElement(By.xpath(xpathLastNameIp)).sendKeys("Minh");
		
		String xpathGenderRb = "//*[@id=\"sex-1\"]";
		driver.findElement(By.xpath(xpathGenderRb)).click();

		String xpathYearsOfExpRb = "//*[@id=\"exp-0\"]";
		driver.findElement(By.xpath(xpathYearsOfExpRb)).click();
		
		String xpathDateIp = "//*[@id=\"datepicker\"]";
		driver.findElement(By.xpath(xpathDateIp)).sendKeys("2021-01-01");
		
		String xpathProfessionCb = "//*[@id=\"profession-1\"]";
		driver.findElement(By.xpath(xpathProfessionCb)).click();
		
		String xpathToolCb = "//*[@id=\"tool-2\"]";
		driver.findElement(By.xpath(xpathToolCb)).click();
		
		
        

		
		driver.quit();
	}

}
