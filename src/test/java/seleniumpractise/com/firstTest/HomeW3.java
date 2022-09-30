package seleniumpractise.com.firstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeW3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		WebElement webelement=driver.findElement(By.xpath("//*[@name='identifier']"));
		
		webelement.sendKeys("pranotidasi33");
		boolean isdisplayed=webelement.isDisplayed();
		if(isdisplayed==true)
		{
			System.out.println("pass");
		}
	}

}
