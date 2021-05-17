package Capture;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Screenshot {
	@Test
	public void testScreenShot() {
		String key = "webdriver.gecko.driver";
		String value = "/Users/lehokimminh/Downloads/geckodriver";
		System.setProperty(key, value);

		WebDriver driver = new FirefoxDriver();

		String url = "http://demo.guru99.com/V4/";
		driver.get(url);
		
        this.takeSnapShot(driver, "/Users/lehokimminh/Downloads/test.png") ;   
        
		driver.quit();
	}

	public static void takeSnapShot(WebDriver driver, String fileWithPath) {
		TakesScreenshot shot = ((TakesScreenshot) driver);
		File shotFile = shot.getScreenshotAs(OutputType.FILE);
		File destFile = new File(fileWithPath);
		
		try {
			FileUtils.copyFile(shotFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
