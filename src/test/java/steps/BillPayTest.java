package steps;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.parabankBase.BasePages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesPOM.BillPayPage;
import pagesPOM.LoginPage;

public class BillPayTest extends BasePages {
	BillPayPage b;
	@When("click bill pay button")
	public void  click_bill_pay_button() {
		b=new BillPayPage();
		b.clickOnBillPay();
	}

	@When("enter a valid {string} and {string} and {string} {string}")
	public void enter_a_valid_and_and(String string, String string2, String string3, String string4) {
		b=new BillPayPage();
		b.addData(string, string2, string3, string4);
	}

	@When("enter {string} and {string}")
	public void enter_and(String string, String string2) {
		b=new BillPayPage();
		b.addData(string, string2);
	}

	@When("enter {string} and {string} and enter {string}")
	public void enter_and_and_enter(String string, String string2, String string3) {
		b=new BillPayPage();
		b.addData(string, string2, string3);
	}

	@When("enter send payement button")
	public void enter_send_payement_button() {
		b=new BillPayPage();
		b.SendData();
	}

	@Then("will display Bill Payment Complete")
	public void will_display_bill_payment_complete() {
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(20));
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"rightPanel\"]/div/div[2]/h1")));
		//Bill Payment Complete
		Assert.assertEquals("Bill Payment Complete",driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[2]/h1")).getText());
		//driver.findElement(By.linkText("Log Out")).click();

	}
	


}
