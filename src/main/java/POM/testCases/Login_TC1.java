package POM.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import POM.pages.Dashboard;
import POM.pages.HomePage;
import POM.pages.LoginPage;

public class Login_TC1 {

	public static void main(String[] args) {
		String key = "webdriver.gecko.driver";
		String value = "/Users/lehokimminh/Downloads/geckodriver";
		System.setProperty(key, value);

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.demoqa.com/books");

		HomePage home = new HomePage(driver);
		LoginPage login = new LoginPage(driver);
		Dashboard dashboard = new Dashboard(driver);

		home.clickLogin();

		login.enterUsername("gunjankaushik");
		login.enterPassword("Password@123");
		login.clickLogin();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("The page heading is --- " +dashboard.getHeading());

		dashboard.enterSearchStr("java");
		dashboard.clickLogout();

		driver.quit();
		

	}

}
