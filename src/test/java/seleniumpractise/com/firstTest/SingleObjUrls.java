package seleniumpractise.com.firstTest;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SingleObjUrls {
	
	WebDriver driver;
	public static void main(String[] args) {
		
		
		SingleObjUrls  b=new SingleObjUrls ();
		
		b.urls("chrome");
		b.urls("firefox");
		b.urls("ie");
		
		
	}
	
	public void urls(String browser) {
		
		//Scanner sc=new Scanner(System.in);
		//System.out.println("enter the browser name you want to open");
		//=sc.next();
		
		switch(browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM\\chromedriver_win32 (1)\\chromedriver.exe");
			driver= new ChromeDriver();
		    break;
		    
		case "firefox":
			System.setProperty("webdriver.gecko.driver","F:\\SELENIUM\\geckodriver-v0.25.0-win64\\geckodriver.exe");
			 driver= new FirefoxDriver();
			break;
			
		case "ie":
			 System.setProperty("webdriver.ie.driver","F:\\SELENIUM\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe" );
			  driver=new InternetExplorerDriver();
			  break;
			
			

		
		}
	}

}



