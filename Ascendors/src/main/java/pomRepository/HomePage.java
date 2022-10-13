package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
public WebDriver driver;

	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//button[.='Open Menu']") 
	 private static  WebElement menu;
	 
	 @FindBy(xpath="//a[.='Logout']") 
	 private   WebElement logout;

	 public  WebElement getMenu() {
			return menu;
		}

     public  WebElement getLogout() {
			return logout;
		}
	 
	 
	public void logout() {
		menu.click();
		logout.click();
		
		
	}




	

}
