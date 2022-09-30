package Selenium.Easy.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangehrmCheckbox {
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	driver.findElement(By.id("txtUsername")).sendKeys("admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@name='Submit']")).click();
	driver.findElement(By.linkText("Admin")).click();
	List<WebElement> list = driver.findElements(By.xpath("//*[@type='checkbox']"));
	for(int i=0;i<list.size();i++) {
		list.get(i).click();
		Thread.sleep(3000L);
		//System.out.println("result:" +list.get(i).getAttribute("value"));
	}
	

}
}