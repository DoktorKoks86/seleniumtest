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

	public WebElement mailButton() {
		return driver.findElement(By.cssSelector("li.headerNavItem.mail")); 

	}
	
	public WebElement textFromMailButton() {
		return mailButton().findElement(By.xpath("//span[contains(@class, 'serviceName') and text() = 'E-MAIL']"));
	}
	public WebElement loginField() {
		return driver.findElement(By.cssSelector("input#mailFormLogin"));
	}
	
	public WebElement passwordField() {
		return driver.findElement(By.cssSelector("input#mailFormPassword"));
	}
	
	public WebElement loginLabel() {
		return driver.findElement(By.xpath("[contains(@class,'label.inputData') and contains(text(),'Podaj e-mail:')]"));
	}
	
	public WebElement passwordLabel() {
		return driver.findElement(By.xpath("[contains(@class,'label.inputData') and contains(text(),'Has³o:')]"));
	}
	
	public WebElement loginButton() {
		return driver.findElement(By.cssSelector("input.loginButton"));
	}
	
		
	void pushThebutton() {
		getToServiceButton().click();
	}
	
	void pushTheMailButton() {
		mailButton().click();
	}
	
	void insertLogin() {
		loginField().sendKeys("antek.wilk@onet.pl");
	}
	
	void insertPassword() {
		passwordField().sendKeys("DoktorKoks86");
	}
	
	void pushTheLoginButton() {
		loginButton().click();
	}

}

