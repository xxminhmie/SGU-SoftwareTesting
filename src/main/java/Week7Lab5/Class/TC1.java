package Week7Lab5.Class;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TC1 {
	public static void main(String[] arsg) {
		String key = "webdriver.gecko.driver";
		String value = "/Users/lehokimminh/Downloads/geckodriver";
		System.setProperty(key, value);

		WebDriver driver = new FirefoxDriver();

		String url = "http://automationpractice.com/index.php";
		driver.get(url);

		String xpathSignIn = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a";
		driver.findElement(By.xpath(xpathSignIn)).click();

		// To Delay execution for 3 seconds . as to view the resize browser
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * 
		 */
		String xpathEmailIp = "//*[@id=\"email\"]";
		driver.findElement(By.xpath(xpathEmailIp)).sendKeys("minhmie@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("xxminhmie");
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
		// To Delay execution for 3 seconds . as to view the resize browser
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * 
		 */
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();

		// To Delay execution for 3 seconds . as to view the resize browser
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * 
		 */
		// Vị trí của phần tử mà bạn muốn scroll xuống
		WebElement element = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div"));

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();

		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]/span")).click();
		// To Delay execution for 3 seconds . as to view the resize browser
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]")).click();

		// State
		Select states = new Select(driver.findElement(By.xpath("//*[@id=\"group_1\"]")));
		states.selectByValue("3");

		driver.findElement(By.xpath("//*[@id=\"color_14\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button")).click();

		// To Delay execution for 3 seconds . as to view the resize browser
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2")).getText());

		driver.quit();
	}

}
