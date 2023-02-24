package users;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomRepository.ServicePage;

public class Asc_Services_049_Test extends BaseClass {
	
	@Test
	public void Tc_01() throws InterruptedException {
	ServicePage s=new ServicePage(driver);
	Thread.sleep(3000);
	s.getService().click();
	Thread.sleep(3000);
	s.getDownload().click();
	Thread.sleep(3000);
}

}
