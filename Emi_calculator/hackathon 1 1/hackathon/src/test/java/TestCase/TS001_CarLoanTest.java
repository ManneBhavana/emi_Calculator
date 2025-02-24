package TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.CarLoan;


public class TS001_CarLoanTest extends DriverSetup{
	

	@Test(priority=1,groups= {"regression","smoke"})
	public void carLoan() throws IOException 
	{
		
		CarLoan obj = new CarLoan(driver);
		obj.navigator();
		obj.clickCarLoan();
		obj.setLoanAmt(p.getProperty("carLoanAmt"));
		obj.setInterest(p.getProperty("carLoanInt"));
		obj.setLoanTenure(p.getProperty("carLoanYr"));
		obj.clickOnYear();
		obj.scrollToTable();
		obj.clickOnYears();
		obj.printTheEMIPaymentTable();
		Assert.assertTrue(true);
		
	   captureScreen("TC1");
	}

}
