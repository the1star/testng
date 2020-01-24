package seleniumgrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Griddemo {
	public WebDriver driver;
	@Test
	public void verifylogin() throws MalformedURLException{
	DesiredCapabilities capabilities=DesiredCapabilities.chrome();
	capabilities.setBrowserName("Chrome");
	capabilities.setPlatform(Platform.WINDOWS);
	
	driver=new RemoteWebDriver(new URL("http://172.24.96.68:4455/wd/hub"),capabilities);
	
	driver.navigate().to("http://demowebshop.tricentis.com/login");
	String title=driver.getTitle();
	System.out.println(title);
	driver.manage().window().maximize();

		driver.findElement(By.id("Email")).sendKeys("rekhabr1@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("rekhabr1@gmail.com");

}
}