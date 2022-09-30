package seleniumpractise;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeSuite
	public void bs()
	{ 
		System.out.println("before suit");
	}
	
	@AfterSuite
	public void as()
	{ 
		System.out.println("After suit");
	}
	
	@Test
	public void test()
	{ 
		System.out.println("After suit");
	}
	
	@BeforeTest
	public void bt()
	{ 
		System.out.println("before test");
	}
	
	@AfterTest
	public void at()
	{ 
		System.out.println("after test");
	}
	
	@BeforeMethod
	public void bm()
	{ 
		System.out.println("before method");
	}
	
	@AfterMethod
	public void am()
	{ 
		System.out.println("after method");
	}
	
}
