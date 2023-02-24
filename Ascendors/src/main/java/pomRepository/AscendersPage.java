package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AscendersPage {
	
	public AscendersPage(WebDriver driver){
		
    PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@name='memberName']")        private WebElement membername;
	@FindBy(xpath="//input[@name='skills']")            private WebElement companyname;
	@FindBy(xpath="//input[@name='linkdinProfile']")    private WebElement imageurl;
	@FindBy(xpath="//button[@type='submit']")           private WebElement addmember;
	@FindBy(xpath="(//div[@class='numbers'])[1]")       private WebElement totalmembers; 
	@FindBy(xpath="//button[.='Logout']")               private WebElement logout;
	@FindBy(xpath="//td[.='Shahanaj']")                 private WebElement textName;
	
	@FindBy(xpath="//td[.='Shahanaj']/.././/button[@class='delete']")
	private WebElement delete;

	public WebElement getMembername() {
		return membername;
	}

	public WebElement getCompanyname() {
		return companyname;
	}

	public WebElement getImageurl() {
		return imageurl;
	}

	public WebElement getAddmember() {
		return addmember;
	}
	
	public WebElement getTotalmember() {
		return totalmembers;
	}
	public WebElement getLogout() {
		return logout;
	}
	
	public WebElement getTextName() {
		return textName;
	}
	public WebElement getDelete() {
		return delete;
	}
	
	

}
