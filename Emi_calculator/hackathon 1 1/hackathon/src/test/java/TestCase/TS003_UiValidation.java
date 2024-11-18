package TestCase;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;


import pageObject.LoanUI;

public class TS003_UiValidation extends DriverSetup {
	//LoanUI ui;
	
	
	@Test(priority=3,groups={"smoke","sanity"})
	public void uiValidation() throws InterruptedException, IOException {
		
		LoanUI loan = new LoanUI(driver);
		loan.menuBar();
		loan.EMIValidation();
		loan.EMISliderValidation();
		loan.interestRate();
		loan.interestRateSlider();
		loan.loanTenureUI();
		loan.loanTenureYearUI();
		loan.loanTenureMonthUI();
		loan.feesAndChargesUI();
		loan.slider();
		
		
		captureScreen("TC3");
	}
	
	
}
