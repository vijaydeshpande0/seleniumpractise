package Selenium.Easy.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleCheckbox {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.navigate().to("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
	driver.findElement(By.id("isAgeSelected")).click();
}
}
