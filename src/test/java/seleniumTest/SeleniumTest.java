 package seleniumTest;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	public static WebDriver driver;
	public static String url;
	public static String expecterdtitle;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Cz³owiek\\maven_selenium\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	
	
	@Test
	public void test2() throws InterruptedException {
		driver.manage().window().maximize();
		url = "https://www.onet.pl";
		driver.get(url);
		Thread.sleep(3000);

	}

	@Test
	public void test3() throws InterruptedException {
		
		Page_Object object = new Page_Object(driver);
		
		String text = "TEST";
		
		driver.manage().window().maximize();
		url = "https://www.google.pl";
		driver.get(url);
		driver.getTitle();
	
		object.insertText(text);
		Thread.sleep(3000);
		object.pushThebutton();
		Thread.sleep(3000);

	}

}
//  actualTitle = driver.getTitle();
