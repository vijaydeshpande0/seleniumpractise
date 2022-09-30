package seleniumpractise.com.firstTest;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {
	public static void main(String[] args) throws Exception {
		//System.setProperty("webdriver.chrome.driver","F:\\SELENIUM\\chromedriver_win32 (1)\\chromedriver.exe" );
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//Robot r=new Robot();
		
		driver.navigate().to("https://www.myntra.com/?gclid=EAIaIQobChMI84Xw68qU5QIVFx4rCh1CJQDHEAAYASAAEgKx2fD_BwE&utm_source=google&utm_medium=cpc&utm_campaign=&utm_term=myntra&utm_content=&matchtype=e");
		WebElement drop=driver.findElement(By.xpath("//*[text()='Women']"));
		Actions action= new Actions(driver);
		action.moveToElement(drop).build().perform();
		
		WebElement element1=driver.findElement(By.xpath("//*[text()='Kurtas & Suits']"));
		action.contextClick(element1).build().perform();
		//action.release();
		driver.findElement(By.linkText("Kurtas & Suits")).sendKeys(Keys.ARROW_DOWN);
		//action.sendKeys(Keys.DOWN);
		driver.findElement(By.linkText("Kurtas & Suits")).sendKeys(Keys.ARROW_UP);
		driver.findElement(By.linkText("Kurtas & Suits")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.linkText("Kurtas & Suits")).sendKeys(Keys.ENTER);
		
		//r.keyRelease();
		driver.close();
	
	}
}

