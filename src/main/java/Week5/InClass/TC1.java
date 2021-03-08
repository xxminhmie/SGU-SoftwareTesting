package Week5.InClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC1 {
	public static void main(String[] arsg) {
		String key = "webdriver.gecko.driver";
		String value = "/Users/lehokimminh/Downloads/geckodriver";
		System.setProperty(key, value);

		WebDriver driver = new FirefoxDriver();

		String url = "https://www.amazon.in";
		driver.get(url);
		
		/*
		 * Maximize size of browser window.
		 */
		driver.manage().window().maximize();
		
		
		String ttHome = driver.getTitle();
		System.out.println("Number 4: "+ttHome);
		
		String xpathAmazonPay = "//*[@id='nav-xshop']/a[9]";
		driver.findElement(By.xpath(xpathAmazonPay)).click();
		
		String ttAP = driver.getTitle();
		System.out.println("Number 6: "+ttAP);
		
		//back to the home page
		driver.navigate().back();  
		

		String ttBack = driver.getTitle();
		System.out.println("Number 8: "+ttBack);
		

		if(ttBack.equals(ttHome)) {
			System.out.println("Matches!");
		}else {
			System.out.println("Not match!");

		}
		driver.quit();
	}
}
