package Selenium.Easy.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BlankUser {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver d=new ChromeDriver();
d.get("https://opensource-demo.orangehrmlive.com/");
d.findElement(By.id("txtUsername")).sendKeys("");
d.findElement(By.id("txtPassword")).sendKeys("admin123");
d.findElement(By.name("Submit")).click();
System.out.println("Login");
//Thread.sleep(3000);
String  a=d.findElement(By.xpath("\"//*[@id=\\\"spanMessage\\\"]\"")).getText();
String b="Username cannot be empty";
if( Stringa.equals(b))
{
	System.out.println("tc passed");
}
else
{
	System.out.println("tc failed");
}
d.close();
	}

}
