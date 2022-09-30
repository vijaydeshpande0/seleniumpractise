package seleniumpractise.com.firstTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiCheckbox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\SELENIUM\\chromedriver_win32 (1)\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("file:///C:/Users/shree/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/checkBox%20(2).html");
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0; i<checkbox.size();i++) {
			
		    String cb=checkbox.get(i).getAttribute("value");
		System.out.println(cb);
   
		switch(cb)
		{
		
		case "VIJAY":
			if(checkbox.get(i).isSelected()==true) {
				System.out.println("its already selected");
				}
			else {
			checkbox.get(i).click();
			}
		
		break;
		
		
		case "Pranoti":
			checkbox.get(i).click();
			break;
			
		case "AJAY":
			checkbox.get(i).click();
			break;
			
		case "Sanjay":
		checkbox.get(i).click();
		break;
		
		case "Sneha":
			checkbox.get(i).click();
			break;
			
		case "Nagnath":
			checkbox.get(i).click();
			break;
		
		case " Upendra":	
			checkbox.get(i).click();
			break;
			
		case "Pratik":
			checkbox.get(i).click();
			break;
			
			
			
		
		}
		
		
		
		
	
			
		}
	}
}
		
	
	


