package Selenium.Easy.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("001");
        driver.findElement(By.name("submit")).click();
        String alertmsg=driver.switchTo().alert().getText();
        System.out.println(alertmsg);
       // driver.switchTo().alert().accept();
       // driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();
	}

}
