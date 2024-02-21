package AutomationExercise.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	private By HomeLink = By.xpath("//a[normalize-space()='Home']");
	private By SignUpAndLoginBtn = By.className("fa-lock");
	private By loggedInMessage = By.xpath("//b[normalize-space()='sarah']");
	private By deleteAcc = By.xpath("//a[normalize-space()='Delete Account']");

	public void VerifySuccessfulPageLoading() {
		driver.findElement(HomeLink).isDisplayed();
	}

	public SignUpAndLoginPage clickOnSignUpAndLoginBtn() {
		driver.findElement(SignUpAndLoginBtn).click();
		return new SignUpAndLoginPage(driver);
	}
	public void VerifyVisibiltyOfLoggedInMessage() {
		driver.findElement(loggedInMessage).isDisplayed();
	}
	public DeletionMessagePage deleteAccount() {
		driver.findElement(deleteAcc).click();
		return new DeletionMessagePage (driver);
	}
}
