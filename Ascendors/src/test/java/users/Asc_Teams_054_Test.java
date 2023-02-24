package users;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomRepository.PortfolioPage;
import pomRepository.TeamsPage;

public class Asc_Teams_054_Test extends BaseClass{
	@Test
	public void Tc_01() throws InterruptedException {
		TeamsPage s=new TeamsPage(driver);
	Thread.sleep(2000);
	s.getTeams().click();
	Thread.sleep(2000);
}

}
