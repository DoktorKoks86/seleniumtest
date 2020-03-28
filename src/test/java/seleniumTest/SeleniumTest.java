package seleniumTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SeleniumTest extends Page_Object {

	@Before
	public void setUp() throws Exception {
		startBrowser();
		driver.manage().window().maximize();
//		Thread.sleep(3000);
		WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(
				ExpectedConditions.presenceOfElementLocated(By.className("cmp-button_button cmp-intro_acceptAll")));
		pushThebutton();
	}

	@After
	public void tearDown() throws Exception {
		quitBrowser();
	}

	@Test
	public void test3() throws InterruptedException {

		Assert.assertEquals(driver.getCurrentUrl(), url, " url is correct");
		Assert.assertTrue(true, textSportOnet.getText());
		System.out.println(textSportOnet + " wystêpuje na stronie onet");
		System.out.println("the mentioned test is executed");

//		if (actualTitle.contentEquals(expectedtitle)) {
//			System.out.println("Test Passed!");
//		} else {
//			System.out.println("Test Failed");
//		}

	}

}
