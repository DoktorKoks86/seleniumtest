package seleniumTest;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;

public class FccTest extends Object_FCC {

	@Before
	public void setUp() throws Exception {
		startBrowser(urlFCC);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@After
	public void tearDown() throws Exception {
		quitBrowser();
	}

	@Test
	public void smokeTestLoginPage() throws InterruptedException {
		Assert.assertTrue(loginFrameFCC().isDisplayed(), "login frame is not displayed");
		Assert.assertTrue(loginInputFcc().isDisplayed(), "login input is not displed");
		Assert.assertTrue(passInputFCC().isDisplayed(), "password input is not displed");
		insertLoginFCC();
		insertPassFCC();
		insertDomian();
		Assert.assertTrue(LoginButton().isDisplayed(), "login button is not displayed");
		pushLoginButton();
		Assert.assertTrue(widowFaildLogin().isDisplayed(), "the window with info about failed login is not displed");
		System.out.println(widowFaildLogin().getText() + " - test DONE");
		pushOKButton();

	}
}
