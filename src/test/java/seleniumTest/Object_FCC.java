package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Object_FCC extends FccConfig {

	public WebElement logoFCC() {
		return wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".login_logo"))));
	}

	public WebElement loginFrameFCC() {
		return driver.findElement(By.xpath("//h1[text()='Logowanie']"));
	}

	public WebElement loginInputFcc() {
		return driver.findElement(By.xpath("//input[@placeholder='Login']"));
	}

	public WebElement passInputFCC() {
		return driver.findElement(By.xpath("//input[@placeholder='Has³o']"));
	}

	public WebElement domenInput() {
		return driver.findElement(By.xpath("//input[@placeholder='Domena']"));

	}

	public WebElement LoginButton() {
		return driver.findElement(By.xpath("//button[text()='zaloguj']"));
	}

	public WebElement widowFaildLogin() {
		return wait.until(ExpectedConditions
				.visibilityOf(driver.findElement(By.xpath("//div[text()='Logowanie nieudane']"))));
	}

	public WebElement buttonOK() {
		return wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='button' and text()='OK']")));
	}

	void insertLoginFCC() {
		loginInputFcc().sendKeys(fakeLoginFCC);
	}

	void insertPassFCC() {
		passInputFCC().sendKeys(fakePassFCC);
	}

	void insertDomian() {
		domenInput().sendKeys(domenaFCC);
	}

	void pushLoginButton() {
		LoginButton().click();
	}

	void pushOKButton() {
		buttonOK().click();
		wait.until(ExpectedConditions.invisibilityOf(buttonOK()));
	}
}
