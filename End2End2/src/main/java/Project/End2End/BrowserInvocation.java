package Project.End2End;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserInvocation {
public static  WebDriver driver;
public static  Properties prop ;
	public  static void main(String[] args) throws IOException {
		initializeDriver();
	}

	public static  WebDriver initializeDriver() throws IOException {
		// TODO Auto-generated method stub
		prop =new Properties();
        String filePath = System.getProperty("user.dir")+"/src/main/java/Project/End2End/config.properties";
		FileInputStream fis = new FileInputStream(filePath);

		prop.load(fis);

		String browserName = prop.getProperty("browser");

		//System.out.println(browserName);

		//String Url = prop.getProperty("url");

		if (browserName.equals("Chrome")) {

		// execute in chrome

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();

		}

		else if (browserName.equals("FF")) {

		driver = new FirefoxDriver();

		// execute in firefox

		}

		else if (browserName.equals("IE")) {

		// execute in IE

		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;
}
	public String getScreenshot(String testCaseName , WebDriver driver) throws IOException {
		Calendar calendar = Calendar.getInstance();

		SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyy_hh_mm_ss");
		TakesScreenshot TS= (TakesScreenshot)driver;
		File Source=TS.getScreenshotAs(OutputType.FILE);
				String destinationFile =	System.getProperty("user.dir")+"\\Reports\\"+testCaseName+".png";
		FileUtils.copyFile(Source, new File(destinationFile));
		return destinationFile;
	}

}








