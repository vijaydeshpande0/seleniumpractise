
public class CrossB {
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;



	public class CrossBrowser {
		WebDriver driver;
		@BeforeMethod
		@Parameters("browser")
	public void  cb(String browser) {
			//WebDriverManager.chromedriver().setup();
			
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","F:\\SELENIUM\\chromedriver_win32 (1)\\chromedriver.exe");
			 driver= new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","F:\\SELENIUM\\geckodriver-v0.25.0-win64\\geckodriver.exe");
			 driver= new ChromeDriver();
		
		}
		
		else if(browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver","F:\\SELENIUM\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe" );
			 driver= new ChromeDriver();
	}
		}
		
		@Test
		public void login() {
			driver.get("https://opensource-demo.orangehrmlive.com/");
			 driver.findElement(By.name("txtUsername")).sendKeys("admin");
			driver.findElement(By.name("txtPassword")).sendKeys("admin123");
			driver.findElement(By.name("Submit")).click();
		}
		
		@AfterTest
		public void close()
		{
			driver.quit();
		}
	}


}
