package Selenium.Easy.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/newtours/");
	Actions movetoele= new Actions(driver);
	movetoele.moveToElement(driver.findElement(By.partialLinkText("Vacati"))).build().perform();
	driver.close();
}
}
