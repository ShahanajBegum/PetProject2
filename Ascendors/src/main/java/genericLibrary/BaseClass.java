package genericLibrary;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomRepository.HomePage;
import pomRepository.LoginPage;


public class BaseClass implements FrameWorkConstants {
	
	public static WebDriver driver;
	public  static PropertyFileReader readDataFromProperty;
	public ExcelUtil readDataFromExcel;
	 public  LoginPage login;
	 public  HomePage homepage;
	
	
	@Parameters("browser")
	@BeforeClass(alwaysRun= true)
	
	public void openBrowser(@Optional("chrome") String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("Chrome Successfully launched",true);
		}
		
		else if(browserName.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			Reporter.log("Firefox Successfully launched",true);
		}

		else
			Reporter.log("enter valid browser");
		
		driver.manage().window().maximize();
		Reporter.log("Browser window is maximized successfully", true);
		driver.manage().timeouts().implicitlyWait(IMPLICIT, TimeUnit.SECONDS);
	    }
	
		@BeforeMethod(alwaysRun=true)
		public  void openApplication() throws IOException{
			String url=PropertyFileReader.readDataFromProperty("Url");
//			String username=PropertyFileReader.readDataFromProperty("UserName");
//			String password=PropertyFileReader.readDataFromProperty("PassWord");
//			
			driver.get(url);
		
//			login=new LoginPage(driver);
//			homepage=login.login(username,password);
			}
		
//		@AfterMethod(alwaysRun=true)
//		public void closeApplication() {
//			homepage=new HomePage(driver);
//			homepage.logout();
//			
//		}
		
		@AfterClass(alwaysRun=true)
		public void closeBrowser() {
			driver.quit();
		}

       }	


