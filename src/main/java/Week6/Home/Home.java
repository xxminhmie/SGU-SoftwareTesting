package Week6.Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Home {
	public static void main(String[] arsg) {
		String key = "webdriver.gecko.driver";
		String value = "/Users/lehokimminh/Downloads/geckodriver";
		System.setProperty(key, value);

		WebDriver driver = new FirefoxDriver();

		String url = "http://automationpractice.com/index.php";
		driver.get(url);

		String xpathSignIn = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a";
		driver.findElement(By.xpath(xpathSignIn)).click();

		String xpathEmailIp = "//*[@id=\"email_create\"]";
		driver.findElement(By.xpath(xpathEmailIp)).sendKeys("minhmie");

		String xpathCreateBtn = "//*[@id=\"SubmitCreate\"]";
		driver.findElement(By.xpath(xpathCreateBtn)).click();

		// To Delay execution for 3 seconds . as to view the resize browser
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement error = driver.findElement(By.xpath("//*[@id=\"create_account_error\"]"));
		if (error != null) {
			System.out.println(error.getText());
		}

		driver.quit();
	}

}
