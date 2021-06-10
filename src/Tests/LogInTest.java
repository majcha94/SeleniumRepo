package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;



public class LogInTest extends BaseTest {
	@BeforeMethod
	public void preSvakogTesta() {
		driver.navigate().to(homeUrl);
		driver.manage().window().maximize();
	}
	@Test
	public void logInWIthValidCredential() {
		String email = citacIzExcela.getStringData("LOGIN and LOG OUT", 9, 2);
		String password = citacIzExcela.getStringData("LOGIN and LOG OUT", 10, 2);
		logInFormFilling(email, password);
		String acutalText = myAccountPage.assertSuccsuccessfulLoginLabel();
		assertEquals(acutalText, "Welcome to your account. "
				+ "Here you can manage all of your personal information and orders.");
		
	}
	public void logInFormFilling(String email, String password) {
		mainPage.clickOnButtonSignIn();
		signInPage.insertEmailAddres(email);
		signInPage.insertPassword(password);
		signInPage.clickOnSignInButton();
	}
	
	@AfterMethod
	public void posleSvakogTesta() throws InterruptedException {		
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}

}
