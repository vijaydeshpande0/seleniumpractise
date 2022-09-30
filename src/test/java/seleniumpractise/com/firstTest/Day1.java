package seleniumpractise.com.firstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver;
		//WebDriver driver=new WebDriver();
		 driver=new ChromeDriver();
		// driver.get("https://www.google.com/");
		 driver.navigate().to("https://dev.paymate.in/Beta/PMX3.0/Login.aspx");
		 //driver.manage().window().fullscreen();
		 driver.manage().window().maximize();
		 driver.findElement(By.name("ctl00$cphContents$txtParanNaam")).sendKeys("ant@yopmail.com");
		 driver.findElement(By.name("ctl00$cphContents$txtParanShabd")).sendKeys("Paymate@123");
		 driver.findElement(By.name("ctl00$cphContents$btnLogin")).click();
	}

}
