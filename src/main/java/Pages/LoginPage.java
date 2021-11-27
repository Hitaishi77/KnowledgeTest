package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(id="email")
	WebElement emailbox; 
	
	@FindBy(id="pass")
	WebElement password; 
	
	public LoginPage() { 
		PageFactory.initElements(driver, this);
	}
	
	public void login(String un, String pswd) {
		
		emailbox.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		
	}
	
}
