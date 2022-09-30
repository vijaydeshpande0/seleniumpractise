package Selenium.Easy.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleRadioButton {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("file:///C:/Users/shree/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/radio.html");
		List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(radios.size());
		
		for(int i=0; i<radios.size();i++)
		{
			
		String rbutton	=radios.get(i).getAttribute("value");
		System.out.println(rbutton);
		boolean m=radios.get(i).isSelected();
		System.out.println(m);
		
		if(rbutton.equalsIgnoreCase("male") && m==true) {
			driver.findElement(By.xpath("//input[@value='female']")).click();
			System.out.println("changed to female");
			Thread.sleep(3000L);
			
		}
		
		else if(rbutton.equalsIgnoreCase("female1") && m==true){
		driver.findElement(By.xpath("//input[@value='other1']")).click();
		System.out.println("changed to other");
		Thread.sleep(3000L);
		
		}
		else if(rbutton.equalsIgnoreCase("other2") && m==true){
			driver.findElement(By.xpath("//input[@value='male2']")).click();
			System.out.println("changed to male");
			Thread.sleep(3000L);
		
			}
		
		
		
		
		
			
		}
	}


	}


