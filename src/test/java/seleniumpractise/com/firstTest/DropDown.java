package seleniumpractise.com.firstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\SELENIUM\\chromedriver_win32 (1)\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("file:///C:/Users/shree/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/dropdown.html");
		WebElement element=driver.findElement(By.id("01"));
		Select select=new Select(element);
		select.selectByValue("saab");
	}

}
