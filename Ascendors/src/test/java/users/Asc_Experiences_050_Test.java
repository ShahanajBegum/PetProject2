package users;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomRepository.ExperiencePage;
import pomRepository.ServicePage;

public class Asc_Experiences_050_Test extends BaseClass{
	@Test
	public void Tc_01() throws InterruptedException {
	ExperiencePage s=new ExperiencePage(driver);
	Thread.sleep(2000);
	s.getExperience().click();
	Thread.sleep(2000);
	
}
}
