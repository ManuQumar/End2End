package Project.End2End;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ObjectsRepository.HomePageObjects;
import ObjectsRepository.LoginPageObjects;

public class ValidateTitle extends BrowserInvocation{

	@Test
	public void Login () throws IOException   {
		driver = initializeDriver();
		driver.get("https://www.qaclickacademy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HomePageObjects HP= new HomePageObjects(driver);
		HP.AlertPopup().click();
		System.out.println("Till now I am executed");
	System.out.println(HP.ValidateCourseName().getText());	
	Assert.assertEquals(HP.ValidateCourseName().getText(), "SELF PACED ONLINE TRAINING");
	Assert.assertEquals(HP.Title().getText(), "FEATURED COURES");
	System.out.println("Hi");
	
	File Sccr=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Sccr, new File ("C:\\Users\\PC\\git\\End2End\\End2End2\\Screenshots\\manu.html"));
	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
