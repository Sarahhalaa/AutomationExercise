package AutomationExercise.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpAndLoginPage {

	private WebDriver driver;

	public SignUpAndLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	private By name = By.xpath("//input[@placeholder='Name']");
	private By email = By.xpath("//input[@data-qa='signup-email']");
	private By signUpBtn = By.xpath("//button[normalize-space()='Signup']");
	private By NewUserSignUpMsg = By.xpath("//h2[normalize-space()='New User Signup!']");

	public void verifyNewUserSignUpMessage() {
		driver.findElement(NewUserSignUpMsg).isDisplayed();
	}

	public RegisterationPage NewUserSignUp() {
		driver.findElement(name).sendKeys("sarah");
		driver.findElement(email).sendKeys("sarahhalaa72@gmail.com");
		driver.findElement(signUpBtn).click();
		return new RegisterationPage(driver);
	}
}
