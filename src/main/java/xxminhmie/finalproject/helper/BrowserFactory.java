package xxminhmie.finalproject.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	public static WebDriver startBrowser(String url) {
		String key = "webdriver.gecko.driver";
		String value = "/Users/lehokimminh/Downloads/geckodriver";
		System.setProperty(key, value);

		WebDriver driver = new FirefoxDriver();

		driver.get(url);
		return driver;
	}
}
