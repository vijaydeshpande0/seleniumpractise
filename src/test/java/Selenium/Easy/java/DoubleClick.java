package Selenium.Easy.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/shree/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/doubleclick.html");
		WebElement element=driver.findElement(By.id("dbc"));
		Actions doubleclick=new Actions(driver);
		//WebElement element=driver.findElement(By.linkText("Double-click me"));
		doubleclick.doubleClick(element).build().perform();
		driver.close();
	}

}
