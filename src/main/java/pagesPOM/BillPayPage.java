package pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parabankBase.BasePages;

public class BillPayPage extends BasePages {
	public BillPayPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Bill Pay")
	WebElement billBtn;
	public void clickOnBillPay() {
		billBtn.click();
	}
	
	@FindBy(name="payee.name")
	WebElement payName;
	
	@FindBy(name="payee.address.street")
	WebElement address;
	
	@FindBy(name="payee.address.city")
	WebElement city;
	
	@FindBy(name="payee.address.state")
	WebElement state;
	public void addData(String payName,String address,String city,String state) {
		this.payName.sendKeys(payName);
		this.address.sendKeys(address);
		this.city.sendKeys(city);
		this.state.sendKeys(state);
		
		
	}
	
	@FindBy(name="payee.address.zipCode")
	WebElement zip;
	
	@FindBy(name="payee.phoneNumber")
	WebElement phone;
	public void addData(String zip,String phone) {
		this.zip.sendKeys(zip);
		this.phone.sendKeys(phone);
		
	}
	
	@FindBy(name="payee.accountNumber")
	WebElement accNum;
	
	@FindBy(name="verifyAccount")
	WebElement verify;
	
	@FindBy(name="amount")
	WebElement amount;
	public void addData(String accountNumber,String verifyAcc,String amountNumber) {
		accNum.sendKeys(accountNumber);
		verify.sendKeys(verifyAcc);
		amount.sendKeys(amountNumber);
	}
	
	@FindBy(css = "input[value='Send Payment']")
	WebElement send;
	public void SendData() {
		this.send.click();
	}
	
}
