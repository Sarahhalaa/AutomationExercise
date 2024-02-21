package AutomationExercise.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomeMessagePage {
	private WebDriver driver;

	public WelcomeMessagePage(WebDriver driver) {
		this.driver = driver;
	}

	private By AccountCreatedMessage = By.xpath("//b[normalize-space()='Account Created!']");
	private By continueButton = By.className("btn-primary");

	public void VerifyVisibilityAccountCreatedMessage() {
		driver.findElement(AccountCreatedMessage).isDisplayed();
	}

	public HomePage TestContinue() {
		driver.findElement(continueButton).click();
		return new HomePage(driver);
	}
}