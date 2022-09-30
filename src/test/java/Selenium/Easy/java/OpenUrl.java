package Selenium.Easy.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenUrl {
	public  void validlogindetails() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OpenUrl o= new OpenUrl();
		o.validlogindetails();
	}

}
