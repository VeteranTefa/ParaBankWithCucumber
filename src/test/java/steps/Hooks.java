package steps;

import java.io.IOException;

import com.parabankBase.BasePages;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BasePages {

	
	@Before()
	public void runsBeforeSceanrio() throws InterruptedException {
	
		System.out.println("Run Before every Scenario");
		Thread.sleep(3000);
	}
//	
	@After
	public void runsAfterScenario() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
}
