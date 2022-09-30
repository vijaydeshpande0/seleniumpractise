package Selenium.Easy.java;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandeling {
	@Test
	public void getwindowhandle() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://demo.guru99.com/popup.php");
		driver.findElement(By.linkText("Click Here")).click();
		String Parentwindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> ite = windows.iterator();
		System.out.println(ite);
		while(ite.hasNext()) {
			String childwindow=ite.next();
			if(!Parentwindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
			}
		}
	}
	

}
