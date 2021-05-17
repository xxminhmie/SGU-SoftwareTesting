package xxminhmie.finalproject.HeadlessBrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;



public class HtmlDemoProgram1 {
	public static void main(String[] args) {
		HtmlUnitDriver driver = new HtmlUnitDriver();
		driver.get("http://www.facebook.com");

		System.out.println("Title of the page " + driver.getTitle());
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("mukeshotwani.50@gmail.com");

		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("pjs@903998");

		WebElement signup_button = driver.findElement(By.name("login"));
		signup_button.click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("After login title is = " + driver.getTitle());

	}

}
