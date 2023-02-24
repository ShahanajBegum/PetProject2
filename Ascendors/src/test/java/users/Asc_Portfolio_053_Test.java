package users;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomRepository.CilentPage;
import pomRepository.PortfolioPage;

public class Asc_Portfolio_053_Test extends BaseClass {
	@Test
	public void Tc_01() throws InterruptedException {
		PortfolioPage s=new PortfolioPage(driver);
	Thread.sleep(2000);
	s.getPortfolio().click();
	Thread.sleep(2000);
}
}
