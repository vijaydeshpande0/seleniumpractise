package seleniumpractise.com.firstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/shree/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/checkBox.html");
		//driver.findElement(By.linkText("Images")).
		boolean isselected=driver.findElement(By.xpath("//*[@value='Bike']")).isSelected();
		System.out.println(isselected);
		boolean isselected1=driver.findElement(By.xpath("//*[@value='Car']")).isSelected();
		System.out.println(isselected1);
		
		
	}

}
