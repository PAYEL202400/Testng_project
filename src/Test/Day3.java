package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
@BeforeClass
public void beforeclass()
{
	System.out.println("before executing any method in the class");
}
@Parameters({"URL","APIKey/username"})
    @Test
    public void MobileSigninCarloan(String urlname, String Key)
   {
	//Appium
	System.out.println("mobilesignincar");
	System.out.println("urlname");
	System.out.println("key");
    }

	@Test(groups= {"Smoke"})
	public void WebLoginCarloan()
	{
		//selenium
		System.out.println("weblogincar");
	}
	@BeforeMethod
	public void beforeevery()
	{
		System.out.println("i will execute before every test method in day3 class");
	}
	
	
	@AfterMethod
	public void afterevery()
	{
		System.out.println("i will execute after every test method in day3 class");
	}
	
	@AfterClass
	public void Afterclass()
	{
		System.out.println("After executing any method in the class");
	}

	
	@Test(enabled=false)
	public void MobileLoginCarloan()
	{
		//Appium
		System.out.println("mobilelogincar");
	}
	@BeforeSuite
	public void bfSuite()
	{
		System.out.println("i am no 1");
	}

	
	@Test(dataProvider="getData")
	public void MobileSignoutCarloan(String username, String password)
	{
		//Appium
		System.out.println("mobilesignoutcar");
		System.out.println("username");
		System.out.println("password");
		
	}
	
	@Test(dependsOnMethods = {"WebLoginCarloan"})
	public void LoginAPICarloan()
	{
		//REST Api automation
		System.out.println("Apilogincar");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combination- username/password-- with good credit history
		//2 nd combination- with no credit history
		//3rd combination with fraudulent credit history
		Object[][] data = new Object[3][2];
		data[0][0]="firstsetusername";
		data[0][1]="firstpassword";
		
		data[1][0]="secondsetusername";
		data[1][1]="secondpassword";
		
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		return data;
	}

}
