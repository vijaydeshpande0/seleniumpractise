package seleniumpractise.com.firstTest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadDownload {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/upload/");
		WebElement upload=driver.findElement(By.xpath("//input[@name='uploadfile_0']"));
		
		upload.sendKeys("C:\\Users\\shree\\Downloads\\Microsoft.SkypeApp_kzf8qxf38zg5c!App\\All\\radio.html");
		driver.findElement(By.xpath("//input[@name='terms']")).click();
		driver.findElement(By.xpath("//button[@id='submitbutton']")).click();
		String text=driver.findElement(By.xpath("//*[@class='demo']")).getAttribute("InnerText");
		
		System.out.println(text);
		Assert.assertTrue(text.equals("	1 file has been successfully uploaded."));
	
	
	
		
		
	}

}
