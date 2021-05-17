package Week5Lab3.AtHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Home {
	public static void main(String[] arsg) {
		String key = "webdriver.gecko.driver";
		String value = "/Users/lehokimminh/Downloads/geckodriver";
		System.setProperty(key, value);

		WebDriver driver = new FirefoxDriver();

		// Open this link
		String url = "https://www.techlistic.com/p/selenium-practice-form.html";
		driver.get(url);

		// Enter first and last name (text box).
		String xpathFirstNameIp = "//*[@id=\"post-body-3077692503353518311\"]/div/div/div[3]/input";
		driver.findElement(By.xpath(xpathFirstNameIp)).sendKeys("Le");
		String xpathLastNameIp = "//*[@id=\"post-body-3077692503353518311\"]/div/div/div[6]/input";
		driver.findElement(By.xpath(xpathLastNameIp)).sendKeys("Minh");

		//Select gender (radio button).
		String xpathGenderRb = "//*[@id=\"sex-1\"]";
		driver.findElement(By.xpath(xpathGenderRb)).click();

		//Select years of experience (radio button).
		String xpathYearsOfExpRb = "//*[@id=\"exp-0\"]";
		driver.findElement(By.xpath(xpathYearsOfExpRb)).click();

		//Enter date.
		String xpathDateIp = "//*[@id=\"datepicker\"]";
		driver.findElement(By.xpath(xpathDateIp)).sendKeys("2021-01-01");

		//Select Profession (Check box).
		String xpathProfessionCb = "//*[@id=\"profession-1\"]";
		driver.findElement(By.xpath(xpathProfessionCb)).click();

		// Select Automation tools you are familiar with (multiple check boxes).
		String xpathToolCb0 = "//*[@id=\"tool-0\"]";
		driver.findElement(By.xpath(xpathToolCb0)).click();
		String xpathToolCb2 = "//*[@id=\"tool-2\"]";
		driver.findElement(By.xpath(xpathToolCb2)).click();

		//Select Continent (Select box).
		Select continents = new Select(driver.findElement(By.id("continents")));
		continents.selectByVisibleText("Asia");
		
		//Click on Submit button.
		driver.findElement(By.id("submit")).click();;
		
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
