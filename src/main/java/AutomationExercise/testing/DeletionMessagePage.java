package AutomationExercise.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeletionMessagePage {
	private WebDriver driver;

	public DeletionMessagePage(WebDriver driver) {
		this.driver = driver;
	}

	private By AccountDeletedMessage = By.xpath("//b[normalize-space()='Account Deleted!']");
	private By continueButton = By.className("btn-primary");

	public void VerifyVisibilityAccountDeletionMessage() {
		driver.findElement(AccountDeletedMessage).isDisplayed();
	}

	public void TestContinue() {
		driver.findElement(continueButton).click();
	}

}

