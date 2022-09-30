package seleniumpractise.com.firstTest;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AertPopup {
	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("001");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(3000L);
		driver.switchTo().alert().accept();
		Thread.sleep(3000L);
	String text=	driver.switchTo().alert().getText();
	
		System.out.println(text);
		Assert.assertTrue(text.equals("Customer Successfully Delete!"),"Not deleted");
		driver.switchTo().alert().accept();
		
		
	}

}
