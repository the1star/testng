package demowebpomtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import demowebshoppom.DemowebshopPom;

public class Verifylogin {

	@Test
	public void checklogin(){
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		DemowebshopPom login=new DemowebshopPom(driver);
		login.clickLoginin();
		login.enterusername("d170@yahoo.com");
		login.enterpassword("password");
		login.clickloginin();
	}
	
	
	
}
