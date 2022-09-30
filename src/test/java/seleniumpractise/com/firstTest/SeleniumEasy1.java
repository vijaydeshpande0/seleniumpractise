package seleniumpractise.com.firstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumEasy1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\SELENIUM\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		driver.findElement(By.id("user-message")).sendKeys("hello,good evening...!");
		driver.findElement(By.xpath("//*[@id='get-input']/button")).click();
	}

}
