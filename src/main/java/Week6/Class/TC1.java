package Week6.Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC1 {
	public static void main(String[] arsg) {
		String key = "webdriver.gecko.driver";
		String value = "/Users/lehokimminh/Downloads/geckodriver";
		System.setProperty(key, value);

		WebDriver driver = new FirefoxDriver();

		String url = "https://www.google.com";
		driver.get(url);
		
		String xpathSearch = "/html/body/div[1]/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input";
		driver.findElement(By.xpath(xpathSearch)).sendKeys("techlistic");
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		String xpathListboxUl = "/html/body/div[1]/div[3]/form/div[2]/div[1]/div[2]/div[2]/ul";
		WebElement list = driver.findElement(By.xpath(xpathListboxUl));
		List<WebElement> rows = list.findElements(By.tagName("li"));
		for(WebElement row : rows) {
			System.out.println(row.getText());
		}
		
		driver.quit();
	}

}
