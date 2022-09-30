package Selemium.Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");  
		driver.findElement(By.id("email")).sendKeys("abc");
		driver.findElement(By.name("pass")).sendKeys("aaa");
		driver.findElement(By.linkText("Forgotten account?")).click();
		Thread.sleep(300l);
		driver.close();
	}

}



// every object many not have id,name,xpath n css preffered
//alpha numeric id may vary
//confirm the link object with a tag
//class name should not have space[compound class]
// validate xpath 
 //1 step : go to console
//2 step : at the bottom type as $x("your xpath") n enter
// 3 step :you will get object ,move cursor on it then your object will b highlited it means your xpath is correct.



