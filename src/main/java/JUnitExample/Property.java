package JUnitExample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Property {
	String url = "";
	String key = "";
	String value = "";

	WebDriver driver;
	public Property(String url) {
		key = "webdriver.gecko.driver";
		value = "/Users/lehokimminh/Downloads/geckodriver";
		System.setProperty(key, value);

		driver = new FirefoxDriver();

		this.url = url;
		driver.get(url);
	}

}
