package seleniumpractise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreeShot1 {
	WebDriver driver;
	@Test
	public void ss() throws Exception 
	{ WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.guru99.com/selenium-tutorial.html");
	TakesScreenshot tss=(TakesScreenshot)driver;
	File file=tss.getScreenshotAs(OutputType.FILE);
     FileUtils.copyFile(file, new File ("F:\\img.png"));
	}

}
