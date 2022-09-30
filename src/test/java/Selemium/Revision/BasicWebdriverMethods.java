package Selemium.Revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicWebdriverMethods {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		// two ways to hit url on the browser
		driver.get("https://www.google.com/");  //1
		//driver.navigate().to("https://www.google.com/"); //2
		
		
		// to get title of the page or validate if your pge title is correct
		System.out.println(driver.getTitle());
		
		//to check if u landed on correct page or no
		System.out.println(driver.getCurrentUrl());
		
		// to get page source
		System.out.println(driver.getPageSource());
		

		
		
		
		
		
	}

}
