package Selenium.Easy.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangehrmLgoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrangehrmLgoin login= new OrangehrmLgoin();
		login.loginsuccessfully();
		//OrangehrmLgoin loginblank = new OrangehrmLgoin();
		login.blank();
		login.blankusername();
		login.blankpass();
		login.invalidusername();
		login.invalidpass();
		login.invalid();
      }
	
	public void loginsuccessfully() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@name='Submit']")).click();
		String a=driver.findElement(By.xpath("//*[@class='head']/h1")).getText();
		System.out.println(a);
		if(a.equalsIgnoreCase("dashboard")) {
		System.out.println("login successful");
		}
		
		driver.findElement(By.id("welcome")).click();
		
	driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
		//driver.findElement(By.linkText("Logout")).click();
		System.out.println("loggedout");
		driver.close();
		}
	
	public void blank() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.xpath("//*[@name='Submit']")).click();
		String blankpopup= driver.findElement(By.xpath("//*[@id='divLoginButton']/span")).getText();
		//popup.getText();
		System.out.println(blankpopup);
		
	if(blankpopup.equals("Username cannot be empty")) {
		System.out.println("successful");}
	else {
		System.out.println("failed");
		
	}
		
	driver.close();	
	}
	
	public void blankusername() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@name='Submit']")).click();
		String blankusername= driver.findElement(By.xpath("//*[@id='divLoginButton']/span")).getText();
		System.out.println(blankusername);
		
		if(blankusername.equals("Username cannot be empty")) {
			System.out.println("successful");}
		else {
			System.out.println("failed");
			
		}
		driver.close();	
	}
	
	
	public void blankpass() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@name='Submit']")).click();
		String blankpass= driver.findElement(By.id("spanMessage")).getText();
		System.out.println(blankpass);
		
		if(blankpass.equals("Password cannot be empty")) {
			System.out.println("successful");}
		else {
			System.out.println("failed");
			
		}
		driver.close();	
	}
	
	public void invalid() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("abc");
		driver.findElement(By.id("txtPassword")).sendKeys("a123");
		driver.findElement(By.xpath("//*[@name='Submit']")).click();
		String invalid= driver.findElement(By.id("spanMessage")).getText();
		System.out.println(invalid);
		
		if(invalid.equals("Invalid credentials")) {
			System.out.println("successful");}
		else {
			System.out.println("failed");
			
		}
		driver.close();	
		
	}
	
	
	
	
	
	public void invalidusername() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("abc");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@name='Submit']")).click();
		String invalidname= driver.findElement(By.id("spanMessage")).getText();
		System.out.println(invalidname);
		
		if(invalidname.equals("Invalid credentials")) {
			System.out.println("successful");}
		else {
			System.out.println("failed");
			
		}
		driver.close();	
		
	}
	
	public void invalidpass() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("abc");
		driver.findElement(By.xpath("//*[@name='Submit']")).click();
		String invalidpass= driver.findElement(By.id("spanMessage")).getText();
		System.out.println(invalidpass);
		
		if(invalidpass.equals("Invalid credentials")) {
			System.out.println("successful");}
		else {
			System.out.println("failed");
			
		}
		driver.close();	
	}
	
	
		
	}
	
	
	
	
	



