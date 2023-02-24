package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeamsPage {
public TeamsPage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//a[.='Team']") 
	 private static  WebElement teams;

	public  WebElement getTeams() {
		return teams;
}
}