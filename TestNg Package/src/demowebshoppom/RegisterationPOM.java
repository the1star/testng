
package demowebshoppom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterationPOM
{
	WebDriver driver;
	By Register=By.xpath("//a[@class='ico-register']");
	By FirstName=By.id("FirstName");
	By LastName=By.name("LastName");
	By Email=By.name("Email");
//	By Password=By.name("Password");
	By password=By.name("Password");
	By ConfirmPassword=By.name("ConfirmPassword");
	By registerbutton=By.id("register-button");
//	By message=By.xpath("//*[contains(text(),'Your registration completed')]");
	By logout=By.xpath("//a[@class='ico-logout']");
	
	public RegisterationPOM(WebDriver driver){
		this.driver=driver;
	}
	
	
	public void Register(){
		driver.findElement(Register).click();
		}

	public void enterFirstName(String name){
		driver.findElement(FirstName).sendKeys(name);	
		}
	public void enterLastName(String lastname){
		driver.findElement(LastName).sendKeys(lastname);	
		}
	public void enterEmail(String EMAIL){
		driver.findElement(Email).sendKeys(EMAIL);	
		}
	public void enterPaassword(String Password){
		driver.findElement(password).sendKeys(Password);	
		}
	public void enterConfirmpassword(String confirm){
		driver.findElement(ConfirmPassword).sendKeys(confirm);	
		}
	public void clickRegister(){
		driver.findElement(registerbutton).click();
		}
 /*	public void confirmation(){
		driver.findElement(message).click();
		}*/
	public void clickLogout(){
		driver.findElement(logout).click();
		}
	
	
}
