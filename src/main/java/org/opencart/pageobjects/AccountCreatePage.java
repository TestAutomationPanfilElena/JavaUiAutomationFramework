package org.opencart.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreatePage {

    public class AccountCreatedPage extends Page {
        public AccountCreatedPage(WebDriver driver) {
            super(driver);
        }

        private WebElement logoutOption;
        @FindBy(xpath = "//a[normalize-space()='Logout']")
        private WebElement logOutOption;

        public void logoutFromTheAccount() {
            accountIcon.click();
            logOutOption.click();
            System.out.println("The user is logged out:");
        }
    }
}