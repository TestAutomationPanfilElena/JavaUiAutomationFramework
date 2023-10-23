package org.opencart.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.opencart.managers.DriverManager;

public class Hooks {
    static int counter = 0;

    @BeforeAll
    public static void beforeAllTheTestsAreExecuted() {
        System.out.println("The execution of features is started");

    }

    @Before
    public void beforeEachTest() {
        counter++;
        System.out.println("The Test [" + counter + " ] Started");
    }

    @After
    public void afterEachTest() {
        DriverManager.getInstance().quitTheDriver();
        System.out.println("The Test [" + counter + " ] Finished");
    }


    @AfterAll
    public static void afterAllTheTestsAreExecuted() {
        System.out.println("The execution of all the features is finished ");

    }
}

