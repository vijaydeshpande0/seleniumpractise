package Selemium.Revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverBrowserMethods {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");  
		driver.get("https://in.yahoo.com/?p=us");
		
		//to navigate back to previous page
		driver.navigate().back();
		
		// to navigate to next page
		driver.navigate().forward();
		
		// to close current browser
		driver.close();
		
		// to close all the browsers opened by selenium script
		//driver.quit();
	}

}
