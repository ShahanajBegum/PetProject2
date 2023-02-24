package users;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomRepository.CilentPage;
import pomRepository.ExperiencePage;

public class Asc_Cilents_051_Test extends BaseClass{
	@Test
	public void Tc_01() throws InterruptedException {
	CilentPage s=new CilentPage(driver);
	Thread.sleep(2000);
	s.getCilents().click();
	Thread.sleep(2000);
}
}