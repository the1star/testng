package demowebpomtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import demowebshoppom.DemowebshopPom;
import demowebshoppom.RegisterationPOM;

public class Verifyloginandregister {
	WebDriver driver;
	@BeforeMethod
	public void tricents() {
	System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/");
	}
	@Test
	public void checklogin() {
/*	//	System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://demowebshop.tricentis.com/register");
	//	driver.manage().window().maximize(); */
		RegisterationPOM register=new RegisterationPOM(driver);
		register.Register();

		register.enterFirstName("Divy");
		register.enterLastName("kant");
		register.enterEmail("d1hhrfews@hwa2arsdffl.com");
		register.enterPaassword("jaishreeram");
		register.enterConfirmpassword("jaishreeram");
		register.clickRegister();
		String actual=driver.findElement(By.xpath("//div[@class='result']")).getText();
		String Expected="Your registration completed";
		Assert.assertEquals(Expected,actual);
		System.out.println(actual);

		
		/*		String title=driver.get(null);
		String expectdtitle="Your registration completed";
		Assert.assertEquals(expectdtitle, title);*/
		
		
		register.clickLogout();
		
	}	
		@Test(priority=1)
		public void checkrelogin() 
		{
		
		DemowebshopPom login=new DemowebshopPom(driver);
		login.clickLoginin();
		login.enterusername("d1hhrfews@hwa2arsdffl.com");
		login.enterpassword("jaishreeram");
		login.clickloginin();
		String actual=driver.findElement(By.xpath("//a[contains(text(),'d1hhrfews@hwa2arsdffl.com')]")).getText();
		String Expected="d1hhrfews@hwa2arsdffl.com";
		Assert.assertEquals(Expected,actual);
		System.out.println(actual);
		
	//	driver.navigate().to("http://demowebshop.tricentis.com/login");
		
		
		
	
	
	
	}
		@AfterMethod
	public void close()
	{
			driver.quit();
	}
}