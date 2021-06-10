package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {
	WebDriver driver;
	WebElement emailAddress;
	WebElement password;
	WebElement signInButton;
	

	public SignInPage(WebDriver driver) {
		super();
		this.driver = driver;
	}


	public WebElement getEmailAddress() {
		return driver.findElement(By.id("email"));
	}
	public void insertEmailAddres(String email) {
		this.getEmailAddress().clear();
		this.getEmailAddress().sendKeys(email);
	}

	public WebElement getPassword() {
		return driver.findElement(By.id("passwd"));
	}
	public void insertPassword(String password) {
		this.getPassword().clear();
		this.getPassword().sendKeys(password);
	}
	
	public WebElement getSignInButton() {
		return driver.findElement(By.id("SubmitLogin"));
	}
	public void clickOnSignInButton() {
		this.getSignInButton().click();
	}
	
	
	

}
