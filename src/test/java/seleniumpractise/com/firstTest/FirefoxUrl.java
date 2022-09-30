package seleniumpractise.com.firstTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxUrl {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","F:\\SELENIUM\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
	}

}
