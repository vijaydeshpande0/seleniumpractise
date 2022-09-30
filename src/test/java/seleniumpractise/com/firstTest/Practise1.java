package seleniumpractise.com.firstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practise1 {
	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		WebElement element1= driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li/a"));
		Actions action= new Actions(driver);
		action.moveToElement(element1).build().perform();
		driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li/ul/li[2]/ul/li[2]/a")).click();
	    
	
	}

}
