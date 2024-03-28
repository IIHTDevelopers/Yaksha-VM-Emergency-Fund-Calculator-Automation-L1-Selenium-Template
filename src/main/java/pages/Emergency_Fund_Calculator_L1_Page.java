package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Emergency_Fund_Calculator_L1_Page extends StartupPage {

	By personalFinancepage=By.xpath("");
	By emergencyFundCalculator=By.xpath("");
	By medicalDentalCostsTextField=By.xpath("");
	By vehicleRepaircostTextField=By.xpath("");
	By otherCostTextField=By.xpath("");
	By lifeInsurancePremiumTextField=By.xpath("");
	By homeAndAutoInsurancePremiumTextField=By.xpath("");
	By homeLoanAndOtherImportantEMIsTextField=By.xpath("");
	By monthlyLivingExpensesTextField=By.xpath("");
	By monthUnemployedTextField=By.xpath("");
	By calculateButton=By.xpath("");
	By uninsuredOrUnexpectedEmergenciesField=By.xpath(""); 
	By annualAmountOfFixedPaymentsField=By.xpath("");
	By buildReserveToPayForJobLossField=By.id("");
	By resultField=By.xpath("");
	
	
	String pageName = this.getClass().getSimpleName();
	public Emergency_Fund_Calculator_L1_Page(WebDriver driver) 
	{
		super(driver);
	}
	
	/**@Test1
	 * about this method navigateToEmergencyfundCalculator() 
	 * @param : null
	 * @description : go to the personal finance page and click on the emergency Fund Calculator
	 * @return : String
	 * @author : Yaksha
	 */
	public String navigateToEmergencyfundCalculator() throws Exception {
		
		return null;
	}

	/**@Test2
	 * about this method entermedicalDentalCost() 
	 * @param : Map<String, String>
	 * @description : enter medical Dental Cost
	 * @return : String
	 * @author : Yaksha
	 */
	public String entermedicalDentalCost(Map<String, String> expectedData) throws Exception {
		
		return null;
	}
	
	
	/**@Test3
	 * about this method enterVehicleRepaircost() 
	 * @param : Map<String, String>
	 * @description : enter Vehicle Repair cost
	 * @return : String
	 * @author : Yaksha
	 */
	public String enterVehicleRepaircost(Map<String, String> expectedData) throws Exception {
		
		return null;
	}
	
	/**@Test4
	 * about this method enterVehicleRepaircost() 
	 * @param : Map<String, String>
	 * @description : enter Other Cost
	 * @return : String
	 * @author : Yaksha
	 */
	public String enterOtherCost(Map<String, String> expectedData) throws Exception {
		
		return null;
	}
	
	
	
	/**@Test5
	 * about this method enterVehicleRepaircost() 
	 * @param : Map<String, String>
	 * @description : enter Life Health Insurance Premium 
	 * @return : String
	 * @author : Yaksha
	 */
	public String enterLifeHealthInsurancePremiumToBePaid(Map<String, String> expectedData) throws Exception {
		
		return null;
	}
	
	
	/**@Test6
	 * about this method enterHomeAndAutoInsurancePremiumTobePaid() 
	 * @param : Map<String, String>
	 * @description : enter Home And Auto Insurance Premium
	 * @return : String
	 * @author : Yaksha
	 */
	public String enterHomeAndAutoInsurancePremiumTobePaid(Map<String, String> expectedData) throws Exception {
		
		return null;
	}
	
	/**@Test7
	 * about this method enterHomeLoanAndOtherImportantEMIToBePaid() 
	 * @param : Map<String, String>
	 * @description : enter Home Loan And Other Important EMI
	 * @return : String
	 * @author : Yaksha
	 */
	public String enterHomeLoanAndOtherImportantEMIToBePaid(Map<String, String> expectedData) throws Exception {
		
		return null;
	}
	
	
	/**@Test8
	 * about this method enterMonthlylivingExpenses() 
	 * @param : Map<String, String>
	 * @description : enter Monthly living Expenses
	 * @return : String
	 * @author : Yaksha
	 */
	public String enterMonthlylivingExpenses(Map<String, String> expectedData) throws Exception {
		
		return null;
	}
	
	/**@Test9
	 * about this method enterNumberofMonthsIfUnemployed() 
	 * @param : Map<String, String>
	 * @description : enter Number of Months If Unemployed
	 * @return : String
	 * @author : Yaksha
	 */
	public String enterNumberofMonthsIfUnemployed(Map<String, String> expectedData) throws Exception {
		
		return null;
	}
	
	/**@Test10
	 * about this method clickonCalculateButton() 
	 * @param : null
	 * @description : click on Calculate Button
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean clickonCalculateButton() throws Exception {
		
		return false;
	}
	
	/**@Test11
	 * about this method checkUninsuredEmergencyAmountrequired() 
	 * @param : null
	 * @description : check Uninsured Emergency Amount required
	 * @return : String
	 * @author : Yaksha
	 */
	public String checkUninsuredEmergencyAmountrequired() throws Exception {
		
		return null;
	}
	
	/**@Test12
	 * about this method checkAnnualAmountOfFixedPaymentsToBedone() 
	 * @param : null
	 * @description : check annual Amount Of Fixed Payments Field is displayed
	 * @return : String
	 * @author : Yaksha
	 */
	public String checkAnnualAmountOfFixedPaymentsToBedone() throws Exception {
		
		return null;
	}
	
	/**@Test13
	 * about this method checkTotalAmountOfReserveToBeBuild() 
	 * @param : null
	 * @description : check build Reserve To Pay For Job Loss Field is diplayed
	 * @return : String
	 * @author : Yaksha
	 */
	public String checkTotalAmountOfReserveToBeBuild() throws Exception {
		
		return null;
	}
	
	/**@Test14
	 * about this method checktheResult() 
	 * @param : null
	 * @description : check the result is present or not and print the result
	 * @return : String
	 * @author : Yaksha
	 */
	public String checktheResult() throws Exception {
		
		return null;
	}
}
