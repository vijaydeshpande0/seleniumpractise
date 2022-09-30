package seleniumpractise.com.firstTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/shree/Downloads/webTables.html");
		List<WebElement> Element = driver.findElements(By.xpath("//table[@id='table']/tbody/tr/th"));
		for(WebElement e:Element) {
		String text=	e.getText();
		System.out.println(text);
		}
	}

}
