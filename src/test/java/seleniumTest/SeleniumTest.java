package seleniumTest;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;

public class SeleniumTest extends Page_Object {

	@Before
	public void setUp() throws Exception {
		startBrowser();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@After
	public void tearDown() throws Exception {
		quitBrowser();
	}

	@Test
	public void goodUser() throws InterruptedException {

		Assert.assertTrue(popUpWindow().isDisplayed(), "not displayed");
		Assert.assertTrue(getToServiceButton().isDisplayed(), "not displayed");
		Assert.assertEquals(url, driver.getCurrentUrl(), " url is not correct");
		pushThebutton();
		Assert.assertTrue(mailButton().isDisplayed(), "The mail button did not display");
		System.out.println(textFromMailButton().getText() + " is mentioned on onet webside");
		pushTheMailButton();
		Assert.assertTrue(passwordField().isDisplayed(), "The password label did not display");
		Assert.assertTrue(loginField().isDisplayed(), "The login field is not displayed");
		insertLogin(login);
		insertPassword(password);
		pushTheLoginButton();
		Assert.assertEquals(driver.getCurrentUrl(), postPageUrl);
		System.out.println("url of the post page is " + driver.getCurrentUrl());

	}

	@Test
	public void badUser() throws InterruptedException {

		Assert.assertTrue(popUpWindow().isDisplayed(), "not displayed");
		Assert.assertTrue(getToServiceButton().isDisplayed(), "not displayed");
		Assert.assertEquals(url, driver.getCurrentUrl(), " url is not correct");
		pushThebutton();
		Assert.assertTrue(mailButton().isDisplayed(), "The mail button did not display");
		System.out.println(textFromMailButton().getText() + " is mentioned on the onet webside");
		pushTheMailButton();
		Assert.assertTrue(passwordField().isDisplayed(), "The password label did not display");
		Assert.assertTrue(loginField().isDisplayed(), "The login field is not displayed");
		insertLogin(fakelogin);
		insertPassword(fakePasword);
		pushTheLoginButton();
		Assert.assertEquals(driver.getCurrentUrl(), urlAfterInputFakeCredentials);
		System.out.println("url of the post page is " + driver.getCurrentUrl()
				+ " it's mean that you inserted wrong credentials - DONE");
		Assert.assertTrue(InfoAboutFaildLogin().isDisplayed(), " the info about wrong credentials is not displayed");
		System.out.println(InfoAboutFaildLogin().getText() + " - the mentoned text appered on the website");
	}

}

/* 51 linia -> przycisk na popup pushThebutton dodac waita, który czeka na niewidocznoœæ elementu -> test nie przejdzie do póki nie zniknie/ bêdzie niewidoczny


*/