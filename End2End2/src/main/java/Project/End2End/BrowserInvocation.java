package Project.End2End;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserInvocation {
public static WebDriver driver;
	public  static void main(String[] args) throws IOException {
	//	initializeDriver();
	}
	public  WebDriver initializeDriver() throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
	//	FileInputStream fis= new FileInputStream("D:\\Eclipse\\CoreJavaPractice\\src\\data.properties");
		FileInputStream fis= new FileInputStream("D:\\Eclipse\\End2End\\src\\main\\java\\Project\\End2End\\config.properties");
		prop.load(fis);
		String BrowserName = prop.getProperty("browser");
		System.out.println(BrowserName);
		if(BrowserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
			 else if(BrowserName.equals("FireFox")) {
				 System.out.println(" Bhai Pahele driver initiate karo Geko Kee");
			 }
		return driver;
		}
	}



//public static void initializeDriver() throws IOException {
//
//	// TODO Auto-generated method stub
////	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
////	WebDriver driver = new ChromeDriver();
////	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
////	
////	System.out.println(driver.getTitle());
//	Properties prop= new Properties();
//	FileInputStream ile= new FileInputStream("D:\\Eclipse\\End2End\\src\\main\\java\\Project\\End2End\\config.properties");
//	prop.load(ile);
//
//System.out.println(System.getProperty("browser"));
//}
//public static void main (String [] args) throws IOException {
//initializeDriver();
//}
//}