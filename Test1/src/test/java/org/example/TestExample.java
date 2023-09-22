package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;




public class TestExample extends DriverCC{

    @Test(priority=0)
    public void usernameInput() throws InterruptedException {
        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement user_SearchBox = driver.findElement(By.name("username"));
        user_SearchBox.sendKeys("Anisur Rahman");
        Thread.sleep(2000);

    }


    @Test(priority=1)
    public void passwordInput() throws InterruptedException {
        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement user_SearchBox = driver.findElement(By.id("password"));

        user_SearchBox.sendKeys("Password123");
        Thread.sleep(2000);

    }

    @Test(priority=2)
    public void testcase1() throws InterruptedException {
        driver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement user_SearchBox = driver.findElement(By.name("username"));
        user_SearchBox.sendKeys("student");

        WebElement user_passwordhBox = driver.findElement(By.id("password"));
        user_passwordhBox.sendKeys("Password123");


        WebElement submit = driver.findElement(By.className("btn"));
        submit.click();

        String current_ur = driver.getCurrentUrl();
        String page_url = "https://practicetestautomation.com/logged-in-successfully/";

        System.out.println("Test case 1: Positive LogIn test");
        System.out.println("-------------------------------------");
        if(current_ur.equals(page_url)){
            System.out.println("Url Matched!!!");
        }


        WebElement loginPage = driver.findElement(By.cssSelector("h1[class='post-title']"));

        if(loginPage.getText().equals("Logged In Successfully")){
            System.out.println("Text Matched!!!");
        }

        WebElement linktext = driver.findElement(By.linkText("Log out"));
        System.out.println("Log out Button Verified!!!");
        System.out.println("-------------------------------------");
        Thread.sleep(3000);

    }

    @Test(priority=3)
    public void testcase2() throws InterruptedException {
        driver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement user_SearchBox = driver.findElement(By.name("username"));
        user_SearchBox.sendKeys(" incorrectUser");

        WebElement user_passwordhBox = driver.findElement(By.id("password"));
        user_passwordhBox.sendKeys("Password123");


        WebElement submit = driver.findElement(By.className("btn"));
        submit.click();

        String current_url = driver.getCurrentUrl();


        System.out.println("Test case 2: Negative username test");
        System.out.println("-------------------------------------");

        WebElement errorMessage = driver.findElement(By.id("error"));
        Thread.sleep(1000);
        if(errorMessage.getText().equals("Your username is invalid!")){
            System.out.println("Error Message Displayed!!!");
            System.out.println("Text Matched!!!");
        }
        System.out.println("-------------------------------------");
        Thread.sleep(3000);

    }

    @Test(priority=4)
    public void testcase3() throws InterruptedException {
        driver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement user_SearchBox = driver.findElement(By.name("username"));
        user_SearchBox.sendKeys("student");

        WebElement user_passwordhBox = driver.findElement(By.id("password"));
        user_passwordhBox.sendKeys("incorrectPassowrd");


        WebElement submit = driver.findElement(By.className("btn"));
        submit.click();

        String current_url = driver.getCurrentUrl();


        System.out.println("Test case 3: Negative password test");
        System.out.println("-------------------------------------");


        WebElement errorMessage = driver.findElement(By.id("error"));
        Thread.sleep(1000);
        if(errorMessage.getText().equals("Your password is invalid!")){
            System.out.println("Error Message Displayed!!!");
            System.out.println("Text Matched!!!");
        }
        System.out.println("-------------------------------------");
        Thread.sleep(3000);

    }

    @Test(priority=5)
    public void linkText() throws InterruptedException {
        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement linktext = driver.findElement(By.linkText("HOME"));
        System.out.println(linktext.getText());
        linktext.click();
    }

    @Test(priority=6)
    public void dropdown() throws InterruptedException {

        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement linktext = driver.findElement(By.partialLinkText("HOM"));
        System.out.println(linktext.getText());
        linktext.click();
        Thread.sleep(2000);
    }
}
