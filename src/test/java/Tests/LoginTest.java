package Tests;

import org.testng.annotations.BeforeMethod;

import Pages.LoginPage;
import TestBase.TestBase;

public class LoginTest extends TestBase {
		
	LoginPage loginpage; 
	
	
	public LoginTest() { 
		super(); 
	}
	
	
	@BeforeMethod
	public void setUP() { 
		initialization(); 
		loginpage = new LoginPage(); 
	}
	
}
