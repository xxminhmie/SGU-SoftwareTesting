package Week5Lab3.AtClass;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC2 {
	public static void main(String[] arsg) {
		String key = "webdriver.gecko.driver";
		String value = "/Users/lehokimminh/Downloads/geckodriver";
		System.setProperty(key, value);

		WebDriver driver = new FirefoxDriver();

		String url = "https://www.amazon.in";
		driver.get(url);
		
        String[] title = {
        		"Best Sellers","Mobiles","Today's Deals","Fashion","New Releases","Prime","Electronics","Customer Service","Amazon Pay"
        };
        
		for(int i=0;i<title.length; i++) {
	        String getTitle = null;
	        
			String xpathAmazonPay = "//*[@id='nav-xshop']/a["+(i+1)+"]";
			driver.findElement(By.xpath(xpathAmazonPay)).click();
			
			getTitle = driver.getTitle();
			
			if(title[i].equals(getTitle)) {
				System.out.println("Matches!");
			}else {
				System.out.println(title[i]+" ### "+getTitle);
				System.out.println("Not match!");

			}
			driver.navigate().back();  
		}

		
		driver.quit();
	}
}
