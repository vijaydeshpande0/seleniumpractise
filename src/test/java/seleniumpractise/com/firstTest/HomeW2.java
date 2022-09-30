package seleniumpractise.com.firstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomeW2 {
	public static void main(String[] args) throws Throwable {
		//System.setProperty("webdriver.gecko.driver", "F:\\SELENIUM\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		//driver.findElement(By.linkText("Gmail")).click();
		//driver.findElement(By.linkText("Sign in")).click();
		
		WebElement webelement=driver.findElement(By.xpath("//*[@name='identifier']"));
		Thread.sleep(3000L);
		webelement.sendKeys("pranotidasi33");
		Thread.sleep(3000L);
		webelement.clear();
		boolean isdisplayed=webelement.isDisplayed();
		System.out.println(isdisplayed);
		
		
		boolean isenabled=driver.findElement(By.className("CwaK9")).isEnabled();
		System.out.println(isenabled);
		Thread.sleep(3000L);
		driver.findElement(By.className("CwaK9")).submit();
		Thread.sleep(3000L);
		
		
		/*driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(1000L);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("3baruni3");
		Thread.sleep(1000L);
		driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(5000L);*/
		driver.close();
		
	}

}
