package Selenium.Easy.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckbox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		driver.findElement(By.id("check1")).click();
		
		
		
	List<WebElement> element=	driver.findElements(By.xpath("//input[@class='cb1-element']"));
	              
	     //int count=0; 
	
    // for(int i=0;i<element.size();i++) {
	     //count++;
    	 //  System.out.println(element.get(i).getText());
    	 //  for(WebElement ele: element) {
		{
		//String t2=	driver.findElement(By.id("check1")).getAttribute("value");
			//String t1= ele.getAttribute("value");
		 // System.out.println(t1);
	//}
   //  }

}
}
}

