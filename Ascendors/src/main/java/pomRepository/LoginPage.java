package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;

	 public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//input[@name='adminEmail']")    				private  WebElement emailTestField;
	@FindBy(xpath="//input[@name='adminPassword']")    			    private WebElement passwordTestField;
	@FindBy(xpath="//button[.='Login']")                            private WebElement loginButton;
	
    public WebDriver getDriver() {
		return driver;
	}

//    public WebElement getemailTestField() {
//		return emailTestField;
//	}

    public WebElement getPasswordTestField() {
		return passwordTestField;
	}

    public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getemailTestField() {
		// TODO Auto-generated method stub
		return emailTestField;
	}
	
//    public HomePage login(String username,String password){
    
//	public void loginpage(String username,String password) {	
//		emailTestField.sendKeys(username);
//		passwordTestField.sendKeys(password);
//		loginButton.click();
		
//		return new HomePage(driver);
		
		
     
		
	}

