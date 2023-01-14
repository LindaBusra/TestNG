package techproed.tests.smoketest.logintests;

import com.github.javafaker.Faker;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.HomePage;
import techproed.pages.LoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.io.IOException;

public class Day19_NegativeLoginTest {

    /*
    Name:
    US100208_Negative_Login
    Description:
    User should not be able login with incorrect credentials
    Acceptance Criteria:
    As customer, I should not be able to log in the application
    Customer email: fake@bluerentalcars.com
    Customer password: fakepass
    Error: User with email fake@bluerentalcars.com not found

    •https://www.bluerentalcars.com/
     */

    HomePage homePage;
    LoginPage loginPage;

    Faker faker;

    @Test
    public void US100208_Negative_Login() throws IOException {

//        As customer, I should not be able to log in the application
        //going blue rental car home page
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));

//        click on home page login link
        homePage = new HomePage();
        loginPage= new LoginPage();
        ReusableMethods.waitFor(3);
        homePage.homePageLoginLink.click();

//        sending credentials and clicking on login button
        ReusableMethods.waitFor(3);
        loginPage.email.sendKeys("fake@bluerentalcars.com");
        ReusableMethods.waitFor(3);
        loginPage.password.sendKeys("fakepass");
        ReusableMethods.waitFor(3);
        loginPage.loginButton.click();
        ReusableMethods.waitFor(3);


//    Error: User with fake@bluerentalcars.com not found

       String errorMessage =  loginPage.errorMessage_incorrectEmailPass.getText();
       Assert.assertEquals(errorMessage,"User with email fake@bluerentalcars.com not found" );
       ReusableMethods.getScreenshot("NegativeLoginScreenshot");

        // if this error message is displyed or not,
//        ReusableMethods.waitForVisibility(loginPage.errorMessage,10);  // we can use this one also.

    }


    @Test
    public void invalidCredsTest() throws IOException {

//going blue rental car home page
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));

//        click on home page login link
        homePage = new HomePage();
        loginPage= new LoginPage();
        ReusableMethods.waitFor(3);
        homePage.homePageLoginLink.click();

//        sending credentials and clicking on login button
        ReusableMethods.waitFor(3);
        faker = new Faker();
        String fakeEmail = faker.internet().emailAddress();
        loginPage.email.sendKeys(fakeEmail);
        ReusableMethods.waitFor(3);
        loginPage.password.sendKeys(faker.internet().password(4,6));  //fake pass 4-6  digits
        ReusableMethods.waitFor(3);
        loginPage.loginButton.click();
        ReusableMethods.waitFor(3);


//    Error: User with fake@bluerentalcars.com not found

        String errorMessage =  loginPage.errorMessage_incorrectEmailPass.getText();
        Assert.assertEquals(errorMessage,"User with email "+ fakeEmail + " not found" );
        ReusableMethods.getScreenshot("NegativeLoginScreenshot");
        Driver.closeDriver();

        // if this error message is displyed or not,
//        ReusableMethods.waitForVisibility(loginPage.errorMessage,10);  // we can use this one also.

    }
}