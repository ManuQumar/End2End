package ObjectsRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {
	public WebDriver driver;
	By Alert =By.xpath("//button[normalize-space()='NO THANKS']");
//	By LoginPage =By.xpath("//header/div[1]/div[1]/nav[1]/ul[1]/li[4]/a[1]");
	By signin=By.cssSelector("a[href*='sign_in']");
	By UserName= By.id("user_email");
By Password=By.id("user_password");
By LoginButton = By.xpath("//input[@name='commit']");
By CourseValidate = By.xpath("//h3[contains(text(),'Self Paced online Training')]");
By TitleName= By.xpath("//h2[contains(text(),'Featured Courses')]");

public HomePageObjects(WebDriver driver) {
	this.driver= driver;
}

public WebElement AlertPopup() {
	return driver.findElement(Alert);
}
public WebElement SignIn() {
	return driver.findElement(signin);
	
}
public WebElement ValidateCourseName() {
	return driver.findElement(CourseValidate);
	
}

public int getPopupSize()
{
	return driver.findElements(Alert).size();
}

public WebElement Title() {
	// TODO Auto-generated method stub
	return driver.findElement(TitleName);
}

}
