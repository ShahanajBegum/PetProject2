package users;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import genericLibrary.JavaScriptUtil;
import genericLibrary.PropertyFileReader;
import pomRepository.AscendersPage;
import pomRepository.LoginPage;

public class Asc_Ascenders_075 extends BaseClass{

	
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
	
	String membername=PropertyFileReader.readDataFromProperty("name");
	as.getMembername().sendKeys(membername);
	Thread.sleep(2000);
	String companyname=PropertyFileReader.readDataFromProperty("skills");
	as.getCompanyname().sendKeys(companyname);
	Thread.sleep(2000);
	String imageurl=PropertyFileReader.readDataFromProperty("imageurl");
	as.getImageurl().sendKeys(imageurl);
	Thread.sleep(2000);
	as.getAddmember().click();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	
	
	
    
	
//	driver.navigate().refresh();
//	String membername1=PropertyFileReader.readDataFromProperty("name1");
//	as.getMembername().sendKeys(membername1);
//	Thread.sleep(2000);
//	String companyname1=PropertyFileReader.readDataFromProperty("companyname1");
//	as.getCompanyname().sendKeys(companyname1);
//	Thread.sleep(2000);
//	String imageurl1=PropertyFileReader.readDataFromProperty("imageurl1");
//	as.getImageurl().sendKeys(imageurl1);
//	Thread.sleep(2000);
//	as.getAddmember().click();
//	Thread.sleep(2000);
//	driver.navigate().refresh();
//	System.out.println(as.getTotalmember().getText());
	
	String actual=as.getTotalmember().getText();
	Reporter.log(actual,true);
	String expected=actual;
    Assert.assertEquals(actual, expected);
    
    
    System.out.println("**************Validation successfully**************");
    Thread.sleep(1000);
    
    String actual_result=as.getTextName().getText();
    Reporter.log(actual_result,true);
    String expected_result=membername;
    Assert.assertEquals(actual_result, expected_result);
    System.out.println("**************Name Validation successfully**************");
    Thread.sleep(2000);
    
    
    JavascriptExecutor js=(JavascriptExecutor)driver;
     js.executeAsyncScript("window.scrollTo(0,1100)");
     Thread.sleep(1000);
//     JavascriptExecutor j=(JavascriptExecutor)driver;
//     js.executeAsyncScript("window.scrollBy(0,-1100)");
//     js.executeAsyncScript("arguments[0].scrollIntoView(True)",as.getLogout());
//    JavaScriptUtil js=new JavaScriptUtil(driver);
//    Thread.sleep(2000);
//    js.jsScrollTo(0,1100) ;
  
   
    

//    as.getLogout().click();

//	driver.quit();
     driver.close();
	
	}
}
