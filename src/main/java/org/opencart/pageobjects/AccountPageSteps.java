package org.opencart.pageobjects;

import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.opencart.managers.DriverManager;
import org.openqa.selenium.WebDriver;

public class AccountPageSteps {
    WebDriver driver = DriverManager.getInstance().getDriver();


    @Then("the new page url contains {string} keyword")
    public void theNewPageUrlContainsKeyword(String collectedStringValue) throws InterruptedException {
        Thread.sleep(1000);
        boolean urlContainsCollectString = driver.getCurrentUrl().contains(collectedStringValue);

        System.out.println(driver.getCurrentUrl());
        Assertions.assertTrue(urlContainsCollectString, "The" + collectedStringValue + "is present within the URL");

    }
}

