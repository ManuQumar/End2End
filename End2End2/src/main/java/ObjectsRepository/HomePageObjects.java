package ObjectsRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {
	public WebDriver driver;
	By Alert =By.xpath("//button[normalize-space()='NO THANKS']");
	By LoginPage =By.xpath("//header/div[1]/div[1]/nav[1]/ul[1]/li[4]/a[1]");
	By UserName= By.id("user_email");
By Password=By.id("user_password");
By LoginButton = By.xpath("//input[@name='commit']");

public HomePageObjects(WebDriver driver) {
	this.driver= driver;
}

public WebElement AlertPopup() {
	return driver.findElement(Alert);
}
public WebElement LoginPage() {
	return driver.findElement(LoginPage);
	
}

}
