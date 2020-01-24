package myTestNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Assertsdemo {
WebDriver driver;
	@Test
	public void startapp(){
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.navigate().to("http://demo.webshop.tricnts.com/login");
		driver.manage().window().maximize();
		
		System.out.println("start app");
		
		
		
	}


	@Test(dependsOnMethods="startapp")
	public void checktitle(){
		driver.findElement(By.name("Email")).sendKeys("d170@yahoo.com");
		driver.findElement(By.id("Password")).sendKeys("password");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		//driver.close();
		String expectedname="Demowebstore";
		
		String actualname=driver.getTitle();
		System.out.println(actualname);
		Assert.assertEquals(expectedname, actualname);
		driver.findElement(By.linkText("Log out")).click();
		System.out.println("log out application");
		
	}
	@Test(dependsOnMethods="login",alwaysRun=true)
	public void logoff(){
		
		driver.close();
		
		
		
		
		
		
	}



}
