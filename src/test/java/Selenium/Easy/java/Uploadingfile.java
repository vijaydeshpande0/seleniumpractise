package Selenium.Easy.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Uploadingfile {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/upload/");
		WebElement element=driver.findElement(By.id("uploadfile_0"));
		Actions uploadfile=new Actions(driver);
		uploadfile.sendKeys("C:\\Users\\shree\\Desktop\\IMG-20190916-WA0001.jpg");
		driver.findElement(By.id("submitbutton")).click();
		driver.close();
	}

}
