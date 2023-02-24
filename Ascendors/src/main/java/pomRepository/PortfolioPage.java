package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PortfolioPage {
	public PortfolioPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//a[.='Portfolio']") 
	 private static  WebElement portfolio;

	public  WebElement getPortfolio() {
		return portfolio;
	}
}
