package TestCase;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObject.HomeLoan;

public class TS002_HomeLoanTest extends DriverSetup{
	
	
	
	@Test(priority=2,groups= {"regression","sanity"})
	public void homeloan() throws IOException, InterruptedException
	{
		HomeLoan home = new HomeLoan(driver);
		home.navigator();
		home.scrollToTable();
		home.getTableData();
		//home.loantable();
		
		captureScreen("TC2");
		
	}

}
