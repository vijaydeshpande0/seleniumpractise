package seleniumpractise.com.firstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddUser {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://thedemosite.co.uk/");
		Thread.sleep(4000);
		driver.findElement(By.linkText("3. Add a User")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ABCD");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("loginpass");
		driver.findElement(By.xpath("//input[@value='save']")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("4. Login")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ABCD");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("loginpass");
		driver.findElement(By.xpath("//input[@value='Test Login']")).click();
	}

}
