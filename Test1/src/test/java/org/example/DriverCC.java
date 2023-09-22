package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverCC {
    public WebDriver driver;
    @BeforeSuite
    public WebDriver setDriver(){
        driver = new ChromeDriver();
        return driver;
    }

    @AfterSuite
    public void driverClose(){
        driver.close();
    }

}
