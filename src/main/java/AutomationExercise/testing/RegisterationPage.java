package AutomationExercise.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterationPage {
	private WebDriver driver;

	public RegisterationPage(WebDriver driver) {
		this.driver = driver;
	}

	private By EnterAccountInformationMessage = By.xpath("//b[normalize-space()='Enter Account Information']");
	private By title = By.id("id_gender2");
	// private By name = By.id("name");
	// private By email = By.id("email");
	private By password = By.id("password");
	private By newsLetter = By.name("newsletter");
	private By option = By.xpath("//label[@for='optin']");
	private By Firstname = By.id("first_name");
	private By Lastname = By.id("last_name");
	private By company = By.id("company");
	private By address = By.id("address1");
	private By address2 = By.id("address2");
	private By state = By.id("state");
	private By city = By.id("city");
	private By zipcode = By.id("zipcode");
	private By mobileNumber = By.id("mobile_number");
	private By SignUpButton = By.xpath("//button[normalize-space()='Create Account']");

	public void VerifyVisibilityEnterAccountInformationMessage() {
		driver.findElement(EnterAccountInformationMessage).isDisplayed();
	}

	public WelcomeMessagePage TestSuccessfulRegister() {
		driver.findElement(title).click();
		// driver.findElement(name).sendKeys("Sarah");
		// driver.findElement(email).sendKeys("Sarahhalaa1@gmail.com");
		driver.findElement(password).sendKeys("Abdc@1234567");
		driver.findElement(Firstname).sendKeys("Sarah");
		driver.findElement(Lastname).sendKeys("Alaa");
		driver.findElement(company).sendKeys("Testing Company");
		driver.findElement(address).sendKeys("New Cairo");
		driver.findElement(address2).sendKeys("Heliopolis");
		driver.findElement(state).sendKeys("state");
		driver.findElement(city).sendKeys("Cairo");
		driver.findElement(zipcode).sendKeys("12345");
		driver.findElement(newsLetter).click();
		driver.findElement(option).click();
		driver.findElement(mobileNumber).sendKeys("01126644066");
		driver.findElement(SignUpButton).click();
		return new WelcomeMessagePage(driver);
	}
}
