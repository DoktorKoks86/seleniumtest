package seleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_Object extends Config {


	public static WebDriver driver;

	public static void startBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Cz³owiek\\maven_selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		
		
	}
	
	public static void quitBrowser(){
		driver.quit();
	}
	
	
	@FindBy(xpath = "//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")
	private WebElement usernameInput;

	@FindBy(className = "gNO89b")
	private WebElement browserButton;
	
	@FindBy(linkText = "Biznes")
	protected WebElement textBiznesOnet;
	
	@FindBy(linkText = "Sport")
	protected WebElement textSportOnet;
	
	@FindBy(css="h1.onetLogo")
	public static WebElement logoOnet;
	
	@FindBy(className ="cmp-button_button cmp-intro_acceptAll")
	private WebElement getToService;
	

	void insertText(String text) {
		usernameInput.sendKeys(text);
	}

    void pushThebutton() {
		getToService.click();
	}
	
	

}

