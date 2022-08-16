package steps;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.parabankBase.BasePages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesPOM.LoginPage;

public class LoginTest extends BasePages   {
	
	
	LoginPage login;
	@Given("user should be exist in website or home page")
	public void user_should_be_exist_in_website_or_home_page() throws IOException, InterruptedException {
		openBrowser();
		Thread.sleep(3000);
		
	}

	@When("user enter a valid {string} and valid {string}")
	public void user_enter_a_valid_and_valid(String username, String password) {
		login =new LoginPage();
		login.loginInWebsite(username, password);
	   
	}

	@When("click on login button")
	public void click_on_login_button() {
	  driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
	}

	@Then("login successfuly and enter on overview page")
	public void login_successfuly_and_enter_on_overview_page() {
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/h1")).getText(),"Accounts Overview");
	}
	@When("user enter  invalid {string} and invalid {string}")
	public void user_enter_invalid_and_invalid(String username, String password) {
	    login=new LoginPage();
	    login.loginInWebsite(username, password);
	}

	@Then("will display show error message")
	public void will_display_show_error_message() {
		String x="The username and password could not be verified.";
		Assert.assertEquals(x, driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p")).getText());

	}


}
