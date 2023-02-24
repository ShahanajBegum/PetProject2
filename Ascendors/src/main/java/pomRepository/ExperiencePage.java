package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExperiencePage {
	
	public ExperiencePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//a[.='Experience']") 
	 private   WebElement experience;

	public  WebElement getExperience() {
		return experience;
	}

}
