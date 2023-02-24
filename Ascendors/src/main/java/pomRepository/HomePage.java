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


	@FindBy(xpath="//a[.='Home']") 
	 private static  WebElement HomePage;

	public  WebElement getHomePage() {
		return HomePage;
	}


	
}



	


