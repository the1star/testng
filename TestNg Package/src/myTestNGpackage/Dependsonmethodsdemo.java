package myTestNGpackage;

import org.testng.annotations.Test;

public class Dependsonmethodsdemo {
	
	@Test
	public void startapp()
	{
		System.out.println("Start app ");
	}
	
	@Test(dependsOnMethods="startapp")
	public void login()
	{
		System.out.println("login of app");
	}
	
	@Test//(dependsOnMethods="startapp")
	public void logoff()
	{
		System.out.println("log out of app ");
	}

}
