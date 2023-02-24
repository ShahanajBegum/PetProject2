package users;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomRepository.HomePage;

public class Asc_Home_045_Test extends BaseClass{
   
	@Test
	public void Tc_01() throws InterruptedException {
	HomePage h=new HomePage(driver);
	Thread.sleep(2000);
	h.getHomePage().click();
	Thread.sleep(2000);
}

	
		
	}

	
	
