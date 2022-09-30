package seleniumpractise.com.firstTest;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenDiffUrls {
	public static void main(String[] args) {
		OpenDiffUrls b=new OpenDiffUrls();
		
		b.urls("chrome");
		b.urls("firefox");
		b.urls("ie");
		
		
	}
	
	public void urls(String browser) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the browser name you want to open");
		browser=sc.next();
		
		switch(browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
		    break;
		    
		case "firefox":
			System.setProperty("webdriver.gecko.driver","F:\\SELENIUM\\geckodriver-v0.25.0-win64\\geckodriver.exe");
			WebDriver driver1= new FirefoxDriver();
			break;
			
		case "ie":
			 System.setProperty("webdriver.ie.driver","F:\\SELENIUM\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe" );
			  WebDriver driver2=new InternetExplorerDriver();
			  break;
			
			

		
		}
	}

}
