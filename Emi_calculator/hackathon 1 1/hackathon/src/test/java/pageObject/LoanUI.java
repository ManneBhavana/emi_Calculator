package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.FindBy;
import org.testng.Assert;





public class LoanUI extends BasePage{
	
	public LoanUI(WebDriver driver) {
		// BasePage constructor //
			super(driver);
		}
	public Actions act = new Actions(driver);
	
		//Main Menu Element
		@FindBy(xpath = "//a[@id = 'menu-item-dropdown-2696']")
		WebElement mainMenuBtn;
		
		//loanCalculatorElement
		@FindBy(xpath="//*[@id=\"menu-item-2423\"]/a")
		WebElement loanCalBtn;
		
		//loan Amount Calculator Button
		@FindBy(xpath="//*[@id=\"loan-amount-calc\"]/a[1]")
		WebElement loanAmtCalculatorBtn;
		
		//EMI textbox 
		@FindBy(id="loanemi") 
		 WebElement emi;
		 
		//EMI slider
		@FindBy(id="loanemislider") 
		 WebElement emiSlider;
		
		//loan interest textbox
		@FindBy(id="loaninterest") 
		 WebElement loanInterest;
		 
		//loan interest slider
		@FindBy(id="loaninterestslider") 
		 WebElement loanInterestSlider;
		
		//loan tenure textbox
		@FindBy(id="loanterm") 
		 WebElement loanTerm;
		 
		//loan tenure slider
		@FindBy(id="loantermslider") 
		 WebElement loanTermSlider;
		
		//month button
		@FindBy(xpath="//*[@id=\"ltermwrapper\"]/div[1]/div/div/div/div/div/label[2]") 
		 WebElement month;
		 
		//Year button
		@FindBy(xpath="//*[@id=\"ltermwrapper\"]/div[1]/div/div/div/div/div/label[1]") 
		 WebElement year;
		
		//fees and charges textbox
		@FindBy(id="loanfees") 
		 WebElement feeCharges;
		
		//LoanTentureSlider Point
		@FindBy(xpath="//*[@id='loantermslider']/span")
		WebElement LoanTenureSliderPoint;
		
		//LoanTenureSlider
		@FindBy(id="loantermslider")
		WebElement loanTenureSlider;
		
		//Navigator for the page
		public void menuBar() {
			mainMenuBtn.click();
			loanCalBtn.click();
			loanAmtCalculatorBtn.click();
		}
		
		//EMI textbox Validation
		public void EMIValidation() 
		 { 
		 
			 if(emi.isDisplayed()) 
			 { 
			 Assert.assertTrue(true);
			 System.out.println("EMI text box is displayed");
			 } 
			 else
			 { Assert.fail();
			 System.out.println("EMI text box is not displayed");
			 } 
			 
			 if(emi.isEnabled()) 
			 { 
			 Assert.assertTrue(true);
			 System.out.println("EMI text box is enabled");
			 } 
			 else
			 { 
			 Assert.fail();
			 System.out.println("EMI text box is not displayed");
			 }
		 
		 }
		
		//EMI slider validation
		public void EMISliderValidation() 
		 { 
		 
			 if(emiSlider.isDisplayed()) 
			 { 
			 Assert.assertTrue(true);
			 System.out.println("EMI Slider is displayed");
			 } 
			 else
			 { 
			 Assert.fail();
			 System.out.println("EMI Slider is not displayed");
			 } 
			 
			 if(emiSlider.isEnabled()) 
			 { 
			 Assert.assertTrue(true);
			 System.out.println("EMI Slider is enabled");
			 } 
			 else
			 { 
			 Assert.fail();
			 System.out.println("EMI Slider is not displayed");
			 } 
			 
			 Action int_r = (Action)act.dragAndDropBy(emiSlider, 200, 0).build();
		        int_r.perform();
		        String int_rate = emi.getAttribute("value");
				Assert.assertEquals(int_rate,"81,000.01");

		 }
		
		//Interest Rate textbox validation
		public void interestRate() 
		 { 
		 
			 if(loanInterest.isDisplayed()) 
			 { 
			 Assert.assertTrue(true);
			 System.out.println("Interest Rate text box is displayed");
			 } 
			 else
			 { 
			 Assert.fail();
			 System.out.println("Interest Rate text box is not displayed");
			 } 
			 
			 if(loanInterest.isEnabled())  
			 { 
			 Assert.assertTrue(true);
			 System.out.println("Interest Rate text box is enabled");
			 } 
			 else
			 { 
			 Assert.fail();
			 System.out.println("Interest Rate text box is not displayed");
			 } 
		 }
		
		//Interest rate Slider Validation
		public void interestRateSlider() 
		 { 
		 
			 if(loanInterestSlider.isDisplayed()) 
			 { 
			 Assert.assertTrue(true);
			 System.out.println("Interest Rate Slider is displayed");
			 } 
			 else
			 { 
			 Assert.fail();
			 System.out.println("Interest Rate Slider is not displayed");
			 } 
			 
			 if(loanInterestSlider.isEnabled()) 
			 { 
			 Assert.assertTrue(true);
			 System.out.println("Interest Rate Slider is enabled");
			 } 
			 else
			 { 
			 Assert.fail();
			 System.out.println("Interest Rate Slider is not enabled");
			 }
			 
			 
					Action int_r = (Action)act.dragAndDropBy(loanInterestSlider, 300, 0).build();
			        int_r.perform();
			        String int_rate = loanInterest.getAttribute("value");
					Assert.assertEquals(int_rate,"19.25");
		 }
		
		//LoanTenure Textbox validation
		public void loanTenureUI() 
		 { 
			 if(loanTerm.isDisplayed()) 
			 { 
			 Assert.assertTrue(true);
			 System.out.println("Loan Tenure text box is displayed");
			 } 
			 else
			 { 
			 Assert.fail();
			 System.out.println("Loan Tenure text box is not displayed");
			 } 
			 
			 if(loanTerm.isEnabled()) 
			 { 
			 Assert.assertTrue(true);
			 System.out.println("Loan Tenure text box is enabled");
			 } 
			 else
			 { 
			 Assert.fail();
			 System.out.println("Loan Tenure text box is not enabled");
			 } 
		 } 
		 
		//Loan Tenure Year Button Validation
		 public void loanTenureYearUI() 
		 { 
		 
			 if(year.isDisplayed()) 
			 { 
			 Assert.assertTrue(true);
			 System.out.println("Loan Tenure year button is displayed");
			 } 
			 else
			 { 
			 Assert.fail();
			 System.out.println("Loan Tenure year button is not displayed");
			 } 
			 
			 if(year.isEnabled()) 
			 { 
			 Assert.assertTrue(true);
			 System.out.println("Loan Tenure year button is enabled");
			 } 
			 else
			 { 
			 Assert.fail();
			 System.out.println("Loan Tenure year button is not enabled");
			 } 
		 } 
		
		 //Loan Tenure Month Button validation
		 public void loanTenureMonthUI() 
			 { 
			 if(month.isDisplayed()) 
			 { 
			 Assert.assertTrue(true);
			 System.out.println("Loan Tenure month button is displayed");
			 } 
			 else
			 { 
			 Assert.fail();
			 System.out.println("Loan Tenure month button is not displayed");
			 } 
			 
			 if(month.isEnabled()) 
			 { 
			 Assert.assertTrue(true);
			 System.out.println("Loan Tenure month button is enabled");
			 }  
			 else
			 { 
			 Assert.fail();
			 System.out.println("Loan Tenure month button is not enabled");
			 } 
		 }
		 
		 public void tenureSlider() 
		 { 
		 
			 if(loanTenureSlider.isDisplayed()) 
			 { 
			 Assert.assertTrue(true);
			 System.out.println("Tenure Slider is displayed");
			 } 
			 else
			 { 
			 Assert.fail();
			 System.out.println("Tenure Slider is not displayed");
			 } 
			 
			 if(loanTenureSlider.isEnabled()) 
			 { 
			 Assert.assertTrue(true);
			 System.out.println("Tenure Slider is enabled");
			 } 
			 else
			 { 
			 Assert.fail();
			 System.out.println("Tenure Slider is not enabled");
			 }
		 	 
			 
				Action int_r = (Action)act.dragAndDropBy(loanTenureSlider, 300, 0).build();
			    int_r.perform();
			    String int_rate = loanTerm.getAttribute("value");
			    Assert.assertEquals(int_rate,"19.25");
		 }
		 
		 //Fees and Charges Textbox validation
		 public void feesAndChargesUI() 
		 { 
			 if(feeCharges.isDisplayed()) 
			 { 
			 Assert.assertTrue(true);
			 System.out.println("Fees & Charges text box is displayed");
			 } 
			 else
			 { 
			 Assert.fail();
			 System.out.println("Fees & Charges text box is not displayed");
			 } 
			 
			 if(feeCharges.isEnabled()) 
			 { 
			 Assert.assertTrue(true);
			 System.out.println("Fees & Charges text box is enabled");
			 } 
			 else
			 { 
			 Assert.fail();
			 System.out.println("Fees & Charges text box is not displayed");
			 } 
		 }
		
		 //Loan Tenure Slider validation of year and month
		 public void slider() throws InterruptedException 
		 { 
			 loanTerm.sendKeys(Keys.chord(Keys.CONTROL, "a"),"2");
			 Thread.sleep(1000);
			 loanTerm.sendKeys(Keys.ENTER);
			 
			 Thread.sleep(3000);
			 String s1=LoanTenureSliderPoint.getAttribute("style");
			 
			 System.out.println(s1);
			 
			 month.click();
			 loanTerm.sendKeys(Keys.chord(Keys.CONTROL, "a"),"24");
			 loanTerm.sendKeys(Keys.ENTER);
			 
			 Thread.sleep(3000);
			 
			 String s2=LoanTenureSliderPoint.getAttribute("style");
			 
			 System.out.println(s2);
			 
			 Assert.assertEquals(s1, s2);
			 System.out.println("Both values in slider is same for year and month");

		 }
		 
		 
		
}
		
