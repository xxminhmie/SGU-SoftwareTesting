package Week4.AtHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TaoTaiKhoanGG {
	public static void main(String[] args) {
		String key = "webdriver.gecko.driver";
		String value = "/Users/lehokimminh/Downloads/geckodriver";
		System.setProperty(key, value);

		WebDriver driver = new FirefoxDriver();

		String url = "https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Faccounts.google.com%2FManageAccount%3Fnc%3D1&dsh=S-1795128096%3A1614590387954724&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp";
		driver.get(url);
	
		String xpathHo = "//*[@id=\"lastName\"]";
		driver.findElement(By.xpath(xpathHo)).sendKeys("Le");

		String xpathTen = "//*[@id=\"firstName\"]";
		driver.findElement(By.xpath(xpathTen)).sendKeys("Minh");
		
		String xpathTenNguoiDung = "//*[@id=\"username\"]";
		driver.findElement(By.xpath(xpathTenNguoiDung)).sendKeys("minh7526173");

		String xpathMatKhau = "//*[@id=\"passwd\"]/div[1]/div/div[1]/input";
		driver.findElement(By.xpath(xpathMatKhau)).sendKeys("minh7526173");

		String xpathXacNhan = "//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input";
		driver.findElement(By.xpath(xpathXacNhan)).sendKeys("minh7526173");
		
		String xpathSubmit = "//*[@id=\"accountDetailsNext\"]/div/button/div[2]";
		driver.findElement(By.xpath(xpathSubmit));
		
		driver.quit();
	}
}
