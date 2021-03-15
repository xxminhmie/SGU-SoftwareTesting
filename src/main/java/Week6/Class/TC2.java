package Week6.Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC2 {
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
		driver.findElement(By.xpath(xpathEmailIp)).sendKeys("minhmie@gmail.com");

		String xpathCreateBtn = "//*[@id=\"SubmitCreate\"]";
		driver.findElement(By.xpath(xpathCreateBtn)).click();

		WebElement error = driver.findElement(By.xpath("//*[@id=\"create_account_error\"]"));
		if (error != null) {
			System.out.println("Account is created!");
		} else {
			// To Delay execution for 3 seconds . as to view the resize browser
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// Enter your Personal Information, Address and Contact info.
			String xpathTitle = "//*[@id=\"id_gender2\"]";
			driver.findElement(By.xpath(xpathTitle)).click();

			driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys("Le");
			driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("Minh");
			driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("xxminhmie");
			driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Le");
			driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Minh");
			driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("123 Nguyen Trai Street");
			driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Ho Chi Min City");

			// State
			Select states = new Select(driver.findElement(By.xpath("//*[@id=\"id_state\"]")));
			states.selectByValue("32");

			driver.findElement(By.xpath("//*[@id=\"postcode\"]")).sendKeys("70001");
			driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]")).sendKeys("0908787778");
			driver.findElement(By.xpath("//*[@id=\"submitAccount\"]")).click();

			// To Delay execution for 3 seconds . as to view the resize browser
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		driver.quit();
	}
}
