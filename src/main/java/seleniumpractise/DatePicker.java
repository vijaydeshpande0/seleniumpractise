package seleniumpractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {
	// public static void main(String[] args) throws InterruptedException
	@Test
	public void calender() throws Exception {
		String day;
		String months;
		String years;
		day = "20";
		months = "November";
		years = "2014";
		// System.setProperty("webdriver.chrome.driver","F:\\SELENIUM\\chromedriver_win32
		// (1)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");

		driver.switchTo().frame(0);
		Thread.sleep(3000L);
		driver.findElement(By.id("datepicker")).click();
		List<WebElement> date = driver.findElements(By.xpath("//*[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for (int i = 0; i < date.size(); i++) {
			String d = date.get(i).getText();
			System.out.println(d);
		}

		List<WebElement> month = driver.findElements(By.xpath("//*[@class='ui-datepicker-month']"));
		for (int i = 0; i < month.size(); i++) {
			String m = month.get(i).getText();
			System.out.println(m);
		}

		// List<WebElement> year =
		// driver.findElements(By.xpath("//*[@class='ui-datepicker-year']"));

		for (int i = 0; i < 20; i++) {
			String y = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/span[2]")).getText();
			// String y=year.get(i).getText();
			System.out.println(y);

			if (!years.equals(y)) {
				driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			}

		}

	}

}
