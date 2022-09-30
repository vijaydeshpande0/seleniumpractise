package Selenium.Easy.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.navigate().to("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
	List<WebElement> element=driver.findElements(By.xpath("//input[@name='optradio']"));
	                driver.findElement(By.id("buttoncheck")).click();
	  for(int i=0;i<element.size();i++){
		  String rbuttons=element.get(i).getAttribute("value");
		  boolean select=element.get(i).isSelected();
		  
	//boolean male=element.get(0).isSelected();
	//boolean female=element.get(1).isSelected()
	if (rbuttons.equalsIgnoreCase("male") && select==true) {
	       String m=  element.get(i).getAttribute("value");
	       System.out.println(m);
	}
	else if(rbuttons.equalsIgnoreCase("female") && select==true){
		 String f=  element.get(i).getAttribute("value");
	       System.out.println(f);
	}
}
}

}
