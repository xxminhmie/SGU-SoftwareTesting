package Week4.AtHome.TestCase;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC2 {
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

		// To Delay execution for 3 sec. as to view the resize browser
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 * Set size of browser window.
		 */
		Dimension d = new Dimension(300, 1080);
		// Resize current window to the set dimension
		driver.manage().window().setSize(d);

		// To Delay execution for 3 sec. as to view the resize browser
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

}
