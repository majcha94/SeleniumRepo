package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainNavigationPage {
	WebDriver driver;
	WebElement signInNavigationButton;
	
	public MainNavigationPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getSignInNavigationButton() {
		return driver.findElement(By.className("login0"));
	}
	public void clickOnButtonSignIn() {
		this.getSignInNavigationButton().click();
	}
	
	
	

}
