package users;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomRepository.CilentPage;
import pomRepository.ContactPage;

public class Asc_ContactUs_072_Test extends BaseClass{
	@Test
	public void Tc_01() throws InterruptedException {
		ContactPage s=new ContactPage(driver);
	Thread.sleep(2000);
	s.getContact().click();
	Thread.sleep(2000);
	s.getUserName().sendKeys("shahanaj");
	Thread.sleep(2000);
	s.getEmail().sendKeys("shahanaj@gmail.com");
	Thread.sleep(2000);
	s.getMessage().sendKeys("hi how are u");
	Thread.sleep(2000);
	s.getSend().click();
}
}