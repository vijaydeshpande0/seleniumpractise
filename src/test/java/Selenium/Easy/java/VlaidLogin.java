package Selenium.Easy.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VlaidLogin {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
//System.setProperty("webdriver.chrome.driver","F:\\\\SELENIUM\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver Driver=new ChromeDriver();
Driver.get("https://opensource-demo.orangehrmlive.com/");
 Driver.findElement(By.name("txtUsername")).sendKeys("admin");
Driver.findElement(By.name("txtPassword")).sendKeys("admin123");
Driver.findElement(By.name("Submit")).click();
Thread.sleep(3000);
System.out.println("Login successfully");
Driver.findElement(By.id("welcome")).click();
Driver.findElement(By.id("welcome")).sendKeys(Keys.ARROW_DOWN);
Driver.findElement(By.id("welcome")).sendKeys(Keys.ARROW_DOWN);
Driver.findElement(By.id("welcome")).sendKeys(Keys.ENTER);
System.out.println("Logout succesffully");
Driver.close();
	}
}
