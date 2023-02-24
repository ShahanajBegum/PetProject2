package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServicePage {
     
    public WebDriver driver;

	public ServicePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[.='Serivces']")      
	private WebElement Service;

	
	public WebElement getService() {
		return Service;
	}
	
	@FindBy(xpath="//button[.='Download']")
	private WebElement download;
	
	public WebElement getDownload() {
		return download;
	}
	
}
