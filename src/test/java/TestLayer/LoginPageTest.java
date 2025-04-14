package TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;

public class LoginPageTest extends BaseClass{
	
	private static LoginPage loginpage;
	@BeforeTest
	public void setUp()
	{
		BaseClass.initialization();
	}
	
	@Test
	public void validateLoginFunctionality()
	{
		 loginpage= new LoginPage();
		 
		 //call properties file in this class
		 
		String email= prop.getProperty("SITUsername");
		String pass=prop.getProperty("SITPassword");
		
		loginpage.loginPageFunctionality(email, pass);
		 
		 
	}
	@AfterTest
	public void tearDown()
	{
		//driver.quit();
	}

}
