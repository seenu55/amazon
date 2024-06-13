package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassLuma {
	
	public static  WebDriver driver;
	
	public static void BrowserLanuch() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void getURL(String url) {
		driver.get(url);
	}
	
	

}
