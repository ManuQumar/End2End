package Project.End2End;


import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ObjectsRepository.HomePageObjects;
import ObjectsRepository.LoginPageObjects;

public class Login extends BrowserInvocation{
	
	@Test(dataProvider="getData")
	public void Login (String Email, String Password) throws IOException   {
		driver = initializeDriver();
		driver.get("https://www.qaclickacademy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HomePageObjects HP= new HomePageObjects(driver);
		HP.AlertPopup().click();
		System.out.println("Till now I am executed");
		WebDriverWait wait = new WebDriverWait( driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(HP.LoginPage())).click();
		LoginPageObjects LP= new LoginPageObjects(driver);
		LP.Email().sendKeys(Email);
		LP.Password().sendKeys(Password);
		LP.LoginButton().click();

	}
	@DataProvider
	public Object[][] getData() {

		Object [][] data= new Object [2][2]	;
		data[0][0] ="Manu@Manu.com";
		data[0][1]="Test@787";
		data[1][0]="Edward@Manu.com";
		data[1][1]="Test@190";
		return data;
		}
	}