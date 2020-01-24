package demowebshoppom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemowebshopPom {
	WebDriver driver;
	By Login=By.xpath("//a[@class='ico-login']");
	By email=By.name("Email");
	By password=By.name("Password");
	By login=By.xpath("//input[@class='button-1 login-button']");
	
	public DemowebshopPom(WebDriver driver){
		this.driver=driver;
	}
	public void clickLoginin(){
		driver.findElement(Login).click();
		}
	public void enterusername(String EMAIL){
		driver.findElement(email).sendKeys(EMAIL);	
		}
	public void enterpassword(String Passsaj){
		driver.findElement(password).sendKeys(Passsaj);	
		}
	public void clickloginin(){
		driver.findElement(login).click();
		}
}
