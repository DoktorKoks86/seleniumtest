package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Object extends Config {

	public static WebDriver driver;

	public static void startBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Cz³owiek\\maven_selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);

	}

	public static void quitBrowser() {
		driver.quit();
	}

	public WebElement getToServiceButton() {
		return popUpWindow().findElement(By.cssSelector("button.cmp-button_button.cmp-intro_acceptAll"));
	}

	public WebElement popUpWindow() {
		return driver.findElement(By.className("cmp-popup_content"));
	}

	void pushThebutton() {
		getToServiceButton().click();
	}

}

