package myTestNGpackage;


import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class Parallelbrowser{
	WebDriver driver;
	@Test
	public void method1(){
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");
		String title=driver.getTitle();
		System.out.println("titile is"+title);
		
		
		@Test
		public void method2(){
			System.setProperty("webdriver.gecko.driver", "E:\\Softwares Required For Testing Batch\\Testing Softwares\\Selenium Updated Jar\\geckodriver-v0.20.1-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://www.google.com/");
			String title=driver.getTitle();
			System.out.println("titile is"+title);
		}
}
