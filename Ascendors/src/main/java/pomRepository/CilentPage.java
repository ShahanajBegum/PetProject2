package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CilentPage {
	public CilentPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//a[.='Clients']") 
	 private static  WebElement cilents;

	public  WebElement getCilents() {
		return cilents;
	}
}
