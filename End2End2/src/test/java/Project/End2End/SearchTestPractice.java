package Project.End2End;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchTestPractice extends BrowserInvocation {
@BeforeTest
public void BrowserSteup() throws IOException {
	driver= initializeDriver();
	driver.get("https://naveenautomationlabs.com/opencart/");
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
}
@Test
public void SearchButton() {
	System.out.println("Fine!!");
	driver.findElement(By.name("search")).sendKeys("Search");
}

@AfterTest
public void BrowserClose() {
	driver.close();
}
}