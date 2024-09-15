package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {
	
	
	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute last");
		
	}
	
	@Test
	public void Demo()
	{
		System.out.println("Hello Mukesh!!");
	}
	
	@AfterSuite
	public void afSuite()
	{
		System.out.println("I am last suite");
	}
	
	@Test(groups= {"Smoke"})
	public void pinfo()
	{
		System.out.println("Kay karat ahe??");
	}

}
