package seleniumpractise.com.firstTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeW5 {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("file:///C:/Users/shree/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/radio.html");
		List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(radios.size());
		
		for(int i=0; i<radios.size();i++)
		{
		
			/*boolean m= driver.findElement(By.xpath("//input[@value='male']")).isSelected();
		if(m==true)
			{
			driver.findElement(By.xpath("//input[@value='female']")).click();
			}*/
			
			
		String rbutton	=radios.get(i).getAttribute("value");
		System.out.println(rbutton);
		boolean m=radios.get(i).isSelected();
		System.out.println(m);
		//boolean m= driver.findElement(By.xpath("//input[@value='male']")).isSelected();
		if(rbutton.equalsIgnoreCase("male") && m==true) {
			driver.findElement(By.xpath("//input[@value='female']")).click();
			System.out.println("changed");
			Thread.sleep(3000L);
			
		}
		
		else if(rbutton.equalsIgnoreCase("female") && m==true){
		driver.findElement(By.xpath("//input[@value='other']")).click();
		System.out.println("c1");
		Thread.sleep(3000L);
		
		}
		else if(rbutton.equalsIgnoreCase("other") && m==true){
			driver.findElement(By.xpath("//input[@value='male']")).click();
			Thread.sleep(3000L);
		
			}
		
		
		
			
		}
	}

}
