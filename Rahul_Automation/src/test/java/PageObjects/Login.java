package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	WebDriver idriver;
	
	public Login(WebDriver rdriver) {
		
		idriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
		@FindBy(id= "ctl00_MainMenu_DXI0_Img")
		WebElement home;
		
		@FindBy(id="PnlLoginPage_loginControl_UserName")
		WebElement username;
    
		@FindBy(id="PnlLoginPage_loginControl_Password")
		WebElement password;
		
		@FindBy(id="PnlLoginPage_loginControl_LoginButton")
		WebElement login;
		
		@FindBy(id="ctl00_userLoginStatus")
		WebElement logout;
		
		public void home() {
			home.click();
		}
		public void ClickonUN() {
			
			username.clear();
			username.click();
			
		}
		public void EnteronUN(String UN) {
			
			username.sendKeys(UN);
		}
		public void ClickonPW() {
			
			password.clear();
			password.click();
			
		}
		public void EnteronPW(String PS) {
			
			password.sendKeys(PS);
		}
		public void ClickonLG() {
			
			login.click();
			
		}
		public void LogOut() throws InterruptedException {
			Thread.sleep(2000);
			logout.click();
		}
		
}
   
 	