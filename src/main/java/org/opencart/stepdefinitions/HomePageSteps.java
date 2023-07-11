package org.opencart.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.opencart.managers.DriverManager;
import org.opencart.pageobjects.HomePage;
import org.openqa.selenium.WebDriver;

public class HomePageSteps {
    WebDriver driver = DriverManager.getInstance().getDriver();
    HomePage homePage = new HomePage(driver);
    @Given("Home Page is accessed")
    public void homePageIsAccessed() {
        DriverManager.getInstance().getDriver().get("https://andreisecuqa.host/");
    }

    @And("RegisterPage is accessed from HomePage menu")
    public void registerpageIsAccessedFromHomePageMenu() {
        homePage.navigateToRegisterPageFromHeaderMenu();
    }
}
