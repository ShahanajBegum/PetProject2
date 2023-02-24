package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
public ContactPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//button[.='Contact']") 
	 private static  WebElement contact;

	@FindBy(xpath="//input[@name='user_name']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='user_email']")
	private WebElement email;
	
	@FindBy(xpath="//textarea[@name='message']")
	private WebElement message;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement sendbutton;
	
	public  WebElement getContact() {
		return contact;
	}
	public  WebElement getUserName() {
		return username;
	}
	public  WebElement getEmail() {
		return email;
	}
	public  WebElement getMessage() {
		return message;
	}
	
	public  WebElement getSend() {
		return sendbutton;
	}
}
