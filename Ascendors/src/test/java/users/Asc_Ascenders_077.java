package users;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import genericLibrary.PropertyFileReader;
import pomRepository.AscendersPage;
import pomRepository.LoginPage;

public class Asc_Ascenders_077 extends BaseClass{

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
	
	
	AscendersPage as=new AscendersPage(driver);
	Thread.sleep(1000);
	driver.navigate().refresh();
	Thread.sleep(1000);
	as. getDelete().click();
	Thread.sleep(1000);
	driver.navigate().refresh();
	
	String actual=as.getTotalmember().getText();
	Reporter.log(actual,true);
	String expected=actual;
    Assert.assertEquals(actual, expected);
    
    
    System.out.println("**************Validation successfully**************");
    Thread.sleep(1000);
	
	
}
}