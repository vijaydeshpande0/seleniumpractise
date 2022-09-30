package Selenium.Easy.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Blank {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver Driver=new ChromeDriver();
		Driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		Driver.findElement(By.name("txtUsername")).sendKeys("");
		Driver.findElement(By.name("txtPassword")).sendKeys("");
		Driver.findElement(By.name("Submit")).click();
		System.out.println("Login");
		Thread.sleep(3000);
		if((Driver.findElement(By.xpath("//*[@id=\"spanMessage\"]")).getText()).equals("Username cannot be empty"))
		 //String b="Username cannot be empty";
		//if(a.equals(b))
		{
		System.out.println("Tc passed");
		}
else
{
			System.out.println("failed");
		}
Driver.close();
}
}

