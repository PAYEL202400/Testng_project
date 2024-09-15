package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	
	@Test(groups= {"Smoke"})
	public void pinfo1()
	{
		System.out.println("Jevan jhala ka??");
	}
	
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("i will execute first");
	}
	

}
