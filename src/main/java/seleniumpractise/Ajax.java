package seleniumpractise;

import java.util.concurrent.TimeUnit;

import org.omg.CORBA.NO_IMPLEMENT;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajax {
	@Test
	public void Ajaxcall() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait (driver,20);
		Wait w=new FluentWait(driver).withTimeout(30,TimeUnit.SECONDS).pollingEvery(3,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/ajax.html");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.id("yes")).click();
		driver.findElement(By.id("buttoncheck")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@ class='radiobutton']"))));
		w.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@ class='radiobutton']"))));
		//w.until(ExpectedConditions. (driver.findElement(By.xpath("//*[@ class='radiobutton']"))));
		String text=driver.findElement(By.xpath("//*[@ class='radiobutton']")).getText();
		
		
		System.out.println(text);
		
	}

}
