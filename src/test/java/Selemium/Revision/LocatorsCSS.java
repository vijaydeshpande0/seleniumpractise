package Selemium.Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsCSS {
public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");  
	driver.findElement(By.cssSelector("#email")).sendKeys("email");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("pass");
	driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
	System.out.println(driver.findElement(By.cssSelector("#globalContainer > div.uiContextualLayerPositioner._572t.uiLayer > div > div > div")).getText());
	
	Thread.sleep(200L);
	driver.close();
}
}

// validating css
//step1:go to console
//step1:$("css selector")
//step2: you will receive object,move cursor on it and your object will be highlited