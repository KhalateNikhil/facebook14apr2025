package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class LoginPage extends BaseClass{
	
	//create OR by using @FindBy annotation
	
	
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(xpath="//div[text()='Login']")
	private WebElement login ;

	
	//initialize OR with PageFactory.initElements()method in constructor
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//create associated methods for each and every OR without passing test data
	
	
	public void loginPageFunctionality(String Email, String password)
	{
		email.sendKeys(Email);
		pass.sendKeys(password);
		login.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
