package seleniumpractise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {
	WebDriver driver;
	@Test
	public void capturescreenshot() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.findElement(By.name("txtUsername")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File f=ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(f, new File ("F:\\workspace\\seleniumpractise"+".png"));
		
	}

}
