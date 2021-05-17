package Week4Lab2.AtHome.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC3 {

	public static void main(String[] arsg) {
		String key = "webdriver.gecko.driver";
		String value = "/Users/lehokimminh/Downloads/geckodriver";
		System.setProperty(key, value);

		WebDriver driver = new FirefoxDriver();
		String url = "https://vn.godaddy.com";
		driver.get(url);
		
		/*
		 * Maximize size of browser window.
		 */
		driver.manage().window().maximize();
		
		
		
		String tt = driver.getTitle();
		System.out.println(tt);


		driver.quit();
	}
}
