package ObjectsRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {
	public WebDriver driver;

//	By UserName= By.id("user_email");
//By Password=By.id("user_password");
//By LoginButton = By.xpath("//input[@name='commit']");
//
//public LoginPageObjects(WebDriver driver) {
//	this.driver= driver;
//}
//
//public WebElement Email() {
//	return driver.findElement(UserName);
//}
//public WebElement Password() {
//	return driver.findElement(Password);
//}
//public WebElement LoginButton() {
//	return driver.findElement(LoginButton);
//}
	By email=By.cssSelector("[id='user_email']");
	By password=By.cssSelector("[type='password']");
	By login=By.cssSelector("[value='Log In']");
	By forgotPassword = By.cssSelector("[href*='password/new']");
		
	public LoginPageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub		
		this.driver=driver;	
		PageFactory.initElements(driver, this);
	}
	
  
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}	
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}

}
