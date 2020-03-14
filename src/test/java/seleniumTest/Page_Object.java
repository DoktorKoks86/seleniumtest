package seleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_Object {

	WebDriver driver;

	public Page_Object(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")
	private WebElement usernameInput;

	@FindBy(className = "gNO89b")
	private WebElement browserButton;

	void insertText(String text) {
		usernameInput.sendKeys(text);
	}

	void pushThebutton() {
		browserButton.click();
	}

}
