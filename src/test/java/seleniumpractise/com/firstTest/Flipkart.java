package seleniumpractise.com.firstTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public final class Flipkart {
	public static void main(String[] args) throws  Exception {
System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("9970242476");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("Pranoti@143");
		driver.findElement(By.xpath("//*[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.name("q")).sendKeys("iphone");
		
		//Thread.sleep(2000L);
		//driver.wait();
		/*Actions action= new Actions(driver);
		action.sendKeys(Keys.ARROW_DOWN);
		action.sendKeys(Keys.ENTER);*/
		//driver.findElement(By.xpath("//*[@id='container']/div/div/div/div/div[2]/form/div/button"))
	
		//diver.findElement()
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		List<WebElement> element3=driver.findElements(By.xpath("//*[@class='_1uv9Cb']"));
	    for(WebElement ele: element3 ) {
	    	System.out.println("done");
	    	String price=ele.getText();
	    	System.out.println("price is "+price);
	    }
	    Thread.sleep(5000L);
	    driver.close();
	}
}


