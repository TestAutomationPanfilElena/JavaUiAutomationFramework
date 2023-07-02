package org.opencart.managers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

    private static String webDriverType = "Chrome";
    private static DriverManager instance;
    private WebDriver driver;

    DriverManager() {
        switch (webDriverType.toUpperCase()) {
            case "CHROME":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                System.out.println("The Chrome Driver was initiated!");
                break;

            case "FIREFOX":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                System.out.println("The FireFox Driver was initiated!");
                break;

            case "EDGE":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                System.out.println("The Edge Driver was initiated!");
                break;

            default:
                System.out.println("There is not defined such a driver + " + webDriverType);

        }
    }

    public static DriverManager getInstance() {
        if (instance == null) {
            instance = new DriverManager();

        }
        return instance;
    }

    public WebDriver getDriver() {
        if (driver == null) {
            DriverManager.getInstance();
        }
        return driver;
    }

}
