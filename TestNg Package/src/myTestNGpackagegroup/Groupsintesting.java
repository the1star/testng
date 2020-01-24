package myTestNGpackagegroup;

import org.testng.annotations.Test;

public class Groupsintesting{

@Test(groups= {"regression"})

	 public void regression1()
	{
	System.out.println("First regression test");
	 }
@Test(groups= {"regression"})
public void regression2()
	{
	System.out.println("second regression test");
	 }
@Test(groups= {"smoketest"})
public void somketest1()
	{
	System.out.println("First smoke test");
	 }
@Test(groups= {"regression"})
public void regression3()
	{
	System.out.println("third regression test");
	 }
@Test(groups= {"smoketest"})
public void smoketest2()
	{
	System.out.println("Second smoke test");
	 }
	
	
	
	

}
