package myTestNGpackagegroup;

import org.testng.annotations.Test;

public class Groupsintesting2 {
	@Test(groups= {"regression"})

	 public void regression4()
	{
	System.out.println("forth regression test");
	 }
@Test(groups= {"regression"})
public void regression5()
	{
	System.out.println("fifth regression test");
	 }
@Test(groups= {"smoketest"})
public void somketest3()
	{
	System.out.println("third smoke test");
	 }
@Test(groups= {"regression"})
public void regression6()
	{
	System.out.println("sixth regression test");
	 }
@Test(groups= {"smoketest"})
public void smoketest4()
	{
	System.out.println("fourth smoke test");
	 }
	
	
	
	


}
