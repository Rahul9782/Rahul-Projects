package StepDefination;

import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps extends Base{

@Given("Open the Browser")
public void open_the_browser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	Log = new Login(driver);
	 
}

@Given("open the URL {string}")
public void open_the_url(String URL) {
     driver.get(URL);
         
}

@When("Click on UserName field and enter username {string}")
public void click_on_user_name_field_and_enter_username(String Username) {
     Log.ClickonUN();
     Log.EnteronUN(Username);
     
}

@When("Click on Password field and enter password {string}")
public void click_on_password_field_and_enter_password(String Password) {
     Log.ClickonPW();
     Log.EnteronPW(Password);
     
}

@Then("Click on Login Button")
public void click_on_login_button() throws InterruptedException {
     Log.ClickonLG();
     Log.LogOut();
     
}


}
