package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	@Parameters({"URL"})
	@Test
	public void WebLoginHomeloan(String uname)
	{
		//selenium
		System.out.println("webloginhomePersonalLoan");
		System.out.println("uname");
		
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLoginHomeloan()
	{
		//Appium
		System.out.println("mobileloginhome");
	}
	
	@Test
	public void LoginAPIHomeloan()
	{
		//REST Api automation
		System.out.println("Apiloginhome");
	}

}
