package ObjectsRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	public WebDriver driver;

	By UserName= By.id("user_email");
By Password=By.id("user_password");
By LoginButton = By.xpath("//input[@name='commit']");

public LoginPageObjects(WebDriver driver) {
	this.driver= driver;
}

public WebElement Email() {
	return driver.findElement(UserName);
}
public WebElement Password() {
	return driver.findElement(Password);
}
public WebElement LoginButton() {
	return driver.findElement(LoginButton);
}

}
