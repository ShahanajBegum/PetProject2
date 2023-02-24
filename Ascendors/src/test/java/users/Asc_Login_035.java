package users;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import genericLibrary.FrameWorkConstants;
import genericLibrary.PropertyFileReader;
import pomRepository.LoginPage;

public class Asc_Login_035 extends BaseClass {    
	
     //  public WebDriver driver;
	@Test

		public void login() throws InterruptedException, EncryptedDocumentException, IOException {
    // System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");


		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();		
	
        String Loginurl=PropertyFileReader.readDataFromProperty("Loginurl");
		driver.get(Loginurl);
		LoginPage l=new LoginPage(driver);
		Thread.sleep(2000);
		String email=PropertyFileReader.readDataFromProperty("username");
		l.getemailTestField().sendKeys(email);
		Thread.sleep(2000);
		String password=PropertyFileReader.readDataFromProperty("password");
		l.getPasswordTestField().sendKeys(password);
		Thread.sleep(2000);
		l.getLoginButton().click();
		Thread.sleep(2000);
		driver.quit();
		

	}

}
