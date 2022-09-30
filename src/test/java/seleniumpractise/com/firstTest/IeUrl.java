package seleniumpractise.com.firstTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IeUrl {
  public static void main(String[] args) {
	  System.setProperty("webdriver.ie.driver","F:\\SELENIUM\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe" );
	  WebDriver driver=new InternetExplorerDriver();
	
}
}
