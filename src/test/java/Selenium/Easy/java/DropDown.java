package Selenium.Easy.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/shree/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/dropdown.html");
		WebElement element=driver.findElement(By.id("01"));
		Select select= new Select(element);
		//select.selectByIndex("1");
		select.selectByValue("opel");
		boolean result=select.isMultiple();
		System.out.println(result);
		driver.close();
	}

}
