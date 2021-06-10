package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {
	WebDriver driver;
	WebElement succsuccessfulLoginLabel;

	public MyAccountPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getSuccsuccessfulLoginLabel() {
		return driver.findElement(By.className("info-account"));
	}
	public String assertSuccsuccessfulLoginLabel() {
		return this.getSuccsuccessfulLoginLabel().getText();
		
	}
	
	
	

}
