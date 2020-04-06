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
	public void test3() throws InterruptedException {

		Assert.assertTrue(popUpWindow().isDisplayed(), "not displayed");
		Assert.assertTrue(getToServiceButton().isDisplayed(), "not displayed");
		Assert.assertEquals(url, driver.getCurrentUrl(), " url is not correct");
		pushThebutton();
		Thread.sleep(3000);
        Assert.assertTrue(mailButton().isDisplayed(), "mail button did not display");
        System.out.println(textFromMailButton().getText() + " is mentioned on onet webside");
        pushTheMailButton();
		Thread.sleep(3000);
		insertLogin();
		insertPassword();
		pushTheLoginButton();
		Thread.sleep(4000);

        System.out.println("The text "+ textFromMailButton().getText() + " is mentioned on onet webside");
		
        
        
	}

}

/* wydrukowa� text z buttona mail -> span text element w elemencie (podpowiedz xpath)
oknienko maila do logowania -> klikna� w element -> 2 assercie, zweryfikuj� czy te inputy s� widoczne
-> warto�� w login i has�o (prawdziwe dane)-> zaloguj si� -> assercje
doda� jeszcze jeden test niepoprawne logowanie -> assercja
Najp�zniej do �rody 
dynamiczne wait'y- nast�pny temat --> z Kacprem
*/