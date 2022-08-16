package pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.parabankBase.BasePages;

public class LoginPage extends BasePages {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	public void loginInWebsite(String username,String password) {
		this.username.sendKeys(username);
		this.password.sendKeys(password);
	}

}
