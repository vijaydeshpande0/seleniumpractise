package Selenium.Easy.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addition {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		driver.findElement(By.id("sum1")).sendKeys("11");
		driver.findElement(By.id("sum2")).sendKeys("22");
   
	    driver.findElement(By.xpath("//button[@onclick='return total()']")).click();
	}

}
