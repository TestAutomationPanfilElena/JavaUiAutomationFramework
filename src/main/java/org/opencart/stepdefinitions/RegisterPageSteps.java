package org.opencart.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.opencart.managers.DataFakerManager;
import org.opencart.managers.DriverManager;
import org.opencart.pageobjects.RegisterPage;
import org.openqa.selenium.WebDriver;

public class RegisterPageSteps {


    WebDriver driver = DriverManager.getInstance().getDriver();
    RegisterPage registerPage = new RegisterPage(driver);

    @When("The Registration form is completed with valid random data")
    public void theRegistrationFormIsCompletedWithValidRandomData() {

        String firstName = DataFakerManager.getRandomName();

        String lastName = DataFakerManager.getRandomName();

        String email = DataFakerManager.getRandomEmail();

        String password = DataFakerManager.getRandomPassword(14, 20);

        registerPage.fillInTheRegisterForm(firstName, lastName, email, password);


    }

    @And("the privacyToggle is enabled")
    public void thePrivacyToggleIsEnabled() {

        registerPage.switchOnThePrivacyToggle(driver);


    }

    @And("ContinueButton is clicked")
    public void continuebuttonIsClicked() throws InterruptedException {
        registerPage.clickOnContinueButton();
    }
}