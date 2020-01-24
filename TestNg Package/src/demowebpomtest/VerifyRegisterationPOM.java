package demowebpomtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import demowebshoppom.RegisterationPOM;

public class VerifyRegisterationPOM {
	@Test
	public void checklogin() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();

		RegisterationPOM register=new RegisterationPOM(driver);
		register.Register();
		register.enterFirstName("Divy");
		register.enterLastName("kant");
		register.enterEmail("d1@hdfgfgh.com");
		register.enterPaassword("jaishreeram");
		register.enterConfirmpassword("jaishreeram");
		register.clickRegister();
		Thread.sleep(4000);
		//register.confirmation();
		register.clickLogout();

	
	}
}
