package Selenium.Easy.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://demo.guru99.com/test/social-icon.html");
	    Actions action=new Actions(driver);
	    action.moveToElement(driver.findElement(By.className("rss"))).build().perform();
	    Thread.sleep(2000L);
	    String rsstooltip = driver.findElement(By.className("rss")).getAttribute("title");
	    System.out.println(rsstooltip);
	    
	    action.moveToElement(driver.findElement(By.className("facebook"))).build().perform();
	    Thread.sleep(2000L);
	    String fbtooltip = driver.findElement(By.className("facebook")).getAttribute("title");
	    System.out.println(fbtooltip);
	    
	    action.moveToElement(driver.findElement(By.className("github"))).build().perform();
	    Thread.sleep(2000L);
	    String githubtooltip = driver.findElement(By.className("github")).getAttribute("title");
	    System.out.println(githubtooltip);
	    
	    action.moveToElement(driver.findElement(By.className("you-tube"))).build().perform();
	    Thread.sleep(2000L);
	    String yttooltip = driver.findElement(By.className("you-tube")).getAttribute("title");
	    System.out.println(yttooltip);
	    
	    action.moveToElement(driver.findElement(By.className("google"))).build().perform();
	    Thread.sleep(2000L);
	    String googletooltip = driver.findElement(By.className("google")).getAttribute("title");
	    System.out.println(googletooltip);
	    
	    action.moveToElement(driver.findElement(By.className("mail"))).build().perform();
	    Thread.sleep(2000L);
	    String mailtooltip = driver.findElement(By.className("mail")).getAttribute("title");
	    System.out.println(mailtooltip);
	    
	}

}
