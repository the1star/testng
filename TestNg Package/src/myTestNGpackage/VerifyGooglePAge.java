package myTestNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyGooglePAge {
	WebDriver driver;
	@BeforeMethod
	public void startup(){
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://www.google.com/");
	}
	
	@Test
	public void checkitle(){
		
		String title=driver.getTitle();
		String expectdtitle="Google";
		Assert.assertEquals(expectdtitle, title);
		
	}
	
	@Test(priority=1)
	public void checklogo(){
	boolean logo=driver.findElement(By.id("hplogo")).isDisplayed();
	Assert.assertTrue(logo);
		
	}
	
	@AfterMethod
	public void cosebrowser(){
		driver.quit();
	}
}
