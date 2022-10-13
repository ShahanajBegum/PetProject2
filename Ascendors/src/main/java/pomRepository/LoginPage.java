package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;

	 public LoginPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="user-name")    			               			private  WebElement usernameTestField;
	@FindBy(id="password")    						             private WebElement passwordTestField;
	@FindBy(xpath="//input[@class='submit-button btn_action']")     private WebElement loginButton;
	
    public WebDriver getDriver() {
		return driver;
	}

    public WebElement getUsernameTestField() {
		return usernameTestField;
	}

    public WebElement getPasswordTestField() {
		return passwordTestField;
	}

    public WebElement getLoginButton() {
		return loginButton;
	}
	
    public HomePage login(String username,String password){
		
		usernameTestField.sendKeys(username);
		passwordTestField.sendKeys(password);
		loginButton.click();
		
		return new HomePage(driver);
		
		
     
		
	}
}
