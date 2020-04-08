package seleniumTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;

public class SeleniumTest extends Page_Object {

	@Before
	public void setUp() throws Exception {
		startBrowser();
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@After
	public void tearDown() throws Exception {
		quitBrowser();
	}

	@Test
	public void test1() throws InterruptedException {

		Assert.assertTrue(popUpWindow().isDisplayed(), "not displayed");
		Assert.assertTrue(getToServiceButton().isDisplayed(), "not displayed");
		Assert.assertEquals(url, driver.getCurrentUrl(), " url is not correct");
		pushThebutton();
		Thread.sleep(3000);
		Assert.assertTrue(mailButton().isDisplayed(), "The mail button did not display");
		System.out.println(textFromMailButton().getText() + " is mentioned on onet webside");
		pushTheMailButton();
		Thread.sleep(3000);
		Assert.assertTrue(passwordField().isDisplayed(), "The password label did not display");
		Assert.assertTrue(loginField().isDisplayed(), "The login field is not displayed");
		insertLogin();
		insertPassword();
		Thread.sleep(3000);
		// System.out.println(loginLabel().getText() +" the mentioned text is
		// displayed");
		pushTheLoginButton();
		Thread.sleep(4000);
		Assert.assertEquals(driver.getCurrentUrl(), postPageUrl);
		System.out.println("url of the post page is " + driver.getCurrentUrl());

	}

	
	@Test public void test2() throws InterruptedException {
	  
	  Assert.assertTrue(popUpWindow().isDisplayed(), "not displayed");
	  Assert.assertTrue(getToServiceButton().isDisplayed(), "not displayed");
	  Assert.assertEquals(url, driver.getCurrentUrl(), " url is not correct");
	  pushThebutton(); Thread.sleep(3000);
	  Assert.assertTrue(mailButton().isDisplayed(),
	  "The mail button did not display");
	  System.out.println(textFromMailButton().getText() +
	  " is mentioned on the onet webside"); pushTheMailButton(); Thread.sleep(3000);
	  Assert.assertTrue(passwordField().isDisplayed(), "The password label did not display");
	  Assert.assertTrue(loginField().isDisplayed(), "The login field is not displayed"); 
	  insertFakeLogin(); 
	  Thread.sleep(3000);
	  insertFakePassword();
	  Thread.sleep(3000);  
	  pushTheLoginButton(); 
	  Thread.sleep(4000);
	  Assert.assertEquals(driver.getCurrentUrl(), urlAfterInputFakeCredentials);
	  System.out.println("url of the post page is "+ driver.getCurrentUrl() + " it's mean that you inserted wrong credentials - DONE");
	  Assert.assertTrue(InfoAboutFaildLogin().isDisplayed(), " the info about wrong credentials is not displayed");
	  System.out.println(InfoAboutFaildLogin().getText() + " - the mentoned text appered on the website");
	  }

}

/*
 * wydrukowaæ text z buttona mail -> span text element w elemencie (podpowiedz
 * xpath) oknienko maila do logowania -> kliknaæ w element -> 2 assercie,
 * zweryfikuj¹ czy te inputy s¹ widoczne -> wartoœæ w login i has³o (prawdziwe
 * dane)-> zaloguj siê -> assercje dodaæ jeszcze jeden test niepoprawne
 * logowanie -> assercja Najpózniej do œrody dynamiczne wait'y- nastêpny temat
 * --> z Kacprem
 */