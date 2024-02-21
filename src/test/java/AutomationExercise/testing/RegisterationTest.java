package AutomationExercise.testing;

import org.testng.annotations.Test;

public class RegisterationTest extends baseTests {
	@Test
	public void VerifySuccessfulRegisteration() {
		homePage.VerifySuccessfulPageLoading();
		SignUpAndLoginPage signUpAndLoginPage = homePage.clickOnSignUpAndLoginBtn();
		signUpAndLoginPage.verifyNewUserSignUpMessage();
		RegisterationPage registerationPage = signUpAndLoginPage.NewUserSignUp();
		registerationPage.VerifyVisibilityEnterAccountInformationMessage();
		WelcomeMessagePage welcomeMessagePage = registerationPage.TestSuccessfulRegister();
		welcomeMessagePage.VerifyVisibilityAccountCreatedMessage();
		HomePage homePage = welcomeMessagePage.TestContinue();
		homePage.VerifyVisibiltyOfLoggedInMessage();
		DeletionMessagePage deletionMessagePage = homePage.deleteAccount();
		deletionMessagePage.VerifyVisibilityAccountDeletionMessage();
		deletionMessagePage.TestContinue();

	}
}