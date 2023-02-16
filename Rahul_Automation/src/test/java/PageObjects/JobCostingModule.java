package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobCostingModule {
	WebDriver idriver;
	
	public JobCostingModule(WebDriver jdriver)
	{
			idriver= jdriver;
			
			PageFactory.initElements(jdriver,this);
	}
	// rahul 
		
		@FindBy(id="ctl00_MainMenu_DXI5_T")
		WebElement Jobcost;
		
		@FindBy(id="ctl00_mainContentPlaceHolder_JobCostGridView_DX-GSDT-col0")
		WebElement CstmUpDw;
		
		@FindBy(id="ctl00_mainContentPlaceHolder_JobCostGridView_DX-GSDT-col1")
		WebElement JobUpDw;
		
		@FindBy(id="ctl00_mainContentPlaceHolder_JobCostGridView_DX-GSDT-col2")
		WebElement ProjectNameUpDw;
		
		@FindBy(id="ctl00_mainContentPlaceHolder_JobCostGridView_DX-GSDT-col3")
		WebElement VersionnameUpdw;
		
		@FindBy(id="ctl00_mainContentPlaceHolder_JobCostGridView_DX-GSDT-col4")
		WebElement EmployeeUpDw;
		
		@FindBy(id="ctl00_mainContentPlaceHolder_JobCostGridView_DX-GSDT-col5")
		WebElement ServiceUpDw;
		
		@FindBy(id="ctl00_mainContentPlaceHolder_JobCostGridView_DX-GSDT-col6")
		WebElement MachineUpDw;
		
		@FindBy(id="ctl00_mainContentPlaceHolder_JobCostGridView_DX-GSDT-col7")
		WebElement OperationUpDw;
		
		@FindBy(id="ctl00_mainContentPlaceHolder_JobCostGridView_DX-GSDT-col8")
		WebElement ShiftUpDw;
		
		@FindBy(id="ctl00_mainContentPlaceHolder_JobCostGridView_DX-GSDT-col9")
		WebElement DateUpDw;
		
		@FindBy(xpath="//a[@onclick='clearGridCookies();']")
		WebElement ResetFilters;
		
		@FindBy(id="ctl00_mainContentPlaceHolder_JobCostGridView_tccell0_1")
		WebElement FirstJob;
		
		@FindBy(id="ctl00_mainContentPlaceHolder_cancelButton_CD")
		WebElement UniversalCancel;
		
		
		public void Jobcost(){
			Jobcost.click();	
		}
		public void CstmUpDw() {
			CstmUpDw.click();
			
		}
		public void JobUpDw() {
			JobUpDw.click();
		}
		public void ProjectNameUpDw() {
			ProjectNameUpDw.click();
		}
		public void VersionnameUpdw() {
			VersionnameUpdw.click();
		}
		public void EmployeeUpDw() {
			EmployeeUpDw.click();
		}
		public void ServiceUpDw() {
			ServiceUpDw.click();
		}
		public void MachineUpDw() {
			MachineUpDw.click();
		}
	    public void OperationUpDw() {
	    	OperationUpDw.click();
	    }
	    public void ShiftUpDw() {
	    	ShiftUpDw.click();
	    }
	    public void DateUpDw() {
	    	DateUpDw.click();
	    }
	    public void ResetFilters() {
	    	ResetFilters.click();
	    }
	    public void FirstJob() {
	    	FirstJob.click();
	    }
	    public void UniversalCancel() {
	    	UniversalCancel.click();
	    }
	
}
